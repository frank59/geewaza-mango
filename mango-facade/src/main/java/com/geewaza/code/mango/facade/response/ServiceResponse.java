package com.geewaza.code.mango.facade.response;

import com.geewaza.code.mango.facade.error.ServiceErrorCode;
import com.geewaza.code.mango.facade.error.ServiceException;
import lombok.Data;

import java.text.MessageFormat;

/**
 * <p>service response bean</p>
 *
 * @author : wangheng
 * @date : 2020-10-29 11:28
 **/
@Data
public class ServiceResponse<T> {

    private static final long serialVersionUID = -3086753761613268869L;


    /**
     * 服务返回结果状态
     * 成功 {@link ResponseStatusEnum}.success
     * 失败 {@link ResponseStatusEnum}.failed
     * 异常 {@link ServiceErrorCode}.code
     */
    private String status;
    /**
     * 返回码 成功[200]
     */
    private Integer code;
    /**
     * 成功返回时为执行结果，返回失败时为错误信息或是空字段
     */
    private T result;

    /**
     * 成功返回时为{@link ResponseStatusEnum}的success字符串值
     * 失败时如果有失败信息则为失败信息，无信息则为null
     */
    private String message;

    /**
     * 请求返回的时间戳
     */
    private long timestamp;


    public ServiceResponse(Integer code, String status, T result, String message) {
        this.code = code;
        this.status = status;
        this.result = result;
        this.message = message;
        this.timestamp = System.currentTimeMillis();
    }


    public static <R> ServiceResponse<R> buildSuccess(R data) {
        return new ServiceResponse<>(
                ResponseStatusEnum.SUCCESS.getCode(), 
                ResponseStatusEnum.SUCCESS.getStatus(), 
                data,
                ResponseStatusEnum.SUCCESS.getStatus());
    }

    @SuppressWarnings("rawtypes")
    public static ServiceResponse buildFailedByException(Throwable e) {
        if (e instanceof ServiceException) {
            ServiceException serviceException = (ServiceException) e;
            return new ServiceResponse<>(
                    serviceException.getErrorCode().getCode(),
                    serviceException.getErrorCode().getName(),
                    null,
                    MessageFormat.format(serviceException.getErrorCode().getMessage(), serviceException.getMessage()));
        } else {
            return new ServiceResponse<>(
                    ServiceErrorCode.UNKNOWN_SERVER_ERROR.getCode(),
                    ServiceErrorCode.UNKNOWN_SERVER_ERROR.getName(),
                    null,
                    MessageFormat.format(ServiceErrorCode.UNKNOWN_SERVER_ERROR.getMessage(), e.getMessage()));
        }

    }
}
