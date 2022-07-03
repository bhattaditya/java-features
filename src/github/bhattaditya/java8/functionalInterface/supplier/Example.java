package github.bhattaditya.java8.functionalInterface.supplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class Example {
    public static void main(String[] args) {

        // This interface accepts no argument and return a value of type T
        Supplier<LocalDateTime> supplier = LocalDateTime::now; // method reference

        System.out.println(supplier.get());
    }
}
