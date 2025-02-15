package streamApis;

import java.util.*;
import java.util.stream.Stream;

public class FlatMap {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("Hello World", "Java Streams");

        // Using map()
        Stream<String[]> wordArraysStream = sentences.stream()
                .map(sentence -> sentence.split(" "));

        // Flatten manually
        wordArraysStream.forEach(array -> {
            for (String word : array) {
                System.out.println(word);
            }
        });

        // Using flatMap()
        Stream<String> flattenedStrings = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" "))) // Flatten words
                .distinct();                                             // Remove duplicates
        flattenedStrings.forEach(System.out::println);
    }
}
