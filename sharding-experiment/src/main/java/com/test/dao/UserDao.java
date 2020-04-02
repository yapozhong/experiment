package com.test.dao;

import com.test.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserDao {
    User findById(Long id);
    List<User> findAll();
    int insert(User user);
    int deleteAll();
}
