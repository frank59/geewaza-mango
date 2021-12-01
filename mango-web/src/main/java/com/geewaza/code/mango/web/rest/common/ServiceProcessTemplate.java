package com.geewaza.code.mango.web.rest.common;

import com.geewaza.code.mango.facade.response.ServiceResponse;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>controller process template</p>
 *
 * @author : wangheng
 * @date : 2020-10-29 15:01
 **/
@Slf4j
public abstract class ServiceProcessTemplate<T> {

    /**
     * 执行模板
     * @return  response
     */
    @SuppressWarnings("unchecked")
    public final ServiceResponse<T> process() {
        try {
            //数据验证
            validate();
            //执行逻辑
            return ServiceResponse.buildSuccess(doService());
        } catch (Throwable e) {
            log.error(e.getMessage(), e);
            return ServiceResponse.buildFailedByException(e);
        }
    }

    /**
     * 若需要验证，则可以重写该方法
     */
    public void validate() throws RuntimeException {
    }

    /**
     * 业务逻辑
     * @return  业务结果
     * @throws Exception 业务异常
     */
    public abstract T doService() throws Exception;

}