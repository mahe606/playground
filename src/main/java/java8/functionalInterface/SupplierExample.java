package java8.functionalInterface;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        // here <Integer> is input type

        Supplier<Integer> dayOfTheMonth = () -> LocalDate.now().getDayOfMonth();

        System.out.println(dayOfTheMonth.get());

        Supplier<String> currentDay = () -> LocalDate.now().getDayOfWeek().name();

        System.out.println(currentDay.get());
    }
}
