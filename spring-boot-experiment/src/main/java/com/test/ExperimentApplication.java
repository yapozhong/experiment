package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class ExperimentApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExperimentApplication.class, args);
    }
}
