package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileOperations {

    public static void main(String[] args) {


        //readLines();
        regexExample();

    }

    public static void readLines() {
        String fileName = "C:/CSCS/ConsolidationWorkspaceEngine/OriginalCode/inboundRoutes.txt";


        try (Stream<String> lines = Files.lines(Paths.get(fileName))) {
            List<String> shipments = lines.filter(s -> s.matches("Route \\d+.*")).collect(Collectors.toList());

            for(String shipment:shipments){
                System.out.println(shipment);
                //Arrays.stream(shipment.split("\\|")).forEach(System.out::println);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void regexExample() {
        String input = "Route 1 | [112, 74, 13, 114] | [379, 379, 499, 378, 379.46, 498, 401, 401, 521, 415, 415, 535]";


        // Extract the last two elements as a list of integers
        List<String>  staringParts= Arrays.stream(input.split("\\|"))
                .skip(1) // Skip the first element
                .map(s -> s.replaceAll("\\[|\\]|\\s", "")) // Remove square brackets and spaces
                .collect(Collectors.toList());

        List<String> toIDList = Arrays.asList(staringParts.get(0).split(","));
        AtomicInteger index = new AtomicInteger(0);
        List<String> timeList = Arrays.stream(staringParts.get(1).split(","))
                .filter(e -> index.getAndIncrement() % 3 == 1) // Filter elements at index 1, 4, 7, ...
                .collect(Collectors.toList());

        System.out.println(toIDList);
        System.out.println(timeList);
    }
}
