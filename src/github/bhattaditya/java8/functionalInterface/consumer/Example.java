package github.bhattaditya.java8.functionalInterface.consumer;

import java.util.function.Consumer;

public class Example {
    public static void main(String[] args) {

        // This functional interface accepts single value and returns no result

        Consumer<String> consumer = System.out::println; // method reference
        Consumer<String> consumer1 = (str) -> System.out.println(str); // lambda expression

        consumer.accept("Hi");
        consumer1.accept("Bye");

    }
}
