package springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

	@RequestMapping("/test/{key}")
    public String test(@PathVariable String key) {
        System.out.println("key: " + key);
        return key;
    }

	@RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!!!";
    }

}