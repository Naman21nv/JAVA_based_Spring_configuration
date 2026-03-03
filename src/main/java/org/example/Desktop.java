package org.example;

/**
 * Desktop class implementing the Computer interface.
 * Used as a bean in Spring for dependency injection.
 *
 * Topics covered:
 * - Interface implementation
 * - Bean definition
 * - Method overriding
 */
public class Desktop implements Computer {
    /**
     * Implementation of compile() for Desktop.
     * Prints a message to indicate compilation on desktop.
     */
    @Override
    public void compile() {
        System.out.println("Compiling code on the desktop...");
    }
}
