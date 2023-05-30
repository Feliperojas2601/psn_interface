package com.example.psn_interface;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.psn_interface"})
public class PsnInterfaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PsnInterfaceApplication.class, args);
	}

}
