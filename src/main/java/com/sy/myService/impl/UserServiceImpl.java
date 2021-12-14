package com.sy.myService.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sy.entity.UserInfo;
import com.sy.mapper.UserMapper;
import com.sy.myService.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserInfo> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserInfo> list(Wrapper<UserInfo> queryWrapper) {
        return userMapper.selectList(queryWrapper);
    }
}
