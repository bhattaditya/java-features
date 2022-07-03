package github.bhattaditya.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
  Stream API works with collections, objects are pipelined to produce a desired result.
  Collections are not altered when used as a stream.
  filter(), map() are most common usages of Stream API
*/

public class Example {
    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(1, 2, 3, 4, 5);

        // filters even numbers from 'List' collections and prints result using 'forEach' loop
        arrayList.stream().filter(num -> (num) % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("---------");

        // maps each number of arrayList
        arrayList.stream().map(num-> num*2).collect(Collectors.toList()).forEach(System.out::println);

    }
}
