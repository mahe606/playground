package java8.defaultMethods;

public interface Vehicle {

    // static method inside interface in now possible in java 8
    public static void sayHello(){
        System.out.println("Say Hello from interface Vehicle");
    }

    public static void main(String[] args) {
        sayHello();
    }

    public int getSpeed();
    public void applyBreak();

    public default void autoPilot(){
        System.out.println("Auto Pilot activated in all Vehicles... ");
    };


}
