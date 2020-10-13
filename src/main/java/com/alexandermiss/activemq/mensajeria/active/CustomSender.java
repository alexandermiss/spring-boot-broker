package com.alexandermiss.activemq.mensajeria.active;

import com.alexandermiss.activemq.mensajeria.data.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.*;

@Service
public class CustomSender {
    private static final Logger LOG = LoggerFactory.getLogger(CustomSender.class);

    @Autowired
    public JmsTemplate jmsTemplate;

    public void sendMessage(String payload) {
        try{
            this.jmsTemplate.convertAndSend("status", payload);
        }catch(Exception e){
            LOG.info(e.getMessage());
        }
    }

    public void sendCustomMessage(CustomMessage payload) {
        try{
            this.jmsTemplate.convertAndSend("messaging.q", payload);
        }catch(Exception e){
            LOG.info(e.getMessage());
        }
    }

}
