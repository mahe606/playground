package main.java.polymorphism.RunTime;

import java.util.Collection;
import java.util.List;

public class Father extends Human{
    public void intro(){
        System.out.println("I am a "+ this.getClass().getCanonicalName());

    }
}
