package com.zan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.zan.mapper")
public class FinancialReimbursementApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinancialReimbursementApplication.class, args);
    }

}
