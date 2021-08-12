package springboot;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class Kafka {
    @KafkaListener(topics = "quickstart-events")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }
}