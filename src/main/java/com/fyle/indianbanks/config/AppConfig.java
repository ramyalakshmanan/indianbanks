package com.fyle.indianbanks.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.fyle.indianbanks.bankinfo.BankController;

@Configuration
@EnableWebMvc
@EnableAutoConfiguration
@EnableJpaRepositories("com.fyle.indianbanks.bankinfo.repository")
@ComponentScan(basePackageClasses = BankController.class)
public class AppConfig extends WebMvcConfigurationSupport {
 
	@Bean
	public DataSource dataSource() {
		BasicDataSource ds = new org.apache.commons.dbcp.BasicDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/indian_banks");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
		
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(
			DataSource dataSource, JpaVendorAdapter jpaVendorAdapter) {
		LocalContainerEntityManagerFactoryBean lef = new LocalContainerEntityManagerFactoryBean();
		lef.setDataSource(dataSource);
		lef.setJpaVendorAdapter(jpaVendorAdapter);
		lef.setPackagesToScan("com.fyle.indianbanks.bankinfo");
		return lef;
	}

	@Bean
	public JpaVendorAdapter jpaVendorAdapter() {
		HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
		hibernateJpaVendorAdapter.setShowSql(true);
		hibernateJpaVendorAdapter.setGenerateDdl(true);
		hibernateJpaVendorAdapter.setDatabase(Database.MYSQL);
		return hibernateJpaVendorAdapter;
	}

	@Bean
	public PlatformTransactionManager transactionManager() {
		return new JpaTransactionManager();
	}

	/*
	 * @Bean public RequestMappingHandlerAdapter requestMappingHandlerAdapter()
	 * { RequestMappingHandlerAdapter handlerAdapter = super
	 * .requestMappingHandlerAdapter(); return handlerAdapter; }
	 */

	public static void main(String[] args) {
		SpringApplication.run(AppConfig.class, args);
	}

}
