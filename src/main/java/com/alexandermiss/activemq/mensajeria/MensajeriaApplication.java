package com.alexandermiss.activemq.mensajeria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.*;


@SpringBootApplication
@EnableScheduling
public class MensajeriaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MensajeriaApplication.class, args);
    }

}
