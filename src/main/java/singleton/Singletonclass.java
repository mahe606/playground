package singleton;

public class Singletonclass {
    /*follow the 3 steps to make this class a singleton*/


    // step1: Create a static object for the same class
    private static Singletonclass obj1 = new Singletonclass();

    // step2: create a private constructor so that no one else can create an object for this class using new keyword
    private Singletonclass(){

    }

    // Create a static method to return the static object created.
    public static Singletonclass getInstance(){
        return obj1;
    }
}
