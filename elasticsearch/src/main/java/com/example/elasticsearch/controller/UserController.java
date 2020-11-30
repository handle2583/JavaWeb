package com.example.elasticsearch.controller;


import com.example.elasticsearch.entity.MybatisUser;
import com.example.elasticsearch.mapper.MybatisUserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    MybatisUserMapper mybatisUserMapper ;

    @GetMapping("/getuser")
    public MybatisUser getUserById(long id ){

       return mybatisUserMapper.getOne(id) ;


    }
}
