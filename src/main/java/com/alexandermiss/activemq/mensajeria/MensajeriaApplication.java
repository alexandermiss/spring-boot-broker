package com.alexandermiss.activemq.mensajeria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.*;
import org.springframework.scheduling.annotation.*;


@SpringBootApplication
@EnableScheduling
@EnableJms
public class MensajeriaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MensajeriaApplication.class, args);
    }

}
