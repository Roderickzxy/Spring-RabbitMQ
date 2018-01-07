package com.rode.controller;


import com.rode.service.mq.impl.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class UserController {
    @Autowired
    private MessageProducer messageProducer;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "fuck you!";
    }

    @RequestMapping(value="/send-message", method=RequestMethod.GET)
    public String start(){
        int a = 100;
        while (a > 0) {
            messageProducer.sendMessage("Hello, I am amq sender num :" + a--);
            try {
                //暂停一下，好让消息消费者去取消息打印出来
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        return "success";
    }
}
