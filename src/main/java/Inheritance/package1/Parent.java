package Inheritance.package1;

public class Parent {

    // this method can be called only buy other methods in this class
    // this cannot be overridden as this is private
     private void m1(){
        System.out.println("Prent private method m1");
    }

    // this is a default access modifier and can be called from classes with in the same package
    void m2(){
        System.out.println("Parent default method m2");
    }

    // protected method can be called by the classes in same package and classes which extends this class
    protected void m3(){
        System.out.println("Parent protected method m3");
    }

    // this public method can be called by any instance of this class in any other class
    public void m4(){
         m1();
    }
}
