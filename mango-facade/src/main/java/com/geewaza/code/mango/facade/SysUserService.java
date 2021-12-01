package com.geewaza.code.mango.facade;

import com.geewaza.code.mango.facade.vo.SysUserVO;

import java.util.List;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2021-12-02 00:55
 **/
public interface SysUserService {

    /**
     * 获取全部用户的接口
     * @return
     */
    List<SysUserVO> findAll();
}
