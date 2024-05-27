package net.javaguides.springbootkafkatutorial.Kafka;

import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Log4j2

public class KafkaProducer {

    private KafkaTemplate<String,String> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    public void sendMessage (String message){
        log.info(String.format("Message sent %s",message));
        kafkaTemplate.send("javaguides",message);
    }
}
