package com.core2.controller;

import com.api.service.SayHelloService;
import com.api.wrap.UserWrap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by 马明明 on 2016/4/23.
 */
@Controller
public class ClientController {
    @Resource
    private SayHelloService sayHelloService;
    @RequestMapping("/helloworld")
    public String getNewName(@RequestParam("userName") String userName, HttpServletRequest request){
        String str = sayHelloService.sayHello(userName);
        UserWrap user = sayHelloService.getUserInfo("1","1","1","1");
        System.out.println("======"+user.toString());
        System.out.println(str);
        //System.out.println(userName);
        return "index";
    }
}
