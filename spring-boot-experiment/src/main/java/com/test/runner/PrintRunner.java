package com.test.runner;

import com.test.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class PrintRunner implements ApplicationRunner {
    @Autowired
    Iservice iservice;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println(Thread.currentThread());
        iservice.domain();
    }
}
