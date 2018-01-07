package com.rode.service.mq.impl;

import com.rode.service.mq.Consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;

/**
 * @Author: Roderick
 * @Description:
 * @Date: Created in 23:16 2018/1/7
 * @Modified By:
 */
public class TopicMessageConsumerImpl implements Consumer{
    private static final Logger logger = LoggerFactory.getLogger(TopicMessageConsumerImpl.class);

    @Override
    public void onMessage(Message message) {
        logger.info("topic messages:" + message);
    }
}
