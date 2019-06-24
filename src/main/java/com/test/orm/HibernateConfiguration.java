package com.test.orm;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@Configuration
@ImportResource({"classpath:hibernate5config.xml"})
public class HibernateConfiguration {

}
