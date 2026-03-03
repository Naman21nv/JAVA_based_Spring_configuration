package org.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="com2")  //@Bean(name={"desktop5","com2"})  //we can give multiple names to the same bean and we can use any of the names to retrieve the bean from the context
    public Desktop desktop(){
        return new Desktop();
    }
}
