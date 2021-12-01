package com.geewaza.code.mango.repository.dao.auto.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangheng
 * @date Create in 2021/3/1 0001
 */
@Configuration
@ComponentScan(basePackages = "com.geewaza.code.mango.repository.dao")
@MapperScan({"com.geewaza.code.mango.repository.dao.*.dao"})
public class DataSourceConfig {



}