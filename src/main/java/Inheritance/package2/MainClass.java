package Inheritance.package2;


import Inheritance.package1.Parent;

public class MainClass {
    public static void main(String[] args) {
        Parent parent = new Parent();

        // only public method can be called
        parent.m4();
    }


}
