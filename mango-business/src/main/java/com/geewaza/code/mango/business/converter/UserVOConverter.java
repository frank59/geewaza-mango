package com.geewaza.code.mango.business.converter;

import com.geewaza.code.mango.facade.vo.UserVO;
import com.geewaza.code.mango.repository.dao.auto.entity.SysUserDO;
import org.springframework.beans.BeanUtils;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2021-12-02 01:08
 **/
public class UserVOConverter {

    public static UserVO convert(SysUserDO sysUserDO) {
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(sysUserDO, userVO);
        return userVO;
    }
}
