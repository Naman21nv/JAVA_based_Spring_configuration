# Java-Spring1

This project is a compact Spring (core) example demonstrating Dependency Injection (DI) via XML and Java-based configuration.

Overview
- `Alien` depends on the `Computer` abstraction.
- `Laptop` and `Desktop` are concrete implementations of `Computer`.
- The project contains both `spring.xml` (XML-based wiring) and `AppConfig` (Java-based configuration with component-scan) to demonstrate both styles.

How to run
- Using Java-based configuration (current `App.main`):

```bash
# From project root (requires Maven and JDK installed locally)
mvn clean package
# Run the main class from your IDE or via:
# mvn exec:java -Dexec.mainClass="org.example.App"
```

- Using XML configuration instead of Java-based configuration:
  - Edit `App.java` to use `ClassPathXmlApplicationContext("spring.xml")`.

Key concepts documented in source code and `spring.xml`:
- Interface-based injection
- Constructor vs Setter injection
- Inner beans vs top-level beans
- Autowiring by type and by name
- Lazy initialization and bean scopes

Files changed
- Added explanatory comments to all source files and `spring.xml`.
- Kept code behavior unchanged.

Notes
- The project assumes the JDK and Maven are installed locally to build and run.
- Some classes contain `@ComponentScan("com.example")` that point to a different package; prefer using `AppConfig`'s `@ComponentScan("org.example")`.


