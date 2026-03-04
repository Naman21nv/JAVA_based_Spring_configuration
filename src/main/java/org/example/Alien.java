package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/** 3 times injection is possible in spring
 * 1. field injection ->
 * 2. constructor injection
 * 3. setter injection
 *
 *      where we write @Autowired annotation, there spring will inject the dependency
 *      if we use @Autowired on constructor, then spring will use that constructor to create the object and inject the dependencies
 *      if we use @Autowired on field, then spring will inject the dependencies directly into the field
 *      if we use @Autowired on setter method, then spring will call the setter method and inject the dependencies
 * */

@Component
public class Alien {
    int age;
    // @Autowired   ->becomes feild injection
     @Qualifier("desktop")  //qualifier name is the name as same as the class name with first letter in lowercase
    Computer com; //this is field injection

    public Alien() {
        System.out.println("No-arg constructor called...");
    }

    //@Autowired     ->constructor injection
    public Alien( int age, Computer com) {
        this.age = age;
        this.com = com;
        System.out.println("Constructor called... Injection done...");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }
    @Autowired //setter injection
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code() {
        if (com!= null) {
            com.compile();
            System.out.println("Alien is coding in Java!");
        }
    }
}
