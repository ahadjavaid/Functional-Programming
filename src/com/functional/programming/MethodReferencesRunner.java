package com.functional.programming;
import java.util.List;

public class MethodReferencesRunner {

    public static void print(Integer number) {
        System.out.println(number);
    }

    public  static boolean even(Integer integer) {
        if(integer % 2 == 0) {
            return  true;
        } else  {
            return false;
        }
    }

    public static void main(String[] args) {
        List.of("Ant","Bat","Cat","Dog","Elephant").stream().map(e -> e.length()).
                forEach(e -> System.out.println(e));

        List.of("Ant","Bat","Cat","Dog","Elephant").stream().map(e -> e.length()).
                forEach(System.out::println);

        List.of("Ant","Bat","Cat","Dog","Elephant").stream().map(e -> e.length()).
                forEach(MethodReferencesRunner::print);

        List.of("Apple","Banana","Kiwi","Mango").stream().map(String::length).forEach(MethodReferencesRunner::print);
        System.out.println("-".repeat(30));
        Integer maxNumber = List.of(23,45,67,34).stream().filter(MethodReferencesRunner::even)
                .max(Integer::compare).orElse(0);
        System.out.println(maxNumber);
    }
}
