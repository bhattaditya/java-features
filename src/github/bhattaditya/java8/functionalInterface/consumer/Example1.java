package github.bhattaditya.java8.functionalInterface.consumer;

import java.util.function.Consumer;

public class Example1 {
    public static void main(String[] args) {

        // lambda expression
        Consumer<String> consumer = (str -> System.out.println(str.length()));
        consumer.accept("IntelliJ Idea");

        // method reference
        Consumer<String> consumer1 = (String::length);
        consumer.accept("IntelliJ Idea");
        System.out.println(consumer1);
    }
}
