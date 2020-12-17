package com.example.mq;

import com.example.mq.component.Receiver;
import com.example.mq.component.Sender;
import com.example.mq.component.TopicReceiver;
import com.example.mq.component.TopicSender;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class MqApplicationTests {

    @Autowired
    private Sender sender;
    @Autowired
    private Receiver receiver;

    @Autowired
    private TopicSender topicSender;
    @Autowired
    private TopicReceiver topicReceiver;

    @Test
    public void hello() {
        sender.send();
        //receiver.process("hello");
    }


    @Test
    public void topic() {
        //topicSender.send();
        //topicSender.send1();
        topicSender.send2();
    }

}
