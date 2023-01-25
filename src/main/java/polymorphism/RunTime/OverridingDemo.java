package main.java.polymorphism.RunTime;

public class OverridingDemo {
    public static void main(String[] args) {

        // Object off type Human
        Human human = new Human();

        // Object off type Father
        Father father = new Father();

        // Object off type Son
        Son son = new Son();



        // Now comes the Dynamic Dispatch or Run time Polymorphism
        Human person;

        // person refers to a Father Object
        person = father;
        person.intro();

        // person refers to a Son Object
        person = son;
        person.intro();

        // based on the type of the object referred the methods will be called
    }

}
