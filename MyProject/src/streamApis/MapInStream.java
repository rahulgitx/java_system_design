package streamApis;

import java.util.*;
import java.util.stream.Stream;

public class MapInStream {
    public static void main(String[] args) {
        String[] words = new String[]{"abc", "def","geh"};

        Stream<Object> stream = Arrays.stream(words).map(String::toUpperCase);
        stream.forEach(System.out::println);

        List<String> sentences = Arrays.asList("Hello World", "Java Streams");

        // Using map()
        Stream<String[]> wordArraysStream = sentences.stream()
                .map(sentence -> sentence.split(" "));
    }
}
