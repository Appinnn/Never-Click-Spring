package com.example.bookTest.config;



import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Jaas;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AppConfig 
{
	@Bean
	public DataSource dataSource()
	{
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUsername("Appin");
		ds.setPassword("alclssha12");
		ds.setUrl("jdbc:mysql://localhost:3306/appin");
		
		return ds;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource)
	{
		return new JdbcTemplate(dataSource);
	}
}










