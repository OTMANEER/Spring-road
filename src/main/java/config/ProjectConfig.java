package config;

import main.Parrot;
import main.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;

@Configuration
@ComponentScan(basePackages = "main")
public class ProjectConfig {
    /*
    @Bean
    @Primary
    Parrot parrot(){
        Parrot p = new Parrot();
        p.setName("Karro");
        return p;
    }

    @Bean
    Parrot parrot2(){
        Parrot p2 = new Parrot();
        p2.setName("PARA");
        return p2;
    }

    @Bean
    Parrot parrot3(){
        Parrot p3 = new Parrot();
        p3.setName("ZORO");
        return p3;
    }

    @Bean
    String hello(){
        return "Hello";
    }

    @Bean
    int ten(){
        return 10;
    }
*//*
    @Bean
    public Parrot parrot(){
        Parrot p = new Parrot();
        p.setName("Parrot1");
        return p;
    }
    @Bean
    public Parrot parrot2(){
        Parrot p = new Parrot();
        p.setName("Parrot2");
        return p;
    }

    // we can establish the relation between Parrot and the Person as the following.
    @Bean
    public Person person(Parrot parrot){
        Person p = new Person();
        p.setName("Person1");
        p.setParrot(parrot);
        return p;
    }*/
    /*@Bean
    public Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }*/
    @Bean
    public Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("KOKO");
        return p;
    }
    @Bean
    public Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Miki");
        return p;
    }
    @Bean
    public Person person(
            @Qualifier ("parrot2")
            Parrot parrot2) {
        Person p = new Person();
        p.setName("Ella");
        p.setParrot(parrot2);
        return p;
    }
}
