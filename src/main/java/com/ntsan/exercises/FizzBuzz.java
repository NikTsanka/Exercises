package com.ntsan.exercises;


public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz fB = new FizzBuzz();
        for (int i = 1; i < 100; i++) {
            fB.fizzBuzz(i);
        }
    }

    public String fizzBuzz(int i) {

        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println(i + " FizzBuzz");
            return "FizzBuzz";
        } else if (i % 5 == 0) {
            System.out.println(i + " Buzz");
            return "Buzz";
        } else if (i % 3 == 0) {
            System.out.println(i + " Fizz");
            return "Fizz";
        } else {
            System.out.println(i);
            return "" + i;
        }

    }
}
