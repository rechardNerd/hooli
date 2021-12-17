package com.hooli.spi;
//https://www.jianshu.com/p/0d196ad23915
public class LoadClass {
/**
    protected Class<?> loadClass(String name, boolean resolve){
        synchronized(getClassLoadingLock(name)){
            // 首先，检查该类是否已经被加载，如果从jvm缓存中找到该类，则直接返回
            Class<?> c= findLoadedClass(name);
            if (c == null){
                try{
                    // 遵循双亲委派模型，首先会通过递归从父加载器开始找，
                    // 知道父加载器是BootstrapClassLoader为止
                    if (parent != null){
                        c = parent.loadClass(name, false);
                    } else{
                        c = findBootstrapClassOrNull(name);
                    }
                }catch (ClassNotFoundException e){}

                if(c== null){
                    // 如果还找不到，尝试通过findClass方法去寻找
                    // findClass是留给开发者自己实现的，也就是说
                    // 自定义类加载时，重写此方法即可
                    c = findClass(name);
                }

            }

            if(resolve){
                resolveClass(c);
            }
            return c;
        }
    }*/
}
