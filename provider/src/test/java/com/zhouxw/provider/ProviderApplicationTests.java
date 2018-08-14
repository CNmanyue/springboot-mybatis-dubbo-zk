package com.zhouxw.provider;

import com.zhouxw.domain.User;
import com.zhouxw.service.IUserService;
import net.minidev.json.JSONArray;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProviderApplicationTests {


    private static final Logger LOGGER = LoggerFactory.getLogger(ProviderApplication.class);
    @Autowired
    private IUserService userService;

    @Test
    public void contextLoads() {
        LOGGER.info("started");
        User user = new User();
        user.setUsername("zhouxw");
        LOGGER.info(JSONArray.toJSONString(userService.findUser(user)));
    }

}
