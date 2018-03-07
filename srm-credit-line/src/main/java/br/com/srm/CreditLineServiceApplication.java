package br.com.srm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"br.com.srm"})
public class CreditLineServiceApplication {

    public static void main(final String[] args) {
        SpringApplication.run(CreditLineServiceApplication.class, args);
    }
}
