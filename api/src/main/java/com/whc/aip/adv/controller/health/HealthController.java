package com.whc.aip.adv.controller.health;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Copyright© 2013-2017 AutoChina International Ltd. All rights reserved.</p>
 */
@RestController
@RequestMapping(value = "/base")
public class HealthController {

    private static final Logger logger= LoggerFactory.getLogger(HealthController.class);

    @RequestMapping(value = "/health" , method = RequestMethod.GET)
    public String heath(){
        logger.info("--------health check-------");
        return "Ok!";
    }
}
