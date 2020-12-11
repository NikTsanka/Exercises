package com.ntsan.exercises;

import java.util.Scanner;

public class StringChanger {
    public static void main(String[] args) {
        StringChanger stringChanger = new StringChanger();
        stringChanger.change();
    }

    public void change() {
        System.out.println("Please enter the sentence to change: ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        char[] charSentence = sentence.toCharArray();


        for (int i = 0; i < charSentence.length; i++) {
            boolean isUpperCase = Character.isUpperCase(charSentence[i]);

            if (isUpperCase){
                char lowerCaseCharacter = Character.toLowerCase(charSentence[i]);
                System.out.print(lowerCaseCharacter);
            }else {
                char uperCaseCharacter =Character.toUpperCase(charSentence[i]);
                System.out.print(uperCaseCharacter);
            }

        }


    }

}
