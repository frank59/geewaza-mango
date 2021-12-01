package com.geewaza.code.mango.repository.dao.auto.repository.impl;

import com.geewaza.code.mango.repository.dao.auto.entity.SysUserDO;
import com.geewaza.code.mango.repository.dao.auto.dao.SysUserMapper;
import com.geewaza.code.mango.repository.dao.auto.repository.SysUserRepository;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户管理 服务实现类
 * </p>
 *
 * @author wangheng
 * @since 2021-12-02
 */
@Service
public class SysUserRepositoryImpl extends ServiceImpl<SysUserMapper, SysUserDO> implements SysUserRepository {

}
