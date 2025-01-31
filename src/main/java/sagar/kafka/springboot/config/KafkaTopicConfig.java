package sagar.kafka.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {


    @Value("${spring.kafka.topic.name}")
    private String topicName;

    @Value("${spring.kafka.topic.name-json}")
    private String jsonTopic;

    @Bean
    public NewTopic kafkaJsonTopic(){
        return TopicBuilder.name(jsonTopic)
                .build();
    }

    @Bean
    public NewTopic initialTopic(){
        return TopicBuilder.name(topicName)
                .build();
    }

}
