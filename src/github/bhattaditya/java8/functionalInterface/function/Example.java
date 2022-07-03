package github.bhattaditya.java8.functionalInterface.function;

import java.util.function.Function;

public class Example {
    public static void main(String[] args) {

        // This functional interface takes one argument and produces a result.
        Function<String, Integer> fun = String::length;

        int num = fun.apply("Length of text");
        System.out.println(num);
    }
}
