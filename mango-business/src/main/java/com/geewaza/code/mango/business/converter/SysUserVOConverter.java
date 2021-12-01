package com.geewaza.code.mango.business.converter;

import com.geewaza.code.mango.facade.vo.SysUserVO;
import com.geewaza.code.mango.repository.dao.auto.entity.SysUserDO;
import org.springframework.beans.BeanUtils;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2021-12-02 01:08
 **/
public class SysUserVOConverter {

    public static SysUserVO convert(SysUserDO sysUserDO) {
        SysUserVO sysUserVO = new SysUserVO();
        BeanUtils.copyProperties(sysUserDO, sysUserVO);
        return sysUserVO;
    }
}
