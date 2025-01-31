package sagar.kafka.springboot.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumer {

    private static final Logger log = LoggerFactory.getLogger(KafkaConsumer.class);


    @KafkaListener(topics = "firstTopic", groupId = "myGroup")
    public void consume(String message){
        log.info(String.format("Message recieved -> %s", message));
    }
}
