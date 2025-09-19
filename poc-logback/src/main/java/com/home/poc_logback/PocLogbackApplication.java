package com.home.poc_logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PocLogbackApplication {

	private static final Logger logger = LoggerFactory.getLogger(PocLogbackApplication.class);
	 
    public static void main(String[] args) {
        SpringApplication.run(PocLogbackApplication.class, args);
 
        logger.trace("This is a TRACE message");
        logger.debug("This is a DEBUG message");
        logger.info("This is an INFO message");
        logger.warn("This is a WARN message");
        logger.error("This is an ERROR message");
    }

}
