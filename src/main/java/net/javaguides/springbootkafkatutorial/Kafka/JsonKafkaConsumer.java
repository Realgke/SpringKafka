package net.javaguides.springbootkafkatutorial.Kafka;

import lombok.extern.log4j.Log4j2;
import net.javaguides.springbootkafkatutorial.Payload.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Log4j2

public class JsonKafkaConsumer {

    @KafkaListener(topics = "javaguides_json",groupId = "myGroup")
    public void consume(User user){
        log.info("Json Message received->%s"+user);

    }

}
