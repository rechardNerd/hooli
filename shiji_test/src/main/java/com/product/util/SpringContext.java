package com.product.util;

import com.alibaba.fastjson.serializer.SerializeConfig;
import com.prodict.fastjson.serializer.Jdk8DateSerializer;
import com.product.model.ServiceSession;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.boot.context.properties.source.ConfigurationPropertySources;
import org.springframework.cloud.commons.util.InetUtils;
import org.springframework.cloud.commons.util.InetUtilsProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class SpringContext {
    private static final ThreadLocal<ServiceSession> sessionThreadLocal = new InheritableThreadLocal<>();
    private static final ThreadLocal<Integer> pagenoThreadLocal = new InheritableThreadLocal<>();
    private static final ThreadLocal<Integer> pagesizeThreadLocal = new InheritableThreadLocal<>();

    public static ServiceSession getSession(){
        return sessionThreadLocal.get();
    }

    public static void putSession(ServiceSession session){
        sessionThreadLocal.set(session);
    }

    public static void removeSession(){
        sessionThreadLocal.remove();
    }

    public static Integer getPageSize(){
        return pagesizeThreadLocal.get();
    }

    public static void putPageSize(int pageSize){
        pagesizeThreadLocal.set(pageSize);
    }

    public static void removePageSize(){
        pagenoThreadLocal.remove();
    }

    // 通过 BeanFactory 接口创建实例
    static ConfigurableApplicationContext context = null;

    static String applicationName;

    static String uniqueKey;

    static String eurekaValue;

    static String dataSourcekey;

    static String redisKey;

    static String eurekaKey;

    public static ConfigurableApplicationContext run(Class<?> primarySource, String... args){
        SpringApplication application = new SpringApplication(primarySource);

        SerializeConfig.getGlobalInstance().put(LocalDateTime.class, new Jdk8DateSerializer());
        SerializeConfig.getGlobalInstance().put(LocalDate.class, new Jdk8DateSerializer());
        //ParserConfig.getGlobalInstance().putDeserializer(LocalDateTime.class, new Jdk8DateDeserializer());
        //ParserConfig.getGlobalInstance().putDeserializer(LocalDate.class, new Jdk8DateDeserializer());

        //JSON.DEFAULT_GENERATE_FEATURE |= SerializerFeature.DisableCircularReferenceDetect.getMask();
        context = application.run(args);

        ConfigurableEnvironment environment = context.getEnvironment();
        MutablePropertySources mutablePropertySources = environment.getPropertySources();

        Map<String,String> dataSourceMap = new HashMap<>();
        Map<String,String> redisMap = new HashMap<>();

        mutablePropertySources.stream().forEach((propertySource) -> {
            if(propertySource.getName().indexOf("application.properties")!=-1){
                @SuppressWarnings("uncheckd")
                Map<String,Object> map = (Map<String, Object>)propertySource.getSource();
                map.forEach((k,v) -> {
                    if(k.equals("spring.application.name")){
                        applicationName = v.toString();
                    }
                    if(k.indexOf("datasource") != -1){
                        if(v.toString().indexOf("$") != -1) {
                            dataSourceMap.put(k, environment.resolvePlaceholders(v.toString()));
                        }
                    }
                    if(k.indexOf("redis") != -1){
                        if (v.toString().indexOf("$") != -1){
                            redisMap.put(k, environment.resolvePlaceholders(v.toString()));
                        }else{
                            redisMap.put(k, v.toString());
                        }
                    }

                    if (k.indexOf("defaultZone") != -1){
                        eurekaValue = environment.resolvePlaceholders(v.toString());
                    }

                });
            }
        });

        StringRedisTemplate stringRedisTemplate = context.getBean(StringRedisTemplate.class);
        InetUtils.HostInfo hostInfo = getFirstNonLoopbackHostInfo(environment);

        uniqueKey = new StringBuffer("properties:").append(applicationName).append(":").append(hostInfo.getIpAddress()).toString();
        String key = new StringBuffer(uniqueKey).append(":").toString();
        dataSourcekey = new StringBuffer(key).append("db").toString();
        redisKey = new StringBuffer(key).append("redis").toString();
        eurekaKey = new StringBuffer(key).append("eureka").toString();

        stringRedisTemplate.opsForHash().putAll(dataSourcekey,dataSourceMap);
        stringRedisTemplate.opsForHash().putAll(redisKey, redisMap);
        if (!StringUtils.isEmpty(eurekaValue)){
            stringRedisTemplate.opsForValue().set(eurekaKey,eurekaValue);
        }
        return context;
    }


    public static InetUtils.HostInfo getFirstNonLoopbackHostInfo(ConfigurableEnvironment environment){
        InetUtilsProperties target = new InetUtilsProperties();
        ConfigurationPropertySources.attach(environment);
        Binder.get(environment).bind(InetUtilsProperties.PREFIX, Bindable.ofInstance(target));
        try (InetUtils utils = new InetUtils(target)){
            return utils.findFirstNonLoopbackHostInfo();
        }
    }

    // 获取当前环境
    public static String getActiveProfile(){
        if (context == null || context.getEnvironment() == null) return "";
        String[] activeProfiles = context.getEnvironment().getActiveProfiles();
        if (activeProfiles.length == 0){
            return "default";
        } else{
            return context.getEnvironment().getActiveProfiles()[0];
        }
    }

    // 获取Environment
    public static ConfigurableEnvironment getEnvironment(){
        if (context != null) return context.getEnvironment();
        return null;
    }

    public static HttpServletRequest getRequest(){
        ServletRequestAttributes ra = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = ra.getRequest();
        return request;
    }
}
