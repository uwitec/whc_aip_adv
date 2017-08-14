package com.whc.aip.adv.provider.startup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * server端的启动入口，采用springboot启动
 */
@SpringBootApplication
@ImportResource("classpath:dubbo-provider.xml")
public class Application {

    private static final Logger logger= LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws Exception {
        logger.info("----com.aip.adv.controller provider begin start up------");
        SpringApplication.run(Application.class, args);
        logger.info("----com.aip.adv.controller provider started up success------");
    }

}