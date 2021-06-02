package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] input = new int[10];
        for(int i=0; i<10; i++){
            input[i] = (int) (Math.random() * 200 - 100);
        }
        System.out.println("Исходный массив");
        System.out.println(Arrays.toString(input));
        int low = 0;
        int high = input.length - 1;
        quickSort(input, low, high);
        System.out.println("Отсортированный массив");
        System.out.println(Arrays.toString(input));
    }

    public static void quickSort(int[] input, int low, int high) {
        if (input.length == 0)
        if (low >= high)
            return;
        //
        //                      выбрать опорный элемент
        //
        //int middle = low;                                 //опорный элемент - первый
        //int middle = high;                                //опорный элемент - последный
        // int middle = low + (high - low) / 2;             //опорный элемент - медиана
        int middle = (int) (low + Math.random()*(high-low));//опорный элемент - случайный
        int oporElement = input[middle];
        int i = low, j = high;
        while (i <= j) {
            while (input[i] < oporElement) {
                i++;
            }
            while (input[j] > oporElement) {
                j--;
            }
            if (i <= j) {
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(input, low, j);

        if (high > i)
            quickSort(input, i, high);
    }
}
