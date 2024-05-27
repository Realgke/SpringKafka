package net.javaguides.springbootkafkatutorial.Controller;

import lombok.extern.slf4j.Slf4j;
import net.javaguides.springbootkafkatutorial.Kafka.JsonKafkaProducer;
import net.javaguides.springbootkafkatutorial.Payload.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")


@Slf4j
public class JsonMessageController {
    private JsonKafkaProducer kafkaProducer;

    public JsonMessageController(JsonKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user){
        log.info("FUCKING USER: {}",user);
        kafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Json message sent to kafka topic");
    }

}
