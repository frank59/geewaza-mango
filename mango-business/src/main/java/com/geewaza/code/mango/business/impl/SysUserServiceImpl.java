package com.geewaza.code.mango.business.impl;

import com.geewaza.code.mango.business.converter.SysUserVOConverter;
import com.geewaza.code.mango.facade.SysUserService;
import com.geewaza.code.mango.facade.vo.SysUserVO;
import com.geewaza.code.mango.repository.dao.auto.repository.SysUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2021-12-02 01:01
 **/
@Service
public class SysUserServiceImpl implements SysUserService {

    private final SysUserRepository sysUserRepository;

    public SysUserServiceImpl(SysUserRepository sysUserRepository) {
        this.sysUserRepository = sysUserRepository;
    }

    /**
     * 获取全部用户的接口
     *
     * @return
     */
    @Override
    public List<SysUserVO> findAll() {
        return sysUserRepository.list().stream().map(SysUserVOConverter::convert).collect(Collectors.toList());
    }
}
