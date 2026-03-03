package org.example;

/**
 * Represents an Alien bean in the Spring context.
 * Demonstrates dependency injection via constructor and setter methods.
 * The Computer dependency is injected by Spring, allowing loose coupling.
 *
 * Topics covered:
 * - Constructor Injection
 * - Setter Injection
 * - Interface-based dependency injection
 * - Spring bean lifecycle
 */
public class Alien {
    /** Age of the Alien. Injected via constructor or setter. */
    int age;

    /**
     * Computer dependency (can be Laptop, Desktop, etc.).
     * Injected by Spring using the Computer interface for flexibility.
     */
    Computer com;

    /**
     * No-argument constructor required for setter injection and Spring bean instantiation.
     */
    public Alien() {
        System.out.println("No-arg constructor called...");
    }

    /**
     * Constructor for constructor-based dependency injection.
     * @param age Age of the Alien
     * @param com Computer implementation (Laptop, Desktop, etc.)
     */
    public Alien(int age, Computer com) {
        this.age = age;
        this.com = com;
        System.out.println("Constructor called... Injection done...");
    }

    /**
     * Getter for age property.
     */
    public int getAge() {
        return age;
    }

    /**
     * Setter for age property. Used by Spring for setter injection.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Getter for Computer dependency.
     */
    public Computer getCom() {
        return com;
    }

    /**
     * Setter for Computer dependency. Used by Spring for setter injection.
     */
    public void setCom(Computer com) {
        this.com = com;
    }

    /**
     * Demonstrates using the injected Computer dependency.
     * Calls compile() on the Computer and prints a message.
     */
    public void code() {
        if (com!= null) {
            com.compile();
            System.out.println("Alien is coding in Java!");
        }
    }
}
