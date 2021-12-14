package com.sy.handler;

import com.sy.entity.UserInfo;
import com.sy.mapper.UserMapper;
import com.sy.myService.IUserService;
import com.sy.result.MyResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserHandler {

    @Autowired
    private IUserService service;

    @ResponseBody
    @RequestMapping("/list")
    public Object list(){
        System.out.println("请求list列表>>>>");
        List<UserInfo> uis = service.list(null);

        return MyResult.init(200,"用户信息",uis);
    }

    @ResponseBody
    @RequestMapping("/add")
    public Object add(@RequestBody UserInfo ui){
        System.out.println("添加user====> "+ui);


        return MyResult.init(404,"","");
    }

    @ResponseBody
    @RequestMapping("/edit")
    public Object edit(@RequestBody UserInfo ui){
        System.out.println("编辑user====> "+ui);

        return MyResult.init(404,"","");
    }

    @ResponseBody
    @RequestMapping("/del/{id}")
    public Object del(@PathVariable int  id){
        System.out.println("del====> "+id);

        return MyResult.init(404,"","");
    }

    @ResponseBody
    @RequestMapping("/queryById/{id}")
    public Object qid(@PathVariable int id){
        System.out.println("编辑 id====> "+id);

        return MyResult.init(404,"","");
    }

}
