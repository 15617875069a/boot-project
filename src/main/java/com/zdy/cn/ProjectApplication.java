package com.zdy.cn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(basePackages = "com.zdy.cn.mapper")
@EnableTransactionManagement
public class ProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProjectApplication.class);
    }
}
