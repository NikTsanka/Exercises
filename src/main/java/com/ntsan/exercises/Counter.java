package com.ntsan.exercises;


import java.util.Scanner;

public class Counter {

    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.count();
    }

    public void count() {
        System.out.println("Welcome, please enter the sentence: ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        int vowelCounter = 0;
        int consonantCounter = 0;
        int digitCounter = 0;
        int spaceCounter = 0;

        for (int i = 0; i < sentence.length(); i++) {

            char ch = sentence.charAt(i);

            if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'o' || ch == 'O' || ch == 'U' || ch == 'u') {
                vowelCounter++;
            } else if ((ch > 'a' && ch <= 'z') || (ch > 'A' && ch <= 'Z')) {
                consonantCounter++;
            } else if (ch >= '0' && ch <= '9') {
                digitCounter++;
            } else if (ch == ' ') {
                spaceCounter++;
            }
        }
        System.out.println("Vowel count is: " + vowelCounter);
        System.out.println("Consonant count is: " + consonantCounter);
        System.out.println("Digit count is: " + digitCounter);
        System.out.println("Space count is: " + spaceCounter);

    }


}
