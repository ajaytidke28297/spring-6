package com.explnatory.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) { }

record Address (String firstLine,String city){}
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Ajay";
    }

    @Bean
    public int age() {
        return 25;
    }

    @Bean
    public Person person() {
        var person = new Person("Ravi", 20);
        return person;
    }

    @Bean
    public Address address() {
        return new Address("London", "London");
    }
}
