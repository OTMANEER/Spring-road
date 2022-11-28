package main;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Parrot {
    private String name;

    public Parrot() {
        System.out.println("New Parrot created");
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                '}';
    }

    @PostConstruct
    public int ten(){
        return 10;
    }



}

