package com.tis.mgr.resto.service;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RestoServiceGateWayApplication {

	private static Logger _logger = Logger.getLogger(RestoServiceGateWayApplication.class.getName());
	
	public static void main(String[] args) {
		
	_logger.info("RestoServiceGateWayApplication  Execution Service :");
		SpringApplication.run(RestoServiceGateWayApplication.class, args);
	}
}
