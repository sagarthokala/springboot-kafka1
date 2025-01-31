package sagar.kafka.springboot.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import sagar.kafka.springboot.payload.User;

@Service
@Slf4j
public class JsonKafkaConsumer {

    @KafkaListener(topics =  "spring.kafka.topic.name-json", groupId = "spring.kafka.consumer.group-id")
    public void consume(User user){
        log.info("Json message received -> {}", user.toString());
    }
}
