package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudProviderOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudProviderOneApplication.class, args);
	}
}
