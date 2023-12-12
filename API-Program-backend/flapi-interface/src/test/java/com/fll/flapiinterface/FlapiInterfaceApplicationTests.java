package com.fll.flapiinterface;

import com.fll.flapiclientsdk.client.YuApiClient;
import com.fll.flapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * 测试类
 *
 */
@SpringBootTest
class FlapiInterfaceApplicationTests {

    @Resource
    private YuApiClient yuApiClient;

    @Test
    void contextLoads() {
        String result = yuApiClient.getNameByGet("fll");
        User user = new User();
        user.setUsername("作_者 【程序员_鱼皮】 https://space.bilibili.com/12890453/");
        String usernameByPost = yuApiClient.getUsernameByPost(user);
        System.out.println(result);
        System.out.println(usernameByPost);
    }

}
