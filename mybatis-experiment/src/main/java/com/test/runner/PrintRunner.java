package com.test.runner;

import com.test.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class PrintRunner implements ApplicationRunner {
    @Autowired
    private UserDao userDao;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println(userDao.findById(1L));
    }
}
