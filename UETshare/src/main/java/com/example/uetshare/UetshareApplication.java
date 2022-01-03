package com.example.uetshare;

import com.example.uetshare.response.dto.AccountDto;
import com.example.uetshare.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class UetshareApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(UetshareApplication.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(UetshareApplication.class);
	}
}