package com.geewaza.code.mango.facade.error;

/**
 * <p>业务异常类</p>
 *
 * @author : wangheng
 * @date : 2020-10-29 11:07
 **/
public class ServiceException extends RuntimeException {

    private static final long serialVersionUID = 7374780870097781661L;
    /**
     * 异常信息
     */
    private ServiceErrorCode errorCode;

    public ServiceException(ServiceErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public ServiceException(ServiceErrorCode errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public ServiceException(ServiceErrorCode errorCode, Throwable cause) {
        super(cause);
        this.errorCode = errorCode;
    }

    public ServiceException(ServiceErrorCode errorCode, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public ServiceException(ServiceErrorCode errorCode, String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.errorCode = errorCode;
    }

    /**
     * Gets the value of errorCode.
     *
     * @return the value of errorCode
     */
    public ServiceErrorCode getErrorCode() {
        return errorCode;
    }
}
