package com.example.lessonweb.web;

import com.example.lessonweb.model.User;
import org.omg.CORBA.Object;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class WebController {

    @RequestMapping(value = "/getUser", produces = "application/json;charset=utf-8")
    public User getUser() {
        User user = new User();
        user.setName("小明");
        user.setAge(12);
        user.setPass("123456");

        System.out.println(user);
        return user;

    }

    @RequestMapping(value = "/getUsers", produces = "application/json;charset=utf-8")
    public List<User> getUsers() {
        List<User> users = new ArrayList<User>();
        User user1 = new User();
        user1.setName("neo");
        user1.setAge(30);
        user1.setPass("neo123456");
        User user2 = new User();
        user2.setName("miao");
        user2.setAge(20);
        user2.setPass("miao123456");
        users.add(user1);
        users.add(user2);
        return users;
    }

    @GetMapping("/get/{name}")
    public String get(@PathVariable String name ){
        return name ;
    }

    @RequestMapping("/saveUser")
    public void saveUser(@Valid User user , BindingResult result){
        System.out.println("user : " + user);
        if (result.hasErrors()){
            List<ObjectError> list = result.getAllErrors();
            for (ObjectError error:list){
                System.out.println(error.getCode()+"-"+error.getDefaultMessage());
            }
        }


    }
















    @GetMapping("/home")
    public String home() {

        return "welcome back home";
    }

}
