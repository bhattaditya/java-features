package github.bhattaditya.java8.functionalInterface.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Example1 {

    public static void main(String[] args) {

        // lambda expression
        Predicate<Integer> integerPredicate = (num -> num % 2 == 0);

        System.out.println(integerPredicate.test(10));
        System.out.println(integerPredicate.test(11));
    }


}
