package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        /*
        Task1: Write a program which creates two dimensional
         array and stores a multiplication table (from 1 - 10) in it.
    Example of output:
        1 * 1 = 1
        1 * 2 = 2
        1 * 3 = 3
        ....
        10 * 9 = 90
        10 * 10 = 100
    Hint:
       1) don't forget that you have to save the values in the array and output them from the array.
       2) Arrays should be the size of [10][10]

       Task2: Declare and initialize an array with four arbitrary whole numbers.
       Write a Java program to copy this array by iterating it.

       Task 3: BankAccount Class
       Task 4: BankAccountDemo Class
       Task 5: Vehicle, Car , Ford_Fiesta (Not completed) classes

         */
        //Task 1
        int[][] twoD_arr = new int[10][10];
        int row = 1, column = 1;
        for (int i = 1; i < twoD_arr.length; i++) {
            for (int j = 1; j < twoD_arr[i].length; j++) {
                twoD_arr[i][j] = row * column;
                column = column + 1;
            }
            row = row + 1;
            column = 1;
        }
        for (int i = 1; i < twoD_arr.length; i++) {
            for (int j = 1; j < twoD_arr[i].length; j++) {
                System.out.println(i + " * " + j + " = " + twoD_arr[i][j]);
            }
        }
        //Task 2
        Random rd = new Random();
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(2147483647) + 1;
            System.out.println(arr[i]);
        }

    }
}
