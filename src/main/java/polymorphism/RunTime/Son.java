package main.java.polymorphism.RunTime;

public class Son extends Father{
    public void intro(){
        System.out.println("I am a "+ this.getClass().getCanonicalName());
    }
}
