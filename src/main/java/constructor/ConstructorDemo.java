package constructor;

public class ConstructorDemo {
    private String name;
    private int age;


    /*Since constructor can only return the object to class,
    it's implicitly done by java runtime and we are not supposed to add a return type to it.
    If we add a return type to a constructor, then it will become a method of the class.
    This is the way java runtime distinguish between a normal method and a constructor.*/

    public ConstructorDemo(){
        System.out.println("default constructor called...");
    }

    public String  ConstructorDemo(){
        System.out.println("method called...");
        return null;
    }

    public static void main(String[] args) {
        ConstructorDemo constructorDemo = new ConstructorDemo();
        constructorDemo.ConstructorDemo();
    }
}
