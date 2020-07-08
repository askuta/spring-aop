package com.epam.aopdemo.afterthrowing;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.epam.aopdemo.afterthrowing")
public class AfterThrowingAdviceConfig {

}
