package com.techassignment;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int size = setArraySize(scanner);

        int[] array = new int[size];

        setArrayData(scanner, array);

        int maxNumber = getMaxNumber(array);

        int counter = getMaxNumberCount(array, maxNumber);

        System.out.println("Max number found " + counter + " times");
    }


    private static int setArraySize(Scanner scanner) {
        int size = 0;
        boolean isSizeValid = false;
        System.out.println("How many candles?");
        while (!isSizeValid) {
            size = scanner.nextInt();

            if (size > 0 && size <= 1000) {
                isSizeValid = true;
            } else {
                System.out.println("Size not valid");
            }
        }
        return size;
    }

    private static void setArrayData(Scanner scanner, int[] array) {
        System.out.println("Write candle height:");

        boolean isHeightValid = false;

        for (int i = 0; i < array.length; i++) {
            while (!isHeightValid) {
                int height = scanner.nextInt();

                if (height > 0 && height <= 1000) {
                    isHeightValid = true;
                    array[i] = height;
                } else {
                    System.out.println("Height not valid");
                }
            }
            isHeightValid = false;
        }
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
