package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
//log
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@EnableScheduling
public class SpringBootTasksApplication {
	//log
	private static final Logger logger = LoggerFactory.getLogger(SpringBootTasksApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTasksApplication.class, args);
	}

}
