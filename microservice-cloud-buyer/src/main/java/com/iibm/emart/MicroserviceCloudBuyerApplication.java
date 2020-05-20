package com.iibm.emart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceCloudBuyerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceCloudBuyerApplication.class, args);
	}

}
