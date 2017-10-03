package com.auth.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.config.server.environment.VaultEnvironmentRepository;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigServerVoultApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerVoultApplication.class, args);
		VaultEnvironmentRepository k;
	}
}
