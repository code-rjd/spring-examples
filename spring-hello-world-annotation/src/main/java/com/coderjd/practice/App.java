package com.coderjd.practice;

import com.coderjd.practice.config.AppConfig;
import com.coderjd.practice.model.Address;
import com.coderjd.practice.model.City;
import com.coderjd.practice.service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static ApplicationContext context;
    public static void main( String[] args ) {
        City city = City.builder().name("Pune").build();
        Address address = Address.builder().city(city).build();
        context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloService helloService= context.getBean("helloService", HelloService.class);

        helloService.setName("Amit");
        helloService.setAddress(address);
        helloService.sayHello();
    }
}