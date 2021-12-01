package com.geewaza.code.mango.web.rest.api.v1.impl;

import com.geewaza.code.mango.facade.SysUserService;
import com.geewaza.code.mango.facade.response.ServiceResponse;
import com.geewaza.code.mango.facade.vo.SysUserVO;
import com.geewaza.code.mango.web.rest.api.v1.SysUserController;
import com.geewaza.code.mango.web.rest.common.ServiceProcessTemplate;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2021-12-02 01:16
 **/
@RestController
public class SysUserControllerImpl implements SysUserController {

    private final SysUserService sysUserService;

    public SysUserControllerImpl(SysUserService sysUserService) {
        this.sysUserService = sysUserService;
    }

    /**
     * 获取全部用户
     *
     * @return
     */
    @Override
    public ServiceResponse<List<SysUserVO>> findAll() {
        return new ServiceProcessTemplate<List<SysUserVO>>() {

            /**
             * 业务逻辑
             *
             * @return 业务结果
             * @throws Exception 业务异常
             */
            @Override
            public List<SysUserVO> doService() throws Exception {
                return sysUserService.findAll();
            }
        }.process();
    }
}
