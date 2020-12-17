package com.example.mq.controller;

import com.example.mq.utl.MqUtl;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.DefaultConsumer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeContrller {

    private static final String QUEUE_NAME = "mq1";

    @RequestMapping(value = "/home" ,method = RequestMethod.GET)
    public String  home(){

        return "home" ;
    }


    @RequestMapping(value = "/createMq" ,method = RequestMethod.GET)
    public String  createMq()throws  Exception{
//获取连接
        Connection connection = MqUtl.getConnection();
        //创建通道
        Channel channel = connection.createChannel();
        //声明创建队列
        channel.queueDeclare(QUEUE_NAME,false,false,false,null);
        //消息内容
        String message = "Hello World!";
        channel.basicPublish("",QUEUE_NAME,null,message.getBytes());
        System.out.println("发送消息："+message);
        //关闭连接和通道
        channel.close();
        connection.close();
        return "createMq" ;
    }
    @RequestMapping(value = "/consumeMq" ,method = RequestMethod.GET)
    public String  consumeMq()throws Exception{
//获取连接和通道
        Connection connection = MqUtl.getConnection();
        Channel channel = connection.createChannel();
        //声明通道
        channel.queueDeclare(QUEUE_NAME,false,false,false,null);
        //定义消费者
        //QueueingConsumer consumer = new QueueingConsumer(channel);
        DefaultConsumer rpcMessageConsumer = new DefaultConsumer(channel);
        //channel.basicQos(cores);
        channel.basicConsume(QUEUE_NAME, true, rpcMessageConsumer);


        return "consumeMq" ;
    }
}
