package com.alexandermiss.activemq.mensajeria.tareas;

import com.alexandermiss.activemq.mensajeria.active.*;
import com.alexandermiss.activemq.mensajeria.data.*;
import org.slf4j.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Tarea {

    private final Logger log = LoggerFactory.getLogger(Tarea.class);

    @Value("${mensajeria.tareas.active}")
    private String isActive;

    @Autowired
    private CustomSender customSender;

    @Scheduled(fixedRate = 1000)
    public void reportCurrentTime() {

        if(isActive.equals("yes")){
            try{
                log.info("reportCurrentTime se ejecuta cada 5 segundos");

                customSender.sendMessage("Sending data");
            }catch (Exception e){
                log.info(e.getMessage());
            }
        }else{
            log.info("disabled reportCurrentTime");
        }

    }

    @Scheduled(fixedRate = 1000)
    public void reportCustomData() {
        if(isActive.equals("yes")){
            try{
                log.info("reportCustomData se ejecuta cada 5 segundos");

                CustomMessage customMessage = new CustomMessage();

                customMessage.setId(1L);
                customMessage.setDescription(String.format("Custom message :%s", customMessage.getId()));

                customSender.sendCustomMessage(customMessage);
            }catch (Exception e){
                log.info(e.getMessage());
            }
        }else{
            log.info("disabled reportCustomData");
        }

    }

}
