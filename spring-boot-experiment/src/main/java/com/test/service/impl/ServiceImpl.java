package com.test.service.impl;

import com.test.properties.Project;
import com.test.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements Iservice {
    @Autowired
    private Project project;

    @Override
    @Async
    public void domain() {
        System.out.println(Thread.currentThread());
        System.out.println(project);
    }
}
