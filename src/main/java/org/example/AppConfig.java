package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Java-based Spring configuration class.
 *
 * Theory and usage:
 * - @Configuration marks this class as a source of bean definitions for the
 *   Spring container.
 * - @ComponentScan("org.example") tells Spring to scan the specified package
 *   for @Component, @Service, @Repository, and @Controller classes and
 *   register them as beans.
 *
 *   if we do like this we no need to create bean manually just these 2 Annotation is enough to create bean and inject dependency
 *
 * Notes:
 * - Choose either XML or Java-based configuration for clarity. This project
 *   contains `spring.xml` demonstrating XML-based configuration and this
 *   class demonstrating Java/annotation-based configuration. Ensure the
 *   approach you run matches the context creation in `App.java`.
 */
@Configuration
@ComponentScan("org.example")
public class AppConfig {

}
