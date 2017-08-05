package com.wertal.DemoCassandraRest;

import com.datastax.driver.core.Session;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoCassandraRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoCassandraRestApplication.class, args);

    }


}
