package com.techassignment.ex1;

public class Ex1 {
    public static void main(String[] args) {
        int[] array = {5, 6, 82, 1};

        int maxNumber = getMaxNumber(array);

        int counter = getMaxNumberCount(array, maxNumber);

        System.out.println("Max number found " + counter + " times");
    }

    private static int getMaxNumber(int[] array) {
        int maxNumber = 0;
        for (int i : array) {
            if (i > maxNumber) {
                maxNumber = i;
            }
        }
        return maxNumber;
    }

    private static int getMaxNumberCount(int[] array, int maxNumber) {
        int counter = 0;
        for (int i : array) {
            if (maxNumber == i) {
                counter++;
            }
        }
        return counter;
    }
}
