package com.cc.java;

import com.cc.java.interfaces.Flyable;
import com.cc.java.interfaces.IFeathers;

public class Bird implements Flyable, IFeathers {

    @Override
    public String fly() {
        return "I'm a Bird, i can fly!";
    }

    @Override
    public String hasFeathers() {
        return "I have Feathers!";
    }
    

    
}
