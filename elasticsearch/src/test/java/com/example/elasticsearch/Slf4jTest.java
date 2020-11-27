package com.example.elasticsearch;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jTest {

    @Test
    public void testSlf4j(){
        Logger logger = LoggerFactory.getLogger(Object.class) ;
        logger.error("123");

    }
}
