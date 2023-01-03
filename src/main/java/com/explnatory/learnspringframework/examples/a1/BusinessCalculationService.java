package com.explnatory.learnspringframework.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class BusinessCalculationService {

    DataService dataService;

    @Autowired
    public BusinessCalculationService(DataService dataService) {
        this.dataService = dataService;
    }

    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(BusinessCalculationService.class)) {
            System.out.println();
        }
    }
}

@Component
interface DataService {
    int [] retrieveData();
}

@Component
@Primary
class MongoDbDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[] {11, 22, 33, 44, 55};
    }
}

@Component
class MySQLDataService implements DataService{
    @Override
    public int[] retrieveData() {
        return new int[] {11, 22, 33, 44, 55};
    }
}