package main.trashed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Person {
    private String name = "Ella";
    private Parrot parrot;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }

    public Person(
            @Qualifier ("parrot2") Parrot parrot) {
        System.out.println("Person Created");
        this.parrot = parrot;
    }

    public Parrot getParrot() {
        return parrot;
    }

    public Person() {
        System.out.println("Person is created");
    }
}