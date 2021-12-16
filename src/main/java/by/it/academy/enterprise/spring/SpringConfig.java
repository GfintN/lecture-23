package by.it.academy.enterprise.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"by.it.academy.enterprise.aop", "by.it.academy.enterprise.components"})
public class SpringConfig {}
