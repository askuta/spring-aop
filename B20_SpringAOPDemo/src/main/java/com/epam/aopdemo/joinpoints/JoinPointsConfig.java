package com.epam.aopdemo.joinpoints;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.epam.aopdemo.joinpoints")
public class JoinPointsConfig {

}
