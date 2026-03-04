package org.example;

import org.springframework.stereotype.Component;

/**
 * Desktop implementation of the Computer interface.
 */
@Component
public class Desktop implements Computer {
    @Override
    public void compile() {
        System.out.println("Compiling code on the desktop...");
    }
}
