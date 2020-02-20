package com.yycoin.multipleds;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;

@Configuration
public class DynamicDataSourceConfig {
	@Bean
	@ConfigurationProperties("spring.datasource.druid.tn")
	public DataSource tnDataSource() {
		return DruidDataSourceBuilder.create().build();
	}

	@Bean
	@ConfigurationProperties("spring.datasource.druid.tw")
	public DataSource twDataSource() {
		return DruidDataSourceBuilder.create().build();
	}

	@Bean
	@ConfigurationProperties("spring.datasource.druid.gh")
	public DataSource ghDataSource() {
		return DruidDataSourceBuilder.create().build();
	}

	@Bean
	@ConfigurationProperties("spring.datasource.druid.h5inter")
	public DataSource h5DataSource() {
		return DruidDataSourceBuilder.create().build();
	}

	@Bean
	@Primary
	public DynamicDataSource dataSource(DataSource tnDataSource, DataSource twDataSource, DataSource ghDataSource,
			DataSource h5DataSource) {
		Map<Object, Object> targetDataSources = new HashMap<>();
		targetDataSources.put(DataSourceNames.tnds, tnDataSource);
		targetDataSources.put(DataSourceNames.twds, twDataSource);
		targetDataSources.put(DataSourceNames.ghds, ghDataSource);
		targetDataSources.put(DataSourceNames.h5inter, h5DataSource);
		return new DynamicDataSource(tnDataSource, targetDataSources);
	}
}
