package com.fourth.ykd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YkdProjectApplication {

    // 创建日志对象
    private static final Logger log =
            LoggerFactory.getLogger(YkdProjectApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(YkdProjectApplication.class, args);

        log.info("==========");
        log.info("Spring Boot 启动成功！");
        log.info("==========");
    }
}