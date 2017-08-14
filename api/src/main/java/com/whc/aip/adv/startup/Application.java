package com.whc.aip.adv.startup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

/**
 * API的启动入口，采用springboot启动
 */
@SpringBootApplication(exclude={MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
@ImportResource("classpath:springMvc.xml")
public class Application {

    private static final Logger logger= LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws Exception {
        logger.info("----com.whc.aip.adv.api  begin start up------");
        SpringApplication.run(Application.class, args);
        logger.info("----com.whc.aip.adv.api started up success------");
    }

}