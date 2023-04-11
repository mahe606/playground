package java8.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {

        /*takes one object as input
         * returns given object
         *  method name is apply*/

        Function<String, String> upperCase = str -> str.toUpperCase();
        System.out.println("To Upper case  : " + upperCase.apply("mahesh"));

        BiFunction<String, String, Integer> getStringLength = (str, str1) -> str.length() + str1.length();

        System.out.println("Length of my name is " + getStringLength.apply("mahesh", "Thamilarasu"));

        Function<String, String> sameValue = Function.identity();
        System.out.println("Function Identity()  :" + sameValue.apply("Mahesh"));

        Function<Integer, Integer> multiply = x -> {
            System.out.println("Double the number");
            return x * 2;
        };

        // Chaining of methods using andThen
        multiply = multiply.andThen(x -> {
            System.out.println("Triple the number");
            return x * 3;
        }).andThen(x -> {
            System.out.println("4Times the number");
            return x * 4;
        });

        System.out.println("Double and then triple  :" + multiply.apply(2));

        Function<Integer, Integer> divide = x -> {
            System.out.println("Divide by 2");
            return x / 2;
        };

        // Chaining of methods using compose
        divide = divide.compose(x -> {
            System.out.println("Divide by 3");
            return x / 3;
        });

        System.out.println("Divide by 3 then by 2  :" + divide.apply(30));
    }

}
