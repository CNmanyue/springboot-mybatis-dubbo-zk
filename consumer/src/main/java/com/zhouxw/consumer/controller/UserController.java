package com.zhouxw.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhouxw.domain.User;
import com.zhouxw.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Reference(version = "${service.version}",
            application = "${dubbo.application.id}",
//            url = "dubbo://localhost:12345")  // url：通过指定服务提供方的 URL 地址直接绕过注册中心发起调用
            registry = "zookeeper")
    private IUserService userService;

    @RequestMapping("find-user.api")
    public Object findUser(@ModelAttribute User user, HttpServletRequest request) {
        LOGGER.info("request input:{}", user.toString());
        return userService.findUser(user);

    }
}
