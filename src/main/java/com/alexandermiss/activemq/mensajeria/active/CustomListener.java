package com.alexandermiss.activemq.mensajeria.active;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class CustomListener {

    private static final Logger LOG = LoggerFactory.getLogger(CustomListener.class);

    @JmsListener(destination = "status")
    public void processMsg(String message) {
        LOG.info("============= Received: " + message);
    }
}
