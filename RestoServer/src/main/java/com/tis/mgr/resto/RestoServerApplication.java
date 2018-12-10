package com.tis.mgr.resto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@EnableEurekaServer
//@EnableZuulServer
@SpringBootApplication
public class RestoServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestoServerApplication.class, args);
	}
}
