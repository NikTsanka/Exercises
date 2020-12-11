package com.ntsan.exercises;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        StringReverse stringReverse = new StringReverse();
        stringReverse.reverse();
    }

    public void reverse() {
        System.out.println("Please add string to reverse: ");
        Scanner scanner = new Scanner(System.in);
        String stringReverse = scanner.next();

        char[] charArray = stringReverse.toCharArray();

        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
    }
}
