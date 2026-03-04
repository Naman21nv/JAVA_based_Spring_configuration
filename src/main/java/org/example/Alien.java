package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Alien bean used in examples of Spring Dependency Injection.
 *
 * Theory and purpose (high-level):
 * - This class demonstrates how Spring injects dependencies (a `Computer` implementation)
 *   into a consumer class. The injection can be performed either by constructor
 *   or by setter (or field) injection depending on configuration.
 *
 * Key concepts illustrated by this class and the surrounding project:
 * 1) Interface-based injection
 *    - The field `com` is of type `Computer` (an interface). Spring will inject
 *      any bean that implements `Computer` (e.g., `Laptop` or `Desktop`). This
 *      promotes loose coupling and easier testing.
 *
 * 2) Setter vs Constructor Injection
 *    - Constructor injection passes dependencies when the object is created.
 *      Example constructor: Alien(int age, Computer com)
 *    - Setter injection creates the object first (no-arg constructor) and then
 *      calls setter methods (setAge, setCom) to provide dependencies. XML
 *      property injection or @Autowired on a setter implements this.
 *    - Constructor injection is preferred for mandatory dependencies; setter
 *      injection is useful for optional or easily reconfigurable dependencies.
 *
 * 3) How Spring matches properties in XML to Java properties
 *    - If you use XML like <property name="com">, Spring looks for a Java
 *      bean property named `com` (setter `setCom(...)` or a writable field).
 *      Renaming the field or setter (e.g., to `com1`/`setCom1`) without
 *      updating XML will cause injection to fail.
 *
 * 4) Autowiring and annotation-based configuration
 *    - When using annotation-based configuration and component-scanning, use
 *      @Autowired to tell Spring to inject a bean by type (and optionally by
 *      qualifier/name). When using XML, you can use autowire="byName" or
 *      autowire="byType" on the <bean> element.
 *
 * 5) Inner beans vs top-level beans
 *    - The project demonstrates an inner-bean pattern in `spring.xml` where
 *      a `Laptop` is declared inside the `Alien` bean. Inner beans are private
 *      to the enclosing bean and cannot be retrieved from the container by id.
 *
 * Notes about annotations in this project:
 * - @Component marks this class as a candidate for component scanning if
 *   component-scan is enabled in configuration (for example in `AppConfig`).
 * - The @ComponentScan("com.example") annotation seen in some files is not
 *   correct for this project's package (these classes are in `org.example`).
 *   Prefer placing @ComponentScan on the @Configuration class with the proper
 *   package (AppConfig currently uses @ComponentScan("org.example")).
 */
@Component
public class Alien {
    int age;

    Computer com;

    /** No-arg constructor. Spring can instantiate the bean with this and then use
     *  setter injection (if configured). */
    public Alien() {
        System.out.println("No-arg constructor called...");
    }

    /** Constructor intended for constructor-based injection.
     *  Use constructor injection when a dependency is required for the object to
     *  be in a valid state. If Spring is configured to call this constructor
     *  (via XML <constructor-arg/> or @Autowired on the constructor), the
     *  Computer dependency will be provided by the container.
     */
    @Autowired
    public Alien(@Value("10") int age, Computer com) {
        this.age = age;
        this.com = com;
        System.out.println("Constructor called... Injection done...");
    }

    public int getAge() {
        return age;
    }

    /** Setter used for setter-based injection. When using XML property
     *  injection (<property name="age" .../>) or when @Autowired is placed on
     *  the setter, Spring will call this to provide the value.
     */
    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    /** Setter for the Computer dependency. When XML or annotation configuration
     *  injects this property, Spring will pass a bean that implements Computer.
     */
    public void setCom(Computer com) {
        this.com = com;
    }

    /** Business method that uses the injected dependency. */
    public void code() {
        if (com!= null) {
            com.compile();
            System.out.println("Alien is coding in Java!");
        }
    }
}
