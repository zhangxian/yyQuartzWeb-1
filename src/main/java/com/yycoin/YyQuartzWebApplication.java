package com.yycoin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableScheduling
@EnableAutoConfiguration
@EnableTransactionManagement
@MapperScan(basePackages = { "com.yycoin.vo" })
public class YyQuartzWebApplication extends SpringBootServletInitializer {

//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(YyQuartzWebApplication.class);
//	}

	public static void main(String[] args) {
		SpringApplication.run(YyQuartzWebApplication.class, args);
	}

}
