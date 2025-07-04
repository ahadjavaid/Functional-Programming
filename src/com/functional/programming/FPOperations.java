package com.functional.programming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FPOperations {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(3,5,8,213,45,4,7);
        numbers.stream().sorted().forEach(e -> System.out.println(e) );
        System.out.println("-".repeat(30));
        List<Integer> numbers1 = List.of(3,5,3,213,45,5,7);
        numbers1.stream().distinct().sorted().forEach(e -> System.out.println(e));
        numbers1.stream().distinct().map(e -> e * e).forEach(e -> System.out.println(e));

        List<Integer> integerList = List.of(4,6,8,13,3,15);
        integerList.stream().sorted().limit(4).
                map(e -> e * e).forEach(e -> System.out.println(e));

        List<String> fruitList = List.of("Apple","Ant","Bat");
        fruitList.stream().map(e -> e.toLowerCase()).forEach(e -> System.out.println(e));
        fruitList.stream().map(e -> e.length()).forEach(e -> System.out.println(e));

        IntStream.range(1,11).map(e -> e * e).forEach(e -> System.out.println(e));

        IntStream.range(1,11).reduce(0,(a,b) -> a + b);
        System.out.println("-".repeat(30));

        List<Integer> num1 = List.of(23,12,34,53);
        System.out.println(num1.stream().max((n1,n2) -> Integer.compare(n1,n2)).get());
        System.out.println("-".repeat(30));
        System.out.println(num1.stream().filter(e -> e % 2 != 0).collect(Collectors.toList()));
        System.out.println("-".repeat(30));
        System.out.println(num1.stream().filter(e -> e % 2 == 0).collect(Collectors.toList()));
        System.out.println(IntStream.range(1,11).map(e -> e * e).boxed().collect(Collectors.toList()));
    }
}
