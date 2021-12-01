package com.geewaza.code.mango.repository.dao.auto.repository.impl;

import com.geewaza.code.mango.repository.dao.auto.entity.SysLogDO;
import com.geewaza.code.mango.repository.dao.auto.dao.SysLogMapper;
import com.geewaza.code.mango.repository.dao.auto.repository.SysLogRepository;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统操作日志 服务实现类
 * </p>
 *
 * @author wangheng
 * @since 2021-12-02
 */
@Service
public class SysLogRepositoryImpl extends ServiceImpl<SysLogMapper, SysLogDO> implements SysLogRepository {

}
