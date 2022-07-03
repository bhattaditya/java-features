package github.bhattaditya.java8.functionalInterface.predicate;

import java.util.function.Predicate;

public class Example {
    public static void main(String[] args) {

        // This functional interface accepts one argument and return a boolean

        Predicate<Integer> predicate = (num) -> num % 2 == 0; // lambda expression

        System.out.println(predicate.test(10));
        System.out.println(predicate.test(11));
    }
}
