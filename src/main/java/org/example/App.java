package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

       // Desktop dt = context.getBean("desktop",Desktop.class);
        //by default name of the bean is the method name which is desktop here and the type is Desktop.class
        Desktop dt = context.getBean("desktop",Desktop.class);
        Desktop dt1= context.getBean("desktop",Desktop.class);



         dt1.compile();
        dt.compile();
    }
}
