package com.example.accounts;

import com.example.accounts.dto.AccountsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(AccountsContactInfoDto.class)
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservice Rest API Documentation",
				description = "Bank Account microservice Rest API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Sanjib Giri",
						email = "sanjibkumargiri1@gmail.com",
						url = "https://gihub.com/sanjib-123"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://hithub.com/Sanjib-123"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Bank Account microservices Rest API Document"
		)

)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
