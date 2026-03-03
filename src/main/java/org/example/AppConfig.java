package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Spring Java-based configuration class.
 * Defines beans and their dependencies using @Bean methods.
 *
 * Topics covered:
 * - @Configuration annotation
 * - @Bean annotation for bean creation
 * - Dependency injection via method parameters
 * - Bean scope (singleton/prototype)
 */
@Configuration
public class AppConfig {
    /**
     * Defines the Alien bean and injects a Computer dependency.
     * @param com Computer implementation (Desktop, Laptop, etc.)
     * @return Alien bean instance
     */
    @Bean
  public Alien alien( Computer com){   // with and without autowired it will work
        Alien obj=new Alien();
        obj.setAge(29);
        //obj.setCom(desktop()); // this is tightly coupled wt if Laptop obj is there and we want to create for that making seprate is difficult
         obj.setCom(com);
        return obj;
  }


    /**
     * Defines the Desktop bean. Can be injected wherever Computer is required.
     * @return Desktop bean instance
     */
    @Bean
   // @Scope("prototype")  // by default scope is singleton but here we are changing it to prototype so that every time we call the bean it will create a new instance of the bean
    public Desktop desktop()  {
        return new Desktop();
    }
}
