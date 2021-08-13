package springboot;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@Service // dis
// @RequestMapping("kafka")
public class Publish {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @RequestMapping(path = "/publish/{key}", method = RequestMethod.GET)
    public String getBook(@PathVariable String key) {
        kafkaTemplate.send("quickstart-events", key);
        System.out.println(key);
        return key;
    }
}


/*
@RequestMapping(value="/mapping/foo/{foo}/{bar}", method=RequestMethod.GET)
public String process(@PathVariable String foo,@PathVariable String bar) {
    //Perform logic with foo and bar
}
*/