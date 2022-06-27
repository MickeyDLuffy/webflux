package com.github.mickeydeeluffy.webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.URI;

@SpringBootApplication
public class WebfluxApplication {
    /**
     * Advantages of Webflux
     * 1. When a user cancels a streaming request, it stops sending response, while in the traditional request
     * even if u cancel, it still processes the request
     * @param args
     */

    public static void main(String[] args) {

        SpringApplication.run(WebfluxApplication.class, args);
    }

}
