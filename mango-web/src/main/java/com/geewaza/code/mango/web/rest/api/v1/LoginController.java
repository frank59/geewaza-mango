package com.geewaza.code.mango.web.rest.api.v1;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p></p>
 *
 * @author ：wangheng
 * @date ：2021/12/7 0:54
 */
@Api(tags = "服务器信息接口")
@RequestMapping("/api/v1/login")
public interface LoginController {

    /**
     * 获取验证码图片
     */
    @GetMapping("/captcha.jpg")
    @ApiOperation("获取验证码图片")
    void captcha(HttpServletResponse response, HttpServletRequest request);

}
