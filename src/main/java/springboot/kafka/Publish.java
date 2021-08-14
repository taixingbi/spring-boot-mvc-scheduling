package springboot;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
// @Service 
public class Publish {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @RequestMapping(path = "/publish/{key}")
    public String get_publish(@PathVariable String key) {
        kafkaTemplate.send("quickstart-events", key);
        System.out.println("produced message: " + key);
        return key;
    }
}


/*
@RequestMapping(value="/mapping/foo/{foo}/{bar}", method=RequestMethod.GET)
public String process(@PathVariable String foo,@PathVariable String bar) {
    //Perform logic with foo and bar
}
*/