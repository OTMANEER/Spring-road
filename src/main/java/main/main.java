package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;

import java.util.function.Supplier;

public class main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context  = new AnnotationConfigApplicationContext(ProjectConfig.class);
//      Parrot p = context.getBean(Parrot.class);
/*
        Parrot p = new Parrot();
        p.setName("COCA COLA");
        Supplier<Parrot> supplier = ()->p;
        context.registerBean("Parrot",Parrot.class,supplier);
        Parrot pp = context.getBean("Parrot",Parrot.class);
        System.out.println("The name is: "+pp.getName());*/

/*        System.out.println(p.getName());
        // Callig back the String and the Integer decalared before.

        String s = context.getBean(String.class);
        Integer n = context.getBean(Integer.class);

        System.out.println("The value of String is: "+s+"\nThe value of the integer is: "+n);
*/
        // System.out.println(p.getName());
        // Chapter 3 => Wiring.
        // Wiring and auto Wiring in Spring.

        Person p1 = context.getBean("person2",Person.class);
        System.out.println((p1.getParrot()).getName());

    }
}
