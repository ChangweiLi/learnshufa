package com.scau.learnshufa.service;

import com.scau.learnshufa.entity.User;
import com.scau.learnshufa.mapper.UserMapper;

import java.util.List;

public class UserService implements UserMapper {


    @Override
    public int deleteByPrimaryKey(Long userId) {
        return 0;
    }

    @Override
    public int insert(User record) {
        return 0;
    }

    @Override
    public int insertSelective(User record) {
        return 0;
    }

    @Override
    public User selectByPrimaryKey(Long userId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return 0;
    }

    @Override
    public List<User> findAllUser() {
        return null;
    }
}
