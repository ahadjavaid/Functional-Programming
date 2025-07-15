package com.functional.programming;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

class EvenNumberPredicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer integer) {
        return integer % 2 == 0;
    }
}
public class LambdaBehindTheScreensRunner {
    public static void main(String[] args) {

        List.of(23,43,34,45,36,48).stream().filter(e -> e %2 == 0).forEach(e -> System.out.println(e));

       // Stream<T> filter(Predicate<? super T> predicate);
       // boolean test(T t);

        List.of(23,43,34,45,36,48).stream().filter(new EvenNumberPredicate()).forEach(e -> System.out.println(e));

    }
}
