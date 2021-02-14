package com.maximopol.maxtut.config;

import com.maximopol.maxtut.service.PropertyServicePrimaryDataBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(
        basePackages = "com.maximopol.maxtut.repository",
        entityManagerFactoryRef = "primaryEntityManager",
        transactionManagerRef = "primaryTransactionManager")
public class DataPrimarySourceConfiguration {
    @Autowired
    PropertyServicePrimaryDataBase propertyServiceSecondDataBase;
    @Bean
    @Primary
    @ConfigurationProperties("spring.datasource")
    public DataSourceProperties primaryDataSourceProperties() {
        return new DataSourceProperties();
    }
    @Bean
    @Primary
    public LocalContainerEntityManagerFactoryBean primaryEntityManager() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(primaryDataSource());
        em.setPackagesToScan("com.maximopol.maxtut.entity");
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
//        HashMap<String, Object> properties = new HashMap<>();
//        properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
//        em.setJpaPropertyMap(properties);
        return em;
    }

    @Bean
    @Primary
    public DataSource primaryDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(propertyServiceSecondDataBase.getDriverClassName());
        dataSource.setUrl(propertyServiceSecondDataBase.getUrl());
        dataSource.setUsername(propertyServiceSecondDataBase.getUsername());
        dataSource.setPassword(propertyServiceSecondDataBase.getPassword());
        return dataSource;
    }
    @Primary
    @Bean
    public PlatformTransactionManager primaryTransactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(primaryEntityManager().getObject());
        return transactionManager;
    }
}
