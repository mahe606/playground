package java8.functionalInterface;

import java.util.function.Function;
import java.util.function.UnaryOperator;


public class UnaryOperatorExample {

    public static void main(String[] args) {
        /*whenever the type of input and output is same, we can go for unary operator
        * instead of Function  */

        UnaryOperator<String> upperCase = str -> str.toUpperCase();
        System.out.println("To Upper case  : " + upperCase.apply("mahesh"));

        UnaryOperator<String> sameValue = UnaryOperator.identity();
        System.out.println("Function Identity()  :" + sameValue.apply("Mahesh"));

        Function<Integer,Integer> doubleTheNumber = x -> {
            System.out.println("Double the number");
            return x * 2;
        };

        UnaryOperator<Integer> tripleTheNumber = x -> {
            System.out.println("Triple the number");
            return x * 3;
        };

        // Chaining of methods using andThen
        doubleTheNumber = doubleTheNumber.andThen(tripleTheNumber);

        System.out.println("Double and then triple  : " + doubleTheNumber.apply(20));

    }

}
