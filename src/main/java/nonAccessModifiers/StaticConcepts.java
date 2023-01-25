package nonAccessModifiers;

public class StaticConcepts {
    static int a;
    int b;
    static{
        System.out.println("inside static block");
        a = 10;

        // this is not possible
        // b = 20;

        m1();
    }

    static void m1(){
        // creating a static variable inside a method is not possible
        // static int num = 10;

        System.out.println("inside m1()");
    }


    public static void main(String[] args) {
        System.out.println("inside main()");
        System.out.println(a);
    }
}
