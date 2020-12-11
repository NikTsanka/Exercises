package com.ntsan.exercises;

import java.util.Scanner;

public class FindEvenOrOddNumber {

    public static void main(String[] args) {
        FindEvenOrOddNumber finder = new FindEvenOrOddNumber();
        finder.find();
    }

    public void find() {

        System.out.println("Please enter numbers: ");
        Scanner scanner = new Scanner(System.in);
        int oddEvenNumbers = scanner.nextInt();

        int[] numbers = new int[oddEvenNumbers];

        for (int i = 0; i < oddEvenNumbers; i++) {
            numbers[i] = scanner.nextInt();

            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i] + " is even number. ");
            } else if (numbers[i] % 2 != 0) {
                System.out.println(numbers[i] + " is odd number. ");
            }
        }
    }
}
