package java8.defaultMethods;

public interface Vehicle {

    // static method inside interface in now possible in java 8
    static void sayHello(){
        System.out.println("Say Hello from interface Vehicle");
    }

    public static void main(String[] args) {
        System.out.println("*****");
        sayHello();
    }

    int getSpeed();
    void applyBreak();

    default void autoPilot(){
        System.out.println("Auto Pilot activated in all Vehicles... ");
    };


}
