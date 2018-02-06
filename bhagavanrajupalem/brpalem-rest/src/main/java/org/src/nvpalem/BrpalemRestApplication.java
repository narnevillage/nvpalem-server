package org.src.nvpalem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication (scanBasePackages = {"org.src.nvpalem"})
public class BrpalemRestApplication extends SpringBootServletInitializer {

    public static void main(String[] args){
        SpringApplication.run(BrpalemRestApplication.class, args);
    }

}
