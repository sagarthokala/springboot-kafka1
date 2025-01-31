package sagar.kafka.springboot.kafka;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
@Slf4j
public class KafkaConsumer {


    @KafkaListener(topics = "spring.kafka.topic.name", groupId = "spring.kafka.consumer.group-id")
    public void consume(String message){
        log.info("Message received -> {}", message);
    }
}
