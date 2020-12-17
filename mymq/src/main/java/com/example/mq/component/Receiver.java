package com.example.mq.component;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello")
public class Receiver {
    //标注了这个注解的方法都可以在接收的时候执行 不管方法名是什么
    @RabbitHandler
    public void dothis(String hello){
        System.out.println("Receiver:"+hello);
    }
}