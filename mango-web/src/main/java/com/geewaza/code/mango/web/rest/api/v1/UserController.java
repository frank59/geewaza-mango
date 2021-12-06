package com.geewaza.code.mango.web.rest.api.v1;

import com.geewaza.code.mango.facade.response.ServiceResponse;
import com.geewaza.code.mango.facade.vo.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2021-12-02 01:14
 **/
@Api(tags = "服务器信息接口")
@RequestMapping("/api/v1/user")
public interface UserController {

    /**
     * 获取全部用户
     * @return
     */
    @GetMapping("/findAll")
    @ApiOperation("获取所有用户")
    ServiceResponse<List<UserVO>> findAll();

}
