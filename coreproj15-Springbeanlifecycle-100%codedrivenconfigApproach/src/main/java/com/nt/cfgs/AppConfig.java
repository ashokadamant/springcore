package com.nt.cfgs;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.nt.sbeans")
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig.AppConfig()");
	}
	@Bean("ldt")
	public LocalDateTime createDateTime() {
		System.out.println("AppConfig.createDateTime()");
		return LocalDateTime.now();
	}
}
