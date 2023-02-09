package java8.functionalInterface;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> value = input -> System.out.println("The value is hello " + input.toUpperCase());

        value.accept("java 8");

        Consumer<String> newValue = input -> System.out.println("the new value is hello new " + input);

        newValue.accept("java 11");

        value.andThen(newValue).accept("java 8");
    }
}
