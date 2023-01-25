package main.java.polymorphism.RunTime;

public class Human {
    public void intro(){
        System.out.println("I am a "+ this.getClass().getCanonicalName());
    }
}
