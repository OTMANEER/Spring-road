package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

public class Parrot {
    private Person person;
    private String name;

    public String getName() {
        return name;
    }

    public Parrot() {
        System.out.println("Parrot Created");
    }

    public Parrot(Person person) {
        System.out.println("Parrot created");
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPerson(Person p){
        person = p;
    }
}