package github.bhattaditya.java8.functionalInterface.function;

import java.util.function.Function;

public class Example1 {
    public static void main(String[] args) {

        // lambda expression
        Function<Integer, Integer> square = (a -> a * a);
        System.out.println(square.apply(10));

        // method reference
        Function<String, Integer> stringLength = (String::length);
        System.out.println(stringLength.apply("IntelliJ Idea"));
    }
}
