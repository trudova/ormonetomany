package com.liv.bootstrap;

import com.liv.entity.Address;
import com.liv.entity.Person;
import com.liv.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class DataGenerator implements CommandLineRunner {
    @Autowired
    PersonRepository personRepository;

    @Override
    public void run(String... args) throws Exception {
        Person person1 = new Person("Mike", "Smith");
        Person person2 = new Person("liv", "tru");
        Person person3 = new Person("Poul", "Morgan");

        Address address1 = new Address("King St","12122");
        Address address2 = new Address("19th St","10122");
        Address address3 = new Address("java St","00122");
    }
}
