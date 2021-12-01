package com.geewaza.code.mango.facade.response;

/**
 * <p>response status</p>
 *
 * @author : wangheng
 * @date : 2020-10-29 11:30
 **/
public enum ResponseStatusEnum {
    /**
     * 服务返回状态 只有成功（success）和失败（failed）
     */
    SUCCESS(200,"success"),
    FAILED(500,"failed");

    /**
     * 状态码
     */
    private Integer code;
    /**
     * 状态
     */
    private String status;

    ResponseStatusEnum(Integer code, String status) {
        this.code = code;
        this.status = status;
    }

    /**
     * Gets the value of status.
     *
     * @return the value of status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Gets the value of code.
     *
     * @return the value of code
     */
    public Integer getCode() {
        return code;
    }
}
