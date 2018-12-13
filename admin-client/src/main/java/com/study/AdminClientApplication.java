package com.study;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AdminClientApplication {
    private final static Logger log = LoggerFactory.getLogger(AdminClientApplication.class);

    public static void main(String[] args) {
        log.info("<<<<<<<<< Monitor Client booting >>>>>>>>>");
        SpringApplication.run(AdminClientApplication.class, args);
        log.info("<<<<<<<<< Monitor Client booting finished >>>>>>>>>");
    }

    @RequestMapping("/hello")
    public String sayHello(Integer time) {
        if (time != null) {
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                log.error("", e);
            }
        }
        return "Hello!";
    }
}
