package com.test.runner;

import com.test.dao.UserDao;
import com.test.enums.UserStatusEnum;
import com.test.po.User;
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
        userDao.deleteAll();
        System.out.println(userDao.findAll());
        for (Long i = 1L; i <= 10; i++) {
            userDao.insert(User.builder()
                    .id(i).name("name-" + i)
                    .status(UserStatusEnum.INIT).build());
        }
        System.out.println(userDao.findAll());
        System.out.println(userDao.findById(2L));
    }
}
