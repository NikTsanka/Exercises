package com.ntsan.exercises;

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        ReverseSentence reverseSentence = new ReverseSentence();
        reverseSentence.reverse();
    }

    public void reverse() {
        System.out.println("Please enter the sentence to reverse: ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
