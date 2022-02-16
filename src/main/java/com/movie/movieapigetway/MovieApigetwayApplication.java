package com.movie.movieapigetway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class MovieApigetwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieApigetwayApplication.class, args);
	}

}
