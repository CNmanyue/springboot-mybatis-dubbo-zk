package com.zhouxw.provider.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.zhouxw.domain.User;
import com.zhouxw.provider.dao.UserMapper;
import com.zhouxw.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(
        version = "${service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int saveUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public User getUser(Integer integer) {
        return userMapper.selectByPrimaryKey(integer);
    }

    @Override
    public List<User> findUser(User user) {
        return userMapper.selectByExample(user);
    }
}
