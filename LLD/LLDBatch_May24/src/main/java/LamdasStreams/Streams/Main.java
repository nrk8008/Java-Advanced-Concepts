package LamdasStreams.Streams;
import org.apache.logging.log4j.message.MapMessage;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {

        // Stream from Integers
        System.out.println("Stream from Integers");
        IntStream intStream = IntStream.rangeClosed(1,5);
        intStream.forEach(System.out::println);

        // Streams from Arrays
        System.out.println("Stream from Arrays");
        String[] cities = {"Newyork", "London", "Tokyo", "Paris"};
        Stream<String> cityStream = Arrays.stream(cities);
        cityStream.forEach(System.out::println);

        // Streams from Collections
        System.out.println("Stream from Collections");
        List<String> fruits = Arrays.asList("Apple", "Banana", "Mango", "Orange");
        Stream<String> fruitsStream = fruits.stream();
        fruitsStream.forEach(System.out::println);
        // Filtering and Mapping Example
        System.out.println("Filtering Fruits starting with A and converting to Uppercase");
        List<String> result = fruits.stream()
                              .filter(fruit->fruit.startsWith("A"))
                              .map(String::toUpperCase)
                              .collect(Collectors.toList());
        System.out.println(result);

        //filter even numbers from int stream
        System.out.println("Filtering even Numbers from a Int Stream");
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> evenNumbers = stream.filter(n -> n % 2 == 0);
        evenNumbers.forEach(System.out::println);
    }
}
