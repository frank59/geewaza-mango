package com.geewaza.code.mango.repository.config;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

/**
 * <p></p>
 *
 * @author ：wangheng
 * @date ：2021/12/7 0:10
 */
@Slf4j
@Configuration
public class KaptchaConfig {

    @Value("${kaptcha.file}")
    private final String fileName = "kaptcha.properties";

    @Bean(value = "kaptcha")
    public DefaultKaptcha kaptcha() {
        DefaultKaptcha captchaProducer = new DefaultKaptcha();
        Properties properties = getProperties();
        Config config = new Config(properties);
        captchaProducer.setConfig(config);
        return captchaProducer;
    }

    private Properties getProperties() {
        URL url = this.getClass().getResource("/" + fileName);
        if (null != url) {
            Properties properties = new Properties();
            try {
                properties.load(this.getClass().getResourceAsStream("/" + fileName));
                log.info("加载Kaptcha配置文件：{}", url.getFile());
                return properties;
            } catch (IOException e) {
                log.error(e.getMessage(), e);
            }
        }
        log.info("加载Kaptcha默认配置");
        Properties properties = new Properties();
        properties.setProperty("kaptcha.border", "yes");
        properties.setProperty("kaptcha.border.color", "105,179,90");
        properties.setProperty("kaptcha.textproducer.font.color", "blue");
        properties.setProperty("kaptcha.image.width", "110");
        properties.setProperty("kaptcha.image.height", "40");
        properties.setProperty("kaptcha.textproducer.font.size", "30");
        properties.setProperty("kaptcha.session.key", "code");
        properties.setProperty("kaptcha.textproducer.char.length", "4");
        properties.setProperty("kaptcha.textproducer.font.names", "宋体,楷体,微软雅黑");
        return properties;
    }
}
