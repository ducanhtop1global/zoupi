package org.zoupi.compressorzoupi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CompressorZoupiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompressorZoupiApplication.class, args);
	}

}
