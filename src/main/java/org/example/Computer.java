package org.example;

/**
 * Computer interface for demonstrating polymorphic dependency injection in Spring.
 * Implemented by Desktop and Laptop classes.
 *
 * Topics covered:
 * - Interface-based injection
 * - Loose coupling
 */
public interface Computer {
    /**
     * Compile method to be implemented by concrete classes.
     */
    void compile();
}
