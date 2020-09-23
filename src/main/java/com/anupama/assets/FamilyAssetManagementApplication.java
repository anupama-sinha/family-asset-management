package com.anupama.assets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@EnableCaching
@EnableScheduling
@OpenAPIDefinition(info = @Info(title = "Family Asset Management", version = "1.0.0", description = "Helps to keep a record of bought products and goods"))
public class FamilyAssetManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(FamilyAssetManagementApplication.class, args);
	}
 
}
