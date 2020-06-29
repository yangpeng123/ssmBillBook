package com.xxx.billbook;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.xxx.billbook.dao")
@SpringBootApplication
public class BillbookApplication {

    public static void main(String[] args) {
        SpringApplication.run(BillbookApplication.class, args);
    }

}
