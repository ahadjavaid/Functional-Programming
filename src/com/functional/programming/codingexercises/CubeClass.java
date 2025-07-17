package com.functional.programming.codingexercises;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CubeClass {
    public static void main(String[] args) {
        System.out.println(getCubeOfFirstNumbers(5));
        IntStream.range(1,11).map(e -> e * e).forEach(e -> System.out.println(e));
        System.out.println(IntStream.range(1,11).map(e -> e * e).boxed().collect(Collectors.toList()));
    }

    public static List<Integer> getCubeOfFirstNumbers(int number) {
        List <Integer> cubeList = IntStream.range(1,number+1).map(e -> e * e * e).boxed()
                .collect(Collectors.toList());
        return cubeList;
    }
}
