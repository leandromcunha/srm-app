package br.com.srm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class RiskServiceApplication {

    public static void main(final String[] args) {
        SpringApplication.run(RiskServiceApplication.class, args);
    }
}
