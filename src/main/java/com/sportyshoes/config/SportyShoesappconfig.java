package com.sportyshoes.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages  = "com.sportyshoes")
public class SportyShoesappconfig {
	@Bean
public InternalResourceViewResolver viewResolver() {
	InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
	viewResolver.setPrefix("/WEB-INF/view/");
	viewResolver.setSuffix(".jsp");
	return viewResolver;
}
@Bean
public DataSource datasource() {
	DriverManagerDataSource dataSource=new DriverManagerDataSource();
	dataSource.setUsername("root");
	dataSource.setPassword("Rajat@123");
	dataSource.setUrl("jdbc:mysql://localhost:3306/sportyshoes");
	dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	return dataSource;
}
@Bean
public JdbcTemplate jdbcTemplate() {
	JdbcTemplate jdbcTemplate=new JdbcTemplate(datasource());
	return jdbcTemplate;
}

}
