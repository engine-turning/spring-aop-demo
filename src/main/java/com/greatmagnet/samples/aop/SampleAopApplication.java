package com.greatmagnet.samples.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.greatmagnet.samples.aop"})
public class SampleAopApplication {

  public static void main(String[] args) {

    new AnnotationConfigApplicationContext(SampleAopApplication.class);

  }


}
