package com.example.pessoa;

import javax.activation.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

public class DataConfiguration {

		@Bean
		public DriverManagerDataSource dataSource() {
			DriverManagerDataSource dtSource = new DriverManagerDataSource();
			dtSource.setDriverClassName("com.mysql.jdbc.Driver");
			dtSource.setUrl("jdbc:mysql://localhost:3386/Pessoas");
			dtSource.setUsername("root");
			dtSource.setPassword("dgsegkllnhg");
			return dtSource;
		}
		
		@Bean
		public JpaVendorAdapter jpaVendorAdapter() {
			HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
			adapter.setDatabase(Database.MYSQL);
			adapter.setShowSql(true);
			adapter.setGenerateDdl(true);
			adapter.setDatabasePlatform("org.hibernate.dialect.MySQLDialect");
			adapter.setPrepareConnection(true);
			return adapter;
		}
}
