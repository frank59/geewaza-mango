package com.geewaza.code.mango.web.rest.api.v1.impl;

import com.geewaza.code.mango.facade.UserService;
import com.geewaza.code.mango.facade.response.ServiceResponse;
import com.geewaza.code.mango.facade.vo.UserVO;
import com.geewaza.code.mango.web.rest.api.v1.UserController;
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
public class UserControllerImpl implements UserController {

    private final UserService userService;

    public UserControllerImpl(UserService userService) {
        this.userService = userService;
    }

    /**
     * 获取全部用户
     *
     * @return
     */
    @Override
    public ServiceResponse<List<UserVO>> findAll() {
        return new ServiceProcessTemplate<List<UserVO>>() {

            /**
             * 业务逻辑
             *
             * @return 业务结果
             * @throws Exception 业务异常
             */
            @Override
            public List<UserVO> doService() throws Exception {
                return userService.findAll();
            }
        }.process();
    }
}
