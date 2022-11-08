package com.xxx.server;

import org.mapstruct.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xxx.server.mapper")
public class YebApplicattion {
    public static void main(String[] args){
        SpringApplication.run(YebApplicattion.class,args);
    }
}
