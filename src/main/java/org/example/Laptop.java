package org.example;

/**
 * Laptop class implementing the Computer interface.
 * Used as a bean in Spring for dependency injection.
 *
 * Topics covered:
 * - Interface implementation
 * - Bean definition
 * - Method overriding
 */
public class Laptop implements Computer {
    /**
     * Implementation of compile() for Laptop.
     * Prints a message to indicate compilation on laptop.
     */
    @Override
    public void compile() {
        System.out.println("Compiling code on the laptop...");
    }
}
