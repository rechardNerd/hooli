package com.product.model;

import com.product.language.MessageSourceHelper;

import java.util.Locale;

/**
 * 亮
 * api 应答
 */
public class ServiceResponse {
    String returncode;
    Object data;

    public String getReturncode() {
        return returncode;
    }

    public void setReturncode(String returncode) {
        this.returncode = returncode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static ServiceResponse buildSuccess(Object obj){
        ServiceResponse response = new ServiceResponse();
        response.setReturncode(ResponseCode.SUCCESS);
        response.setData(obj);
        return response;
    }

    public static ServiceResponse buildFailure(ServiceSession session, String returncode){
        return buildFailure(session, returncode, null);
    }

    public static ServiceResponse buildFailure(ServiceSession session, String returncode, String formatmsg, Object... args){
        ServiceResponse response = new ServiceResponse();
        response.setReturncode(returncode);
        response.setData(MessageSourceHelper.getDefault().getMessage(returncode, formatmsg,
                session != null && session.getLocale() !=null ? new Locale(session.getLocale()):null,args));
        return response;
    }
}
