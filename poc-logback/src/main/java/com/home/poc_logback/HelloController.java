package com.home.poc_logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
 
    @GetMapping("/hello")
    public String hello() {
        logger.debug("Debugging /hello endpoint");
        logger.info("Handling /hello request");
        return "Hello, World!";
    }
}