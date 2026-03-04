package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Application entry point.
 *
 * Usage notes:
 * - This main currently creates an AnnotationConfigApplicationContext using
 *   `AppConfig` which enables component scanning for `org.example`.
 * - If you prefer XML configuration you can replace the context creation with
 *   ClassPathXmlApplicationContext("spring.xml") to load `spring.xml`.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien alien = context.getBean(Alien.class);
        System.out.println(alien.getAge());
        alien.code();
    }
}
