package com.dh.sc.user.service.impl;

import com.dh.sc.user.bean.UmsMember;
import com.dh.sc.user.mapper.UserMapper;
import com.dh.sc.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsNumberList = userMapper.selectAll(); //userMapper.selectAllUser();

        return null;
    }
}
