package com.shiji.core.service;

import com.alibaba.fastjson.JSONObject;
import com.product.model.ServiceResponse;
import com.product.model.ServiceSession;
import netscape.javascript.JSObject;

import java.util.List;

public interface BaseCompomentHandler {
    String getCollctionName();
    String getKeyfieldName();
    String getBusinessIdentify();

    <T> T dataQueryFirst(ServiceSession session, JSObject paramsObject);
    <T> T dataQueryFirst(ServiceSession session, JSObject paramsObject, Class<T> classzz);
    <T> T dataQueryFirst(ServiceSession session, JSONObject paramsObject,String collectionName,Class<T> classzz);

    <T> List<T> dataQuery(ServiceSession session, JSONObject paramsObject);
    <T> List<T> dataQuery(ServiceSession session, JSONObject paramsObject, Class<T> classzz);
    <T> List<T> dataQuery(ServiceSession session, JSONObject paramsObject, String collectionName, Class<T> classzz);

    ServiceResponse onInsert(ServiceSession session, JSONObject paramsObject);
    ServiceResponse onDelete(ServiceSession session, JSONObject paramsObject);
    ServiceResponse onUpdate(ServiceSession session, JSONObject paramsObject);
    ServiceResponse onQuery(ServiceSession session, JSONObject paramsObject);
    ServiceResponse onSave(ServiceSession session, JSONObject paramsObject);
}
