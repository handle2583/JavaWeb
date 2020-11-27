package com.example.lessonweb;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesTest {

    @Value("${miao.title}")
    private String title;

    @Resource
    private OtherProperties otherProperties;

    @Test
    public void testSingle() {
        Assert.assertEquals(title, "纯洁的微笑");
    }

    @Test
    public void testOther() throws Exception {
        System.out.println(otherProperties.getDescription());
        System.out.println(otherProperties.getTitle());

    }

}
