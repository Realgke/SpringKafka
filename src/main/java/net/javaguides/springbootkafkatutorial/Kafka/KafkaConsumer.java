package net.javaguides.springbootkafkatutorial.Kafka;

import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class KafkaConsumer {
    @KafkaListener(topics = "javaguides", groupId = "myGroup")
    public void consume(String message) {
        log.info(String.format("Message received->%s", message));

    }
}
