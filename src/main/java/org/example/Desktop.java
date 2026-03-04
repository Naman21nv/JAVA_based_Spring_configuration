package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


//@Component("name_of_desktop_bean") //we can use this to give a specific name to the bean, otherwise it will be "desktop" by default (class name with first letter in lowercase)
@Component
@ComponentScan("org.example")
@Primary
public class Desktop implements Computer {
    public Desktop() {
        System.out.println("Desktop constructor called");
    }
    @Override
    public void compile() {
        System.out.println("Compiling code on the desktop...");
    }
}
