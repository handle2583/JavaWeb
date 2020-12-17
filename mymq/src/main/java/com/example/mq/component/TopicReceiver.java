package com.example.mq.component;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topic.message")//监听topic.message队列
public class TopicReceiver {
    //标注了这个注解的方法都可以在接收的时候执行 不管方法名是什么
    @RabbitHandler
    public void dothis(String message) {
        System.out.println("Topic Receiver1:" + message);
    }
}
