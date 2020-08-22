package com.blog.blogcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BlogCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogCloudApplication.class, args);
    }

}
