package be.ordina.testservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PrestigeTestingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrestigeTestingServiceApplication.class	, args);
	}
}
