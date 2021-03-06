package com.sample.api;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
//@OpenAPIDefinition(
//    info = @Info(
//        title="Sample API",
//        version = "1.0"
//	)
//)
@EnableJpaAuditing
public class SampleApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(SampleApiApplication.class, args);
	}
}
