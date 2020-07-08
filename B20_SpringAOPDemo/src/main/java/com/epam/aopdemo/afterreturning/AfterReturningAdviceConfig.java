package com.epam.aopdemo.afterreturning;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.epam.aopdemo.afterreturning")
public class AfterReturningAdviceConfig {

}
