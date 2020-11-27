package com.example.elasticsearch;

import com.example.elasticsearch.entity.MybatisUser;
import com.example.elasticsearch.enums.MybatisUserSexEnum;
import com.example.elasticsearch.mapper.MybatisUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisUserTest {

    @Resource
    MybatisUserMapper mybatisUserMapper;

    @Test
    public void testInsert() throws Exception {
        MybatisUser mybatisUser = new MybatisUser("miao", "123456", MybatisUserSexEnum.MALE);
        mybatisUserMapper.insert(mybatisUser);


    }
}
