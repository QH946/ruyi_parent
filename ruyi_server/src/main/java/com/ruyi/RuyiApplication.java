package com.ruyi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableCaching //开启注解缓存
@EnableScheduling//开启任务调度
@Slf4j
public class RuyiApplication {
    public static void main(String[] args) {
        SpringApplication.run(RuyiApplication.class, args);
        log.info("server started");
    }
}
