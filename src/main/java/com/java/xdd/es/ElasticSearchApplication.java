package com.java.xdd.es;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xdd
 * @date 2019/11/28
 */
@SpringBootApplication
//@EnableElasticsearchRepositories
public class ElasticSearchApplication {
    public static void main(String[] args) {
        SpringApplication.run(ElasticSearchApplication.class, args);
    }
}
