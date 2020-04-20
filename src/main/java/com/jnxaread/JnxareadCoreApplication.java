package com.jnxaread;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jnxaread.dao")
public class JnxareadCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(JnxareadCoreApplication.class, args);
    }

}
