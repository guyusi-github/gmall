package com.atguigu.gmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class})
public class GmallManagerWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmallManagerWebApplication.class, args);
	}

}
