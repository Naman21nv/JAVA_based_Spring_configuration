package org.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope("prototype")  // by default scope is singleton but here we are changing it to prototype so that every time we call the bean it will create a new instance of the bean
    public Desktop desktop()  {
        return new Desktop();
    }
}
