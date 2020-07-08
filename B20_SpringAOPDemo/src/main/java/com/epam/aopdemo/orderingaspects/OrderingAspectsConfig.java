package com.epam.aopdemo.orderingaspects;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.epam.aopdemo.orderingaspects")
public class OrderingAspectsConfig {

}
