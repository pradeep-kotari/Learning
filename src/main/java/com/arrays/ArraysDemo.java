package com.arrays;

import java.util.*;

public class ArraysDemo {

    private static int[] getArrayOfNinetyNineNumbers() {
        int[] numbers = new int[99];
        int numberToSkip = 9;
        for (int i = 0; i < numbers.length + 1; i++) {
            if (i + 1 < numberToSkip) {
                numbers[i] = i + 1;
            } else if (i + 1 > numberToSkip) {
                numbers[i - 1] = i + 1;
            }
        }
        return numbers;
    }

    private static Set<Integer> getArrayOfNinetyNineRandomNumbers() {
        Set<Integer> oneToHundred = new LinkedHashSet<>();
        while (oneToHundred.size() < 99) {
            Random random = new Random();
            int randomInt = random.nextInt(1, 101);
            oneToHundred.add(randomInt);
        }
        return oneToHundred;
    }

    private static int getMissingNumber(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            if (numbers[i] != i + 1) {
                System.out.println("Missing Number is:" + (i + 1));
                return (i + 1);
            }
        }
        return -1;
    }

    private static int getMissingNumber(Set<Integer> oneToHundred) {
        Set<Integer> seqNumbers = new HashSet<>();
        for (int i = 1; i <= 100; i++) {
            seqNumbers.add(i);
        }
        for (int i : oneToHundred) {
            seqNumbers.remove(i);
        }

        return seqNumbers.stream().findFirst().get();
    }

    public static void main(String[] args) {
        int[] numbers = getArrayOfNinetyNineNumbers();
        getMissingNumber(numbers);
        Set<Integer> oneToHundred = getArrayOfNinetyNineRandomNumbers();
        System.out.println(oneToHundred.toString());
        System.out.println("Missing Number is:" + getMissingNumber(oneToHundred));
    }
}
