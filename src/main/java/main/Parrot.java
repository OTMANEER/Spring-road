package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Parrot {
    private Person person;
    private String name;

    public String getName() {
        return name;
    }

    public Parrot() {
    }

    public Parrot(Person person) {
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