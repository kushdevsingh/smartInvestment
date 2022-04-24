package com.bosbizon.smartInvestments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SmartInvestmentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartInvestmentsApplication.class, args);
	}

}
