package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
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

    /**
        * juts like how in spring.xml file we will use ref to inject the dependency here we are using method parameter to inject the dependency
        * and we are using @Qualifier to specify which bean we want to inject if there are multiple beans of the same type
        * @qualifier() says that which bean we want to inject if there are multiple beans of the same type in this case
        *  we have two beans of type Computer one is desktop and other is laptop so we are using @Qualifier("desktop")
         * to specify that we want to inject the desktop bean
     */
    //public Alien alien( @Qualifier("desktop") Computer com)
    @Bean
  public Alien alien( @Qualifier("desktop") Computer com){   // with and without autowired it will work
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
    @Bean
    @Primary
    public Laptop laptop(){
        Laptop lap=new Laptop();
        lap.compile();
        return lap;
    }
    /**
     * we can use qualifier to specify which bean we want to inject if there are multiple beans of the same type but if we want to specify one bean as primary
     *  or we can use @Primary annotation to specify that this bean should be used as the default when there are multiple beans of the same type
     *  so in this case we are using @Primary annotation to specify that the laptop bean should be used as the default when there are multiple beans of type Computer
     *  if we use both @Primary and @Qualifier then @Qualifier will take precedence over @Primary and the bean specified in @Qualifier will be injected
     */
}
