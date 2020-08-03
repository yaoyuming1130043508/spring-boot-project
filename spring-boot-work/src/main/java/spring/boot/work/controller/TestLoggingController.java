package spring.boot.work.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.logging.LoggingSystemProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequestMapping
@EnableAutoConfiguration
public class TestLoggingController {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    @GetMapping("/log")
    public void Logging(){
        logger.info("这是登录的日志");
        logger.debug("这是错误的日志");
        logger.warn("警告的日志");
    }
}
