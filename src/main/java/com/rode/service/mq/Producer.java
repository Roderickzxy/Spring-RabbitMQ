package com.rode.service.mq;

/**
 * @Author: Roderick
 * @Description:
 * @Date: Created in 23:37 2018/1/7
 * @Modified By:
 */
public interface Producer {

    /**
     * 发送消息
     * @param message
     */
    public void sendMessage(Object message);
}
