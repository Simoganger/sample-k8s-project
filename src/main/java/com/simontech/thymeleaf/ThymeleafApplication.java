package com.simontech.thymeleaf;

import com.simontech.thymeleaf.service.FileStorageService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class ThymeleafApplication implements CommandLineRunner {

	private final FileStorageService fileStorageService;

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafApplication.class, args);
	}

	@Override
	public void run(String... args) {
		fileStorageService.initStorage();
	}
}
