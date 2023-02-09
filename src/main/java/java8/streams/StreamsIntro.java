package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsIntro {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Mahesh");
        names.add("Mohan");
        names.add("Devaki");
        names.add("Karthik");


        // in streams the data will be processed sequentially, insertion order is maintained
        Stream<String> nameStream = names.stream();
        nameStream.forEach(System.out::println);

        System.out.println();
        Stream<String> anotherStream = Stream.of("Mahesh", "Mithran", "Preethi");
        anotherStream.forEach(System.out::println);


        System.out.println();
        // In parallel stream data will be processed in parallel so the output will not be in order
        Stream<String> nameParallelStream = names.parallelStream();
        nameParallelStream.forEach(System.out::println);
    }
}
