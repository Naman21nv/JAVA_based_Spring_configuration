package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Laptop implementation of the Computer interface.
 *
 * Theory and usage:
 * - Concrete implementation that will be injected into consumers expecting a
 *   Computer. When component-scanning is enabled or when declared as a bean in
 *   XML, Spring will create an instance and make it available for injection.
 * - This simple implementation prints a message when compiling.
 */
@Component
@Primary
public class Laptop implements Computer {
    @Override
    public void compile() {
        System.out.println("Compiling code on the laptop...");
    }
}
