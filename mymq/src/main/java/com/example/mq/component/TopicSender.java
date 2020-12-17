package com.example.mq.component;


import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TopicSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

//交换器topicExchange 路由topic.1 与topic.# 匹配 故TopicReceiver2 能接收到
    public void send() {
        String context = "hi i am message all " + new Date();
        System.out.println("Sender: " + context);
        this.rabbitTemplate.convertAndSend("topicExchange", "topic.1", context);
    }
//交换器topicExchange 路由topic.message  与topic.# 和topic.message 都 匹配 故TopicReceiver TopicReceiver2 能接收到
    public void send1() {
        String context = "hi i am message 1 " + new Date();
        System.out.println("Sender: " + context);
        this.rabbitTemplate.convertAndSend("topicExchange", "topic.message", context);
    }
//交换器topicExchange 路由topic.messages  与topic.#  匹配 故TopicReceiver2 能接收到
    public void send2() {
        String context = "hi i am message 2 " + new Date();
        System.out.println("Sender: " + context);
        this.rabbitTemplate.convertAndSend("topicExchange", "topic.messages", context);
    }
}
