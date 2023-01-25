package nonAccessModifiers;

public class FinalConcepts {
    final int a = 10;

    // a final variable must me initialized or we will get compilation error.
    static final double PI = 3.14;

    static  String NAME = "Mahesh Thamilarasu";

    // this method cannot be overridden by any of the derived classes
    final void m1(){
        final int a; // not necessary to assign when declaring the variable
        a = 5; // value can be assigned only once

        // a = 10; assigning again is not possible
    }

    public static void main(String[] args) {
        // not possible
        //Name  = "Mithran";

        System.out.println(NAME);


        //Reference final variable
        final StringBuilder mahesh = new StringBuilder();
        StringBuilder mithran = new StringBuilder();


        mahesh.append("Mahesh"); // possible
        mahesh.append("Thamilarasu"); // possible

        mithran.append("Mithran");

        // not possible when mahesh is final
        //mahesh = mithran;

    }

}
