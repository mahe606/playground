package main.java.Inheritance.package1;




public class Demo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        log(animal.talk());
        log(animal.walk(2));
        log("\n");

        Animal animal1 = new Dog();
        log(animal1.talk());
        log(animal1.walk(2));
        log(animal1.weight(100));
        log("\n");

        Dog animal2 = new Dog();
        log(animal2.talk());
        log(animal2.walk());
        log(animal2.jump());
        log(animal2.weight((long) 100));
        log(animal2.weight(20));
        log("\n");


        Parent parent = new Parent();
        // calling default method
        parent.m2();

        //calling public method
        parent.m4();

        // calling protected method
        parent.m3();

        System.out.println();
        Child child = new Child();

        child.m1();
        child.m2();
        child.m3();

    }

    static void log(String str){
        System.out.println(str);
    }
}