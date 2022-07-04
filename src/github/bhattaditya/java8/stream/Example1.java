package github.bhattaditya.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Example1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println("Filters even numbers - Predicate anonymous class");
        /* System.out.println("Anonymous class");
        numbers.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer number) {
                return number % 2 == 0;
            }
        }).forEach(System.out::println);*/

        System.out.println("Filters even numbers - Predicate using lambda expression");
        numbers.
                stream().
                filter(num -> num % 2 == 0).
                forEach(System.out::println); // Consumer

        System.out.println("Maps number (squares) - Function anonymous class");
        /*numbers.stream().map(new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer number) {
                return number * number;
            }
        }).forEach(System.out::println);*/

        System.out.println("Maps number (squares) - Function using lambda expression");
        numbers.
                stream().
                map(num -> num * num).
                forEach(System.out::println);

        System.out.println("Returns nothing - Consumer anonymous class");
        /*numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer number) {
                System.out.println(number);
            }
        });*/

        System.out.println("Returns nothing - Consumer represented by method reference");
        numbers.forEach(System.out::println);
    }
}
