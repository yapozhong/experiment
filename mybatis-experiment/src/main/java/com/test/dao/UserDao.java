package com.test.dao;

import com.test.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserDao {
    User findById(Long id);
}
