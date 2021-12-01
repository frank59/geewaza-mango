package com.geewaza.code.mango;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Arrays;

/**
 * <p>main class</p>
 *
 * @author : wangheng
 * @date : 2021-12-01 23:11
 **/
@SpringBootApplication
@EnableScheduling
@Slf4j
public class MangoApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(MangoApplication.class);
        Environment env = springApplication.run(args).getEnvironment();
        log.info("Platform biz modules server has started : {}, CPU core : {}"
                , Arrays.toString(env.getActiveProfiles()), Runtime.getRuntime().availableProcessors());
    }
}
