package java8.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<Integer> number = Optional.of(90);
        System.out.println(number.get());
        //ifPresent
        number.ifPresent(integer -> System.out.println("Present"));

        // map
        System.out.println(number.map(integer -> integer + 23).get());

        // filter
        System.out.println(number.filter(integer -> integer == 91)
                .orElse(100));



    }
}

