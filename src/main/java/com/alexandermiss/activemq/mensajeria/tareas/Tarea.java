package com.alexandermiss.activemq.mensajeria.tareas;

import com.alexandermiss.activemq.mensajeria.active.*;
import org.slf4j.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Tarea {

    private final Logger log = LoggerFactory.getLogger(Tarea.class);


    @Autowired
    private CustomSender customSender;

    @Scheduled(fixedRate = 1000)
    public void reportCurrentTime() {
        try{
            log.info("Esta tarea se ejecuta cada 5 segundos");

            customSender.sendMessage("Sending");
        }catch (Exception e){
            log.info(e.getMessage());
        }
    }

}
