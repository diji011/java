package com.mm.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 马明明 on 2016/4/22.
 */
@Controller
public class ProviderController {
    @RequestMapping("/helloworld")
    public String getNewName(@RequestParam("userName") String userName, HttpServletRequest request){
        return "index";
    }

}
