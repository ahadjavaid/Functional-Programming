package com.functional.programming;

import java.util.List;

public class FunctionalProgrammingRunner {

    public static void main(String[] args) {
        List<String> list = List.of("Apple","Bat","Cat","Dog");
        printWithFP(list);
        List<Integer> list1 = List.of(1,2,3,4,5);
        printIntWithFP(list1);
        printAnything(list);
        printAnything(list1);
        printBasicWithFiltering(list);
        printFilteringWithFP(list);

        List<Integer> num = List.of(1,2,3,4,5,6,7,8,9,10,99,24,78);
        printEvenWithFP(num);

        Addition addition = (a,b) -> {
            return a+b;
        };

        System.out.println(addition.sumOfTwoNumbers(5,7));
    }

    private static void printBasic(List<String> list) {
        for(var e : list) {
            System.out.println(e);
        }
    }


    private static void printEvenWithFP(List<Integer> list) {
        list.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.println(e));
    }

    private static void printOddWithFP(List<Integer> list) {
        list.stream().filter(e -> e % 2 != 0).forEach(e -> System.out.println(e));
    }

    private static void printBasicWithFiltering(List<String> list) {
        for(var e : list) {
            if(e.endsWith("at")) {
                System.out.println(e);
            }
        }
    }

    private static void printFilteringWithFP(List<String> list) {
        list.stream().filter(e -> e.endsWith("at")).forEach(e -> System.out.println(e));
    }

    private static void printWithFP(List<String> list) {
        list.stream().forEach(element -> System.out.println(element));
    }

    private static void printIntWithFP(List<Integer> list) {
        list.stream().forEach(e -> System.out.println(e));
    }

    private static<T extends List> void printAnything(T list) {
        list.stream().forEach(e -> System.out.println(e));
    }
}
