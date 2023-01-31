package java8.functionalInterface;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<String> isLong = str -> str.length() > 50;
        System.out.println(isLong.test("cjdhjcdhbdccjdhjcdhbdccjdhjccjdhjcdhbdccjdhjcdhbdccjdhjcdhbdccjdhjcdhbdccjdhjcdhbdc"));

        Predicate<Integer> isEven = input -> input % 2 == 0;
        System.out.println(isEven.test(60));

        Predicate<Integer> isGraterTHan50 = a -> a > 50;


        // and() is used to test 2 predicates with AND condition
        System.out.println("is grater then 50 and even : " + isGraterTHan50.and(isEven).test(60));

        //  or() is used to test 2 predicates with OR condition
        System.out.println("is grater then 50 or even : " + isGraterTHan50.or(isEven).test(11));

        // negate() will apply not operator on top of the result
        System.out.println("! of isGraterTHan50  : " + isGraterTHan50.negate().test(10));
    }


}
