package com.functional.programming.codingexercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CubeClass {
    public static void main(String[] args) {
        System.out.println(getCubeOfFirstNumbers(5));
        IntStream.range(1,11).map(e -> e * e).forEach(e -> System.out.println(e));
        System.out.println(IntStream.range(1,11).map(e -> e * e).boxed().collect(Collectors.toList()));
        System.out.println(getCourseLengthCount(List.of()));
        System.out.println(getSquare(List.of()));
    }

    public static List<Integer> getCubeOfFirstNumbers(int number) {
        List <Integer> cubeList = IntStream.range(1,number+1).map(e -> e * e * e).boxed()
                .collect(Collectors.toList());
        return cubeList;
    }

    public static List<Integer> getCourseLengthCount(List<String> courseName) {
        if(courseName == null) {
            return new ArrayList<>();
        }
        List<Integer> courseLengthList = courseName.stream().map(e -> e.length()).collect(Collectors.toList());
        return courseLengthList;
    }

    public static long getSquare(List<Integer> numbers) {
        if(numbers == null) {
            return 0;
        }

        return numbers.stream().mapToLong(e -> e * e).reduce(0,(number1, number2) ->
                number1 + number2);
    }

    public static int findMaxEvenNumber(List<Integer> numbers) {
        if(numbers == null || numbers.isEmpty()) {
            return 0;
        }

        Optional<Integer> maxEven = numbers.stream().filter(e -> e % 2 == 0).max(Integer::compare);
        return maxEven.orElse(0);
    }
}
