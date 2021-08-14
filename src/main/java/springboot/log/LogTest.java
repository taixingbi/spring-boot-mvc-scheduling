package springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

// import org.springframework.scheduling.annotation.Async;

//log
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
public class LogTest {
    private Log log= new Log();

	@RequestMapping("/log")
    public String get_log() {
        log.warn1();
        return "log";
    }

}