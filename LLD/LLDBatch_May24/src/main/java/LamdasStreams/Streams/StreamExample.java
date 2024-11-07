package LamdasStreams.Streams;

import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        // For each in Streams

        List<Integer> numbers = List.of(1,2,3,4,5);
        //normally we traverse through list.
        for(Integer i:numbers){
            System.out.println(i);
        }

        /* using Streams; */
        Stream stream = numbers.stream();
        stream.forEach(System.out::println);

        // this fails because the stream has already exhausted.
        //stream.forEach(System.out::println);


        /* two types of operation we can do on streams

        1. Terminal Operation -- ending operations
            It consumes from the stream and does action on each and every element.

        2. Intermediate Operation
            Filter():- is a Intermediate operation
            map():- is a Intermediate operation to transform*/
            numbers.stream()
                    .filter(n -> n% 2 == 0)
                    .forEach(System.out::println);

            List<Integer> numbers2 = List.of(7,8,12,25,20);
            numbers2.stream()
                    .filter(n -> n>2 && n % 2 == 0)
                    .forEach(System.out::println);

            System.out.println("Square every number in the list");
            numbers2.stream()
                    .map(n -> n*n)
                    .forEach(System.out::println);

            // write a stream code to turn a list of words into uppercase

            List<String> strings = List.of("a","b","c","d","e","f","g");
            strings.stream()
                    .map(n-> n.toUpperCase())
                    .forEach(System.out::println);

    }
}
