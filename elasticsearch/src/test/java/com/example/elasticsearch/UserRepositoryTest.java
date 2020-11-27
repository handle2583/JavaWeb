package com.example.elasticsearch;

import com.example.elasticsearch.entity.User;
import com.example.elasticsearch.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.LinkedList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository ;

    @Test
    public void testSave(){

        User user = new User("miao" , "123456",30) ;
        userRepository.save(user) ;

    }

    @Test
    public void testUpdate(){
        User user = new User(1,"miao","23456",29);
        userRepository.update(user);
    }

    @Test
    public void testQuery(){
        User user = userRepository.findById(1) ;
        System.out.println("user:"+user);

    }

    @Test
    public void testQueryAll(){

        List<User> userList = userRepository.findAll();
        for (User user:userList){
            System.out.println(user);
        }


    }
}
