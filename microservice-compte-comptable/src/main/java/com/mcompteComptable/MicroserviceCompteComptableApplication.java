package com.mcompteComptable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceCompteComptableApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceCompteComptableApplication.class, args);
	}

}
