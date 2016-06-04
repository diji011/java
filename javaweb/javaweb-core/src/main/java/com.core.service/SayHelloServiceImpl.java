package com.core.service;

import com.api.service.SayHelloService;
import com.api.wrap.UserWrap;
import org.springframework.stereotype.Service;

/**
 * Created by 马明明 on 2016/4/23.
 */
@Service("sayHelloService")
public class SayHelloServiceImpl implements SayHelloService {
    public String sayHello(String say) {
        return say;
    }
    public UserWrap getUserInfo(String userId, String userName, String password, String address) {
        UserWrap user = new UserWrap();
        user.setAddress(address);
        user.setPassword(password);
        user.setUserId(userId);
        user.setUserName(userName);
        return user;
    }
}
