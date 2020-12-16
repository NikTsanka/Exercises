package com.ntsan.exercises;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        System.out.print("\nYour password is: " + randomPassword() + "\n");
    }

    public static String randomPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter your password length: ");
        int length = scanner.nextInt();
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
}
