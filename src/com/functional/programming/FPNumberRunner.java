package com.functional.programming;

import java.util.List;

public class FPNumberRunner {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(4,6,8,13,3,15);
        int add = fpSum(numbers);
        System.out.println(add);
        int sum = normalSum(numbers);
        System.out.println("sum is " + sum);

        List<Integer> change = List.of(1,2,3,4,5);
        change.stream().map(e -> e * e).forEach(e -> System.out.println(e));

        List<Integer> integerList = List.of(1,91,89,43,18,911,1080,27,34,47,52);
        int sum1 = integerList.stream().
                filter(e -> e % 2 ==0).reduce(0,(a,b) -> a + b);
        System.out.println("Sum of even -> " + sum1);
    }

    private static int fpSum(List<Integer> numbers) {
        return  numbers.stream().filter(e -> e % 2 != 0).
                reduce(0,(a, b) -> a + b);
    }

    private static int normalSum(List<Integer> numbers) {
        int sum = 0;
        for(var num : numbers) {
            sum = sum + num;
        }
        return sum;
    }
}
