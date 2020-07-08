package com.epam.aopdemo.pointcutdeclarations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.epam.aopdemo.pointcutdeclarations")
public class PointcutDeclarationsConfig {

}
