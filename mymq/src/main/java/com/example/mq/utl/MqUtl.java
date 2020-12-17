package com.example.mq.utl;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class MqUtl {
    public static Connection getConnection() throws Exception {
        //定义连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        factory.setPort(5672);
        //设置vhost
        factory.setVirtualHost("/mall");
        factory.setUsername("admin");
        factory.setPassword("admin");
        //通过工厂获取连接
        Connection connection = factory.newConnection();
        return connection;
    }
}
