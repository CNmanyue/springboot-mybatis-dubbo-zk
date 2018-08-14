package com.zhouxw.provider.dao;

import com.zhouxw.domain.User;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectByExample(User user);

}