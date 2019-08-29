package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    MODELCLASSRepository repository;

    @Override
    public void run(String... strings) throws Exception {
        ModelClass modelclass;
        modelclass = new ModelClass("Jagsandbenzes", "Acuras and Hondas", "Fords and Chevys", 10);
        repository.save(modelclass);

       modelclass = new ModelClass("Mustard Seed", "Maya Angelou",
         "Rate of Change of the Rate of Change",10);
       repository.save(modelclass);

       modelclass = new ModelClass("Juices are my fave", "Randy Mossfootball",
         "Creating and learning vital code", 10);
       repository.save(modelclass);
    }
}
