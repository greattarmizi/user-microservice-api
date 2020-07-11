package id.tarmizi.user.microservice.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserMicroserviceApiApplication {
        
	public static void main(String[] args) {
		SpringApplication.run(UserMicroserviceApiApplication.class, args);
	}

}
