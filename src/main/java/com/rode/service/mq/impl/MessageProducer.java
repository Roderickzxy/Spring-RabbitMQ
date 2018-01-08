package com.rode.service.mq.impl;

import com.rode.service.mq.Producer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Roderick
 * @Description:
 * @Date: Created in 23:38 2018/1/7
 * @Modified By:
 */
@Service
public class MessageProducer implements Producer{
    private static final Logger logger = LoggerFactory.getLogger(MessageProducer.class);

    @Autowired
    private AmqpTemplate directMqTemplate;

    @Autowired
    private AmqpTemplate TopicMqTemplate;

    @Override
    public void sendMessage(Object message) {
        directMqTemplate.convertAndSend("queue_key", message);
//        directMqTemplate.convertAndSend("queue_chris", message);
//        TopicMqTemplate.convertAndSend("topic.xxxx.shit", message);
    }
}
