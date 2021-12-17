package com.product.language;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ResourceBundleMessageSource;

public class MessageSourceHelper {
    private static final Logger loggerMsg = LoggerFactory.getLogger("messageHelperLogger");

    private ResourceBundleMessageSource messageSource;

    public static MessageSourceHelper getDefault(){

    }

    public static String getMessage(String code,String locale,Object... args){

    }
}
