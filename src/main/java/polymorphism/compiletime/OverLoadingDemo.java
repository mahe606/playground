package main.java.polymorphism.compiletime;

public class OverLoadingDemo {
    /*
    * Over Loading
    *  - same method name
    *  - different type of arguments possible
    *  - different number of arguments possible
    *  - different return type not possible
    *  - return of subtype is not possible
    * */


    // add with 2 parameters
    public int add(int x, int y){
        return x + y;
    }

    // add with 3 parameters
    public int  add(int x, int y, int z){
        return x+y+z;
    }

    // add with 3 parameters with different return type - not possible
    // 'add(int, int, int)' is already defined in 'main.java.polymorphism.compiletime.OverLoadingDemo'
/*    public String add(int x, int y, int z){
        return "add method called";
    }*/

    public static void main(String[] args) {
        OverLoadingDemo overLoadingDemo = new OverLoadingDemo();
        System.out.println(overLoadingDemo.add(2, 4));
        System.out.println(overLoadingDemo.add(2, 5, 7));
    }

}
