package com.Microservicios.microservicios;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class MicroserviciosApplication {
	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosApplication.class, args);
	}
}

