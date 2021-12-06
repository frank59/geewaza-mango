package com.geewaza.code.mango.facade.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2021-12-02 00:56
 **/
@Data
public class UserVO implements Serializable {


    private static final long serialVersionUID = 3053108719409768182L;
    /**
     * 编号
     */
    @ApiModelProperty("编号")
    private Long id;

    /**
     * 用户名
     */
    @ApiModelProperty("用户名")
    private String name;

    /**
     * 昵称
     */
    @ApiModelProperty("昵称")
    private String nickName;

    /**
     * 头像
     */
    @ApiModelProperty("头像")
    private String avatar;

    /**
     * 密码
     */
    @ApiModelProperty("密码")
    private String password;

    /**
     * 加密盐
     */
    @ApiModelProperty("加密盐")
    private String salt;

    /**
     * 邮箱
     */
    @ApiModelProperty("邮箱")
    private String email;

    /**
     * 手机号
     */
    @ApiModelProperty("手机号")
    private String mobile;

    /**
     * 状态  0：禁用   1：正常
     */
    @ApiModelProperty("状态")
    private Integer status;

    /**
     * 机构ID
     */
    @ApiModelProperty("机构ID")
    private Long deptId;

    /**
     * 创建人
     */
    @ApiModelProperty("创建人")
    private String createBy;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    /**
     * 更新人
     */
    @ApiModelProperty("更新人")
    private String lastUpdateBy;

    /**
     * 更新时间
     */
    @ApiModelProperty("更新时间")
    private LocalDateTime lastUpdateTime;

    /**
     * 是否删除  -1：已删除  0：正常
     */
    @ApiModelProperty("是否删除")
    private Integer delFlag;

}
