package com.sy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sy.mapper")
public class Vuet4elementApplication {

    public static void main(String[] args) {
        SpringApplication.run(Vuet4elementApplication.class, args);
    }

}
