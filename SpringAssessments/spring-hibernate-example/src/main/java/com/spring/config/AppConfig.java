package com.spring.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;



@Configuration
@PropertySource("classpath:db.properties")
@EnableTransactionManagement
@ComponentScans(value = { 
      @ComponentScan("com.spring.dao"),
      @ComponentScan("com.spring.service") 
    })
public class AppConfig {

   @Autowired
   private Environment env;

   @Bean
   public DataSource getDataSource() {
      BasicDataSource dataSource = new BasicDataSource();
      dataSource.setDriverClassName(env.getProperty("db.driver"));
      dataSource.setUrl(env.getProperty("db.url"));
      dataSource.setUsername(env.getProperty("db.username"));
      dataSource.setPassword(env.getProperty("db.password"));
      return dataSource;
   }


   @Bean
   @Autowired
   public HibernateTransactionManager transactionManager(SessionFactory sessionFactory)
   {
       HibernateTransactionManager htm = new HibernateTransactionManager();
       htm.setSessionFactory(sessionFactory);
       return htm;
   }
   
   @Bean
   @Autowired
   public HibernateTemplate getHibernateTemplate(SessionFactory sessionFactory)
   {
       HibernateTemplate hibernateTemplate = new HibernateTemplate(sessionFactory);
       return hibernateTemplate;
   }
       
   @Bean
   public LocalSessionFactoryBean getSessionFactory()
   {
	   LocalSessionFactoryBean asfb = new LocalSessionFactoryBean();
       asfb.setDataSource(getDataSource());
       asfb.setHibernateProperties(getHibernateProperties());        
       asfb.setPackagesToScan(new String[]{"com.spring.entity"});
       return asfb;
   }
   
   @Bean
   public Properties getHibernateProperties()
   {
	       Properties props=new Properties();
	      props.put("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
	      props.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));

       
       return props;
   }
}
