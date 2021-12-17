package com.hooli.spi;

import java.net.URL;
import java.util.Enumeration;

public class Test {
    public static void main(String[] args) throws Exception{
        // Array.class的完成路径
        String name = "java/sql/Array.class";
        Enumeration<URL> urls = Thread.currentThread().getContextClassLoader().getResources(name);
        while(urls.hasMoreElements()){
            URL url = urls.nextElement();
            System.out.println(url.toString());
        }
    }

}
