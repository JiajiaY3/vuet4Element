package com.sy.handler;

import com.sy.myService.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginHandler {

    @Autowired
    private IUserService userService;

    @ResponseBody
    @RequestMapping("hello")
    public Object hello(){
        return "Hello,World.";
    }

    @ResponseBody
    @RequestMapping("")
    public Object login(@RequestParam String username , @RequestParam String password){
        System.out.println("登录方法>>>"+username+" <====> "+password);

        return "login";
    }

}
