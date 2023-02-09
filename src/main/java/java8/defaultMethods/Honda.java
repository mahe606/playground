package java8.defaultMethods;

public class Honda implements Vehicle{

    // static method inside class
    public static void sayHello(){
        System.out.println("Say Hello from Class Honda");
    }


    @Override // overriding abstract method (mandatory)
    public int getSpeed() {
        return 100;
    }

    @Override // overriding abstract method (mandatory)
    public void applyBreak() {
        System.out.println("Break applied...");
    }

    @Override // overriding a default method (not mandatory)
    public void autoPilot() {
        Vehicle.super.autoPilot(); // calling super class default method
        System.out.println("Honda Implemented auto pilot feature");
    }

    public static void main(String[] args) {
        Honda honda = new Honda();
        System.out.println(honda.getSpeed());
        honda.applyBreak();
        honda.autoPilot();
        Honda.sayHello();

        // calling static method from interface
        Vehicle.sayHello();
    }


}
