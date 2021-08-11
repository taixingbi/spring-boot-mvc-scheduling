package springboot;
import java.util.Date;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@Component

public class Controller {
	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime() {
		System.out.println("\n******************************");
		System.out.println(new Date());
		System.out.println("******************************");
	}

	@RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!!!";
    }

}