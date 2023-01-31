package java8.lamda;

public class LamdaExamples {

    public static NoParamsDemo object = () -> {
        System.out.println("Hello from object");
    };

    private int sum;

    public static void main(String[] args) {
        object.printHello();
        voidMethodWithNoParam();
        voidMethodWithOneParam();
        voidMethodWithTwoParam();
        returnIntMethod();

        LamdaExamples lamdaExamples = new LamdaExamples();
        lamdaExamples.sum(9, 10);
    }

    public static void voidMethodWithNoParam() {
        NoParamsDemo object1 = () -> {
            System.out.println("Hello from object 1");
        };

        NoParamsDemo object2 = () -> {
            System.out.println("Hello from object 2");
        };

        object2.printHello();
        object1.printHello();

    }

    public static void voidMethodWithOneParam() {
        OneParamDemo method1 = (input) -> {
            System.out.println(input.toLowerCase());
        };

        OneParamDemo method2 = str -> System.out.println(str.toUpperCase());

        method1.print("Hello");
        method2.print("World");
    }

    public static void voidMethodWithTwoParam() {
        TwoParamDemo add = (a, b) -> {
            System.out.println(a + b);
        };

        TwoParamDemo multiply = (a, b) -> {
            System.out.println(a * b);
        };

        add.process(2, 5);
        multiply.process(2, 5);
    }

    public static void returnIntMethod() {
        ReturnValueDemo add = (a, b) -> {
            return (a + b);
        };
        System.out.println(add.process(3, 4));

        ReturnValueDemo multiply = ((a, b) -> a * b);
        System.out.println(multiply.process(3, 4));
    }


    // explains scope of local variables inside lamda
    public void sum(int a, int b) {
        int temp = 0;
        ReturnValueDemo add = ((x, y) -> {
            int sum = 0;
            System.out.println("Value of temp is " + temp);
            // temp = 1; // Compilation error;
            System.out.println("Value of local variable sum is " + sum);
            this.sum = a + b;
            return this.sum;
        });
        add.process(a,b);
    }

}



