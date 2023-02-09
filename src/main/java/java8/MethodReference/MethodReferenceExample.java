package java8.MethodReference;

public class MethodReferenceExample {
    public static void main(String[] args) {
/*        ArithmeticOperation arithmeticOperation = (a, b) -> {
            int sum = a + b;
            System.out.println("The sum is " + sum);
            return sum;
        };*/

        // static method reference
        ArithmeticOperation arithmeticOperation = MethodReferenceExample::sum;
        arithmeticOperation.performOperation(3, 4);


        // Object method reference
        MethodReferenceExample methodReferenceExample = new MethodReferenceExample();
        ArithmeticOperation add = methodReferenceExample::add;
        add.performOperation(8,9);

        // Constructor method reference
/*        ProductInterface productInterface = (name, id) -> new Product(name, id);
        productInterface.getProduct("pen", "100");*/
        ProductInterface productInterface = Product::new;
        productInterface.getProduct("pen", "100");
    }

    public static int sum(int a, int b) {
        int sum = a + b;
        System.out.println("The sum from static method is " + sum);
        return sum;
    }

    public int add(int a, int b) {
        int sum = a + b;
        System.out.println("The sum from non static method is " + sum);
        return sum;
    }

}
