package com.ntsan.exercises;

import java.util.Scanner;

public class NumberCalculator {
    public static void main(String[] args) {
        NumberCalculator number = new NumberCalculator();
        number.numOperation();
    }

    public void numOperation() {

        System.out.print("Enter number of operations: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Enter numbers to check operation: ");

        int[] num = new int[number];


        for (int i = 0; i < number; i++) {
            int result;
            num[i] = scanner.nextInt();

            if ((num[i] >= 100 && num[i] <= 200) && num[i] % 5 != 0) {
                System.out.println(num[i] + " is greater than 100 and less than 200 - " + num[i] + " not divided by 5");

            } else if (num[i] <= 100 && num[i] % 5 != 0) {
                System.out.println(num[i] + " is less than 100 and " + num[i] + " not divided by 5");

            } else if (num[i] <= 100 && num[i] % 5 == 0) {
                System.out.println(num[i] + " is less than 100 and " + num[i] + " divided by 5");

            } else if ((num[i] >= 100 && num[i] <= 200) && num[i] % 5 == 0) {
                System.out.println(num[i] + " is greater than 100 and less than 200 - " + num[i] + " divided by 5");

            } else if ((num[i] >= 200 && num[i] <= 300) && num[i] % 13 != 0) {
                System.out.println(num[i] + " is greater than 200 and less than 300 - " + num[i] + " not divided by 13");

            } else if ((num[i] >= 200 && num[i] <= 300) && num[i] % 13 == 0) {
                result = num[i] / 13;
                System.out.println(num[i] + " is greater than 200 and less than 300 - " + num[i] + " divided by 13 " + "and result of the division is " + result);

            } else if (num[i] > 300) {
                System.out.println(num[i] + " is greater than 300");
            }
        }

    }
}
