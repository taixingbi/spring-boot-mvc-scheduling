package springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

//log
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//@Service
public class Log {
	private static final Logger logger = LoggerFactory.getLogger(SpringBootTasksApplication.class);

    public void warn1() {
        String w1= "This is a WARN 1 message";
        logger.warn(w1);
        System.out.println(w1);
    }

}