package sagar.kafka.springboot.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import sagar.kafka.springboot.payload.User;

@Service
@Slf4j
public class JsonKafkaProducer {

    private final KafkaTemplate<String, User> kafkaTemplate;

    @Value("${spring.kafka.topic.name-json}")
    private String jsonTopic;

    public JsonKafkaProducer(KafkaTemplate<String, User> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(User data){
        log.info("Message from JSON Producer sent -> {}", data.toString());
        Message<User> message = MessageBuilder
                .withPayload(data)
                .setHeader(KafkaHeaders.TOPIC,jsonTopic)
                .build();

        kafkaTemplate.send(message);
    }
}
