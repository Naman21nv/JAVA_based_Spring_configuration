package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Main application entry point for demonstrating Spring bean configuration.
 * Shows how to retrieve beans from the Spring context and use them.
 *
 * Topics covered:
 * - ApplicationContext usage
 * - Bean retrieval by type
 * - Invoking bean methods
 */
public class App {
    public static void main(String[] args) {
        // Create Spring context using Java-based configuration (AppConfig)
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Example: Retrieve Alien bean by type and use its methods
        Alien alien = context.getBean(Alien.class);
        System.out.println(alien.getAge()); // Prints Alien's age
        alien.code(); // Demonstrates dependency injection and method invocation
    }
}
