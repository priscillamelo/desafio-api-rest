package br.com.bootcamps.dio.desafio_api_rest;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(servers = {@Server(url = "/", description = "Default Server URL")})
@SpringBootApplication
public class DesafioApiRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioApiRestApplication.class, args);
	}

}
