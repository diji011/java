package com.api.service;

import com.api.wrap.UserWrap;

/**
 * Created by 马明明 on 2016/4/23.
 */
public interface SayHelloService {
    public String sayHello(String say);
    public UserWrap getUserInfo(String userId,String userName,String password,String address);
}
