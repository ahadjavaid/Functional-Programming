package com.functional.programming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer integer) {
        return integer % 2 == 0;
    }
}

class printAny implements Consumer<Integer> {

    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }
}

class CustomMapper implements Function<Integer,Integer> {

    @Override
    public Integer apply(Integer integer) {
        return integer * integer;
    }
}

public class LambdaBehindTheScreensRunner {
    public static void main(String[] args) {

        //1.Storing functions in variables
        //2.Passing functions to methods
        //3.Returning functions from methods

        List.of(23,43,34,45,36,48).stream().filter(e -> e %2 == 0).map(e -> e*e).
                forEach(e -> System.out.println(e));

       // Stream<T> filter(Predicate<? super T> predicate);
       // boolean test(T t);
        // <R> Stream<R> map(Function<? super T, ? extends R> mapper);

        List.of(23,43,34,45,36,48).stream().filter(new EvenNumberPredicate()).forEach(e -> System.out.println(e));
        System.out.println("-".repeat(30));
        List.of(23,43,34,45,36,48).stream().filter(new EvenNumberPredicate()).map(new CustomMapper()).
                forEach(new printAny());


    }
}
