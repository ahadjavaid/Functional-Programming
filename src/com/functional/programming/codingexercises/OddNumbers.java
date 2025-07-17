package com.functional.programming.codingexercises;

import java.util.List;
import java.util.stream.Collectors;

public class OddNumbers {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(-3,-2,-1,0,1,2,3);
        System.out.println(filterOddNumbers(list1));
    }

    private static List<Integer> filterOddNumbers(List<Integer> list) {
        List<Integer> filteredList = list.stream().filter(e -> e % 2 != 0).collect(Collectors.toList());
        return filteredList;
    }
}
