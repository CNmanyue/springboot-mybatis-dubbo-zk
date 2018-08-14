package com.zhouxw.service;


import com.zhouxw.domain.User;

import java.util.List;

public interface IUserService {

    int saveUser(User user);

    User getUser(Integer id);

    List<User> findUser(User user);

}
