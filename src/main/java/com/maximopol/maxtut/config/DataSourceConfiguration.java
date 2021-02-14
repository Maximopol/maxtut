package com.maximopol.maxtut.config;

//import com.maximopol.maxtut.service.PropertyServiceSecondDataBase;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.transaction.PlatformTransactionManager;
//
//import javax.sql.DataSource;
//
//@Configuration
//@EnableJpaRepositories(
//        basePackages = "com.maximopol.maxtut.repositorykek",
//        entityManagerFactoryRef = "secondEntityManager",
//        transactionManagerRef = "secondTransactionManager")
//public class DataSourceConfiguration {
//    @Autowired
//    PropertyServiceSecondDataBase propertyServiceSecondDataBase;
//
//    @Bean
//    @ConfigurationProperties("questions.datasource")
//    public DataSourceProperties secondDataSourceProperties() {
//        return new DataSourceProperties();
//    }
//
//    @Bean
//    public DataSource secondDataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName(propertyServiceSecondDataBase.getDriverClassName());
//        dataSource.setUrl(propertyServiceSecondDataBase.getUrl());
//        dataSource.setUsername(propertyServiceSecondDataBase.getUsername());
//        dataSource.setPassword(propertyServiceSecondDataBase.getPassword());
//        return dataSource;
//    }
//    @Bean
//    public LocalContainerEntityManagerFactoryBean secondEntityManager() {
//        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
//        em.setDataSource(secondDataSource());
//        em.setPackagesToScan("com.maximopol.maxtut.entitykek");
//        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//        em.setJpaVendorAdapter(vendorAdapter);
////        HashMap<String, Object> properties = new HashMap<>();
////        properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
////        em.setJpaPropertyMap(properties);
//        return em;
//    }
//
//    @Bean
//    public PlatformTransactionManager secondTransactionManager() {
//        JpaTransactionManager transactionManager = new JpaTransactionManager();
//        transactionManager.setEntityManagerFactory(secondEntityManager().getObject());
//        return transactionManager;
//    }
//}
