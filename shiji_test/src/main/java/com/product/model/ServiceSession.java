package com.product.model;

/**
 * 服务Session信息
 */
public class ServiceSession {
    protected long ent_id;
    protected long user_id;
    protected String user_name;
    protected String locale;
    protected String api_version;
    protected String user_code;
    // 渠道编码
    protected String channelCode;
    // 履约门店
    protected String diliveryShopCode;
    // 作业门店
    protected String workShopCode;
    protected long shop_id;
    protected String shop_code;
    protected String shop_name;
    protected String trace_id;
    // 企业编码
    protected String entCode;
    // 应用编码
    protected String appCode;
    // 用户岗位ID
    protected long stationId;
    protected String stationName;
    // 角色ID
    protected long roleId;
    // 数据范围ID
    protected long dataRangeId;

    // 加密信息 钱海斌 2021-05-10
    // 密钥偏移量
    protected String encrytKey;
    // 密钥
    protected String ivparamter;
    // 字符编码方式
    protected String encodingformat;
    // 帐号类型
    protected Integer accountType;
    // 授权用户ID
    protected long grantUID;
    // 上次登陆时间
    protected String lastLoginTime;

    public long getEnt_id() {
        return ent_id;
    }

    public void setEnt_id(long ent_id) {
        this.ent_id = ent_id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getApi_version() {
        return api_version;
    }

    public void setApi_version(String api_version) {
        this.api_version = api_version;
    }

    public String getUser_code() {
        return user_code;
    }

    public void setUser_code(String user_code) {
        this.user_code = user_code;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getDiliveryShopCode() {
        return diliveryShopCode;
    }

    public void setDiliveryShopCode(String diliveryShopCode) {
        this.diliveryShopCode = diliveryShopCode;
    }

    public String getWorkShopCode() {
        return workShopCode;
    }

    public void setWorkShopCode(String workShopCode) {
        this.workShopCode = workShopCode;
    }

    public long getShop_id() {
        return shop_id;
    }

    public void setShop_id(long shop_id) {
        this.shop_id = shop_id;
    }

    public String getShop_code() {
        return shop_code;
    }

    public void setShop_code(String shop_code) {
        this.shop_code = shop_code;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public String getTrace_id() {
        return trace_id;
    }

    public void setTrace_id(String trace_id) {
        this.trace_id = trace_id;
    }

    public String getEntCode() {
        return entCode;
    }

    public void setEntCode(String entCode) {
        this.entCode = entCode;
    }

    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    public long getStationId() {
        return stationId;
    }

    public void setStationId(long stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public long getDataRangeId() {
        return dataRangeId;
    }

    public void setDataRangeId(long dataRangeId) {
        this.dataRangeId = dataRangeId;
    }

    public String getEncrytKey() {
        return encrytKey;
    }

    public void setEncrytKey(String encrytKey) {
        this.encrytKey = encrytKey;
    }

    public String getIvparamter() {
        return ivparamter;
    }

    public void setIvparamter(String ivparamter) {
        this.ivparamter = ivparamter;
    }

    public String getEncodingformat() {
        return encodingformat;
    }

    public void setEncodingformat(String encodingformat) {
        this.encodingformat = encodingformat;
    }

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public long getGrantUID() {
        return grantUID;
    }

    public void setGrantUID(long grantUID) {
        this.grantUID = grantUID;
    }

    public String getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(String lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
}
