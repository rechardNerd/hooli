package com.product.model;

/**
 * @AUTHOR 亮
 */
public interface ResponseCode {
    final String SUCCESS = "0";
    final String FAILURE = "10000";
    final String EXCEPTION = "50000";
    final String TOKEN_INVALID = "10502";
    final String FAIL_VERIFICATION = "50008";               // 校验错误（FAILURE和EXCEPTION会拼接）

    interface Exception
    {
        final String SESSION_IS_EMPTY = "50001";        // Session为空
        final String ENDID_IS_EMPTY = "50002";          // 企业ID为空
        final String PARAM_IS_EMPTY = "50003";          // 参数为空
        final String SPECDATA_IS_EMPTY = "50004";       // 指定数据为空
        final String NOT_EXIST_MATCHED = "50005";       // 主键为空
        final String PRIMAY_IS_ERROR = "50007";         // 参数格式错误
    }

    interface Failure
    {
        final String ALREADY_EXISTS = "10001";          // 数据已存在
        final String ALREADY_PUBLISH = "10002";         // 数据已发布
        final String NO_EXIST = "10003";                // 数据不存在
        final String BE_USE = "10004";                  // 数据被使用
        final String DEPENDENCY_IS_ILLEGAL = "10005";   // 依赖KEY无效
        final String DEPENDENCY_NOT_EXIST = "10006";    // 依赖数据不存在
        final String IS_PARENT = "10007";               // 父数据不能删除
        final String IS_NOT_LAST = "10008";             // 不是末级数据
        final String PROPERTY_MUST_SET = "10009";       // 品类属性必须设置
        final String PROPERTY_VALUE_INVALID = "10010";  // 品类属性无效
        final String FAIL_UPDATE = "10011";             // 更新失败
        final String FAIL_INSERT = "10012";             // 插入失败
        final String FAIL_DELETE = "10013";             // 删除失败
    }

    interface NetException
    {
        final String UNSUPPORTED_ENCODING_EXCEPTION = "60001";  // 远程请求转码异常
        final String CLIENT_PROTOCOL_EXECPTION = "60002";       // 客户端提交给服务器的请求，不复合HTTP协议
        final String NETWORK_IO_EXCEPTION = "60003";            // 网络IO异常
        final String RESPONSE_STATE_EXCEPTON = "60004";         // 远程请求状态异常
        final String RESPONSE_DATA_EXCEPTION = "60005";         // 远程请求状态异常
    }
}
