package com.kafka.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class KafkaCamelDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(KafkaCamelDemoApplication.class, args);
	}
}
