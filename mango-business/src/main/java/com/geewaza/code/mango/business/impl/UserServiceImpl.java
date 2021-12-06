package com.geewaza.code.mango.business.impl;

import com.geewaza.code.mango.business.converter.UserVOConverter;
import com.geewaza.code.mango.facade.UserService;
import com.geewaza.code.mango.facade.vo.UserVO;
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
public class UserServiceImpl implements UserService {

    private final SysUserRepository sysUserRepository;

    public UserServiceImpl(SysUserRepository sysUserRepository) {
        this.sysUserRepository = sysUserRepository;
    }

    /**
     * 获取全部用户的接口
     *
     * @return
     */
    @Override
    public List<UserVO> findAll() {
        return sysUserRepository.list().stream().map(UserVOConverter::convert).collect(Collectors.toList());
    }
}
