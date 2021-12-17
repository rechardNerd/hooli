AOP 面向切面，它能克服那些只有单继承特性语言的特点（如java），AOP具体实现有以下几个项目：
AspectJ(TM):创建于Xero PARC.有近十年历史，成熟
缺点：过于复杂；破坏封装；需要专门的Java解释器
动态AOP：使用JDK的动态代理API或字节码Bytecode处理计数
基于动态代理API的具体项目有：
JBOSS4.0 JBoss服务器
基于字节码的项目有
aspectwerkz, spring

AOP概念
相关术语
Target      目标类
Proxy       代理
Joinpoint   连接点
Pointcut    切点
Advice      增强
Advisor     切面
Weaving     织入
Introduction    引入

增强类型
before advice       前置增强
after advice        后置增强
around advice       环绕增强
throws advice       抛出增强
introduction advice 引入增强

方案
写死代码
静态代理
动态代理  1.jdk动态代理  2.cglib动态代理
Sprint AOP 
    1.编程式（基于AOP接口）
    2.声明式 
        a.手动代理
        b.自动代理
            （1）扫描Bean名称
            （2）扫描切面配置
Spring + AspectJ
    1.基于注解（基于@Aspect）
    2.基于配置(基于<aop:config>)

