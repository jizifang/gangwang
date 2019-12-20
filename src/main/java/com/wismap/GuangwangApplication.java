package com.wismap;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.wismap.mapper")
@ComponentScan(basePackages = {"com.wismap"})
public class GuangwangApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuangwangApplication.class, args);
    }

}
