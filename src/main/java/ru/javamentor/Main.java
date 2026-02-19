package ru.javamentor;

import java.util.Arrays;

public class Main {
    public static int[] sortedSquares(int[] input) {
        int n = input.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int pos = n - 1;
        while (left <= right) {
            int leftSquare = input[left] * input[left];
            int rightSquare = input[right] * input[right];
            if (leftSquare > rightSquare) {
                result[pos] = leftSquare;
                left++;
            } else {
                result[pos] = rightSquare;
                right--;
            }
            pos--;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = {-7, -3, 0, 2, 5};
        System.out.println(Arrays.toString(sortedSquares(input)));
        // [0, 4, 9, 25, 49]
    }
}
