package org.src.nvpalem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages = {"org.src.nvpalem"})
public class BrpalemRestApplication {

    public static void main(String[] args){
        SpringApplication.run(BrpalemRestApplication.class, args);
    }

}
