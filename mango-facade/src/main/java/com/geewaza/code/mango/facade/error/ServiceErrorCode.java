package com.geewaza.code.mango.facade.error;

/**
 * code说明
 * 18 01 001
 * 共7位
 * 【18】 前两位表示系统   Geewaza服务
 * 【0】  错误等级        0-警告
 *                      1-异常
 *                      2-错误
 * 【01】 中间两位表示业务  00-通用
 *                      ...   先到先得
 * 【001】 具体错误编码
 *
 * @author wanwei
 */

public enum ServiceErrorCode implements ErrorCode {

    /**
     * LEVEL: WARNING
     */
    UNKNOWN_SERVER_WARNING(ErrorLevel.WARNING,1800001, "UNKNOWN_SERVER_WARNING", "业务发生未知的警告:{0}"),

    /**
     * LEVEL: EXCEPTION
     */
    UNKNOWN_SERVER_EXCEPTION(ErrorLevel.EXCEPTION,1810001, "UNKNOWN_SERVER_EXCEPTION", "业务发生未知的异常:{0}"),

    /**
     * LEVEL: ERROR
     */
    UNKNOWN_SERVER_ERROR(ErrorLevel.ERROR, 1820001,"UNKNOWN_SERVER_ERROR", "服务发生未知的错误:{0}"),


    ;


    //-------------- Enum structure --------------

    /**
     * level
     */
    private ErrorLevel level;

    /**
     * error code
     */
    private Integer code;

    /**
     * error name
     */
    private String name;

    /**
     * error message
     */
    private String message;

    ServiceErrorCode(ErrorLevel level, Integer code, String name, String message) {
        this.code = code;
        this.level = level;
        this.name = name;
        this.message = message;
    }

    /**
     * Gets the value of name.
     *
     * @return the value of name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Gets the value of message.
     *
     * @return the value of message
     */
    @Override
    public String getMessage() {
        return message;
    }

    /**
     * Gets the value of code.
     *
     * @return the value of code
     */
    public Integer getCode(){
        return code;
    }
}
