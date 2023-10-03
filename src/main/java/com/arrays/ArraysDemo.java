package com.arrays;

import java.util.*;

public class ArraysDemo {

    // How to find the missing number in integer array of 1 to 100?

    //This is one of the most simple array problems you will see, mostly asked in a telephonic round of Interview.
    // You have given an integer array which contains numbers from 1 to 100 but one number is missing, you need to write a Java program to find that missing number in an array.
    // You cannot use any open source library or Java API method which solves this problem


    private static int[] getArrayOfNinetyNineNumbers(int numberToSkip) {
        int[] numbers = new int[99];
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
        int numberToSkip = 10;
        int[] numbers = getArrayOfNinetyNineNumbers(numberToSkip);
        getMissingNumber(numbers);
        Set<Integer> oneToHundred = getArrayOfNinetyNineRandomNumbers();
        System.out.println(oneToHundred.toString());
        System.out.println("Missing Number is:" + getMissingNumber(oneToHundred));
        System.out.println("oneToHundred array contains 1:" + oneToHundred.contains(1));
        System.out.println("numbers array contains " + numberToSkip + " :" + Arrays.asList(numbers).contains(numberToSkip));
    }

}
