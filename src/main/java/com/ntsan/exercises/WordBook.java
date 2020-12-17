package com.ntsan.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordBook {

    List<String> wordList = new ArrayList<>();

    public static void main(String[] args) {
        WordBook wordBook = new WordBook();
        wordBook.addWord();
        wordBook.print();

    }

    public void print() {

        if (wordList.isEmpty()) {
            System.out.println("Word list is empty.");
        } else {
            for (int i = 0; i < wordList.size(); i++) {
                String word = wordList.get(i);
                if (word.length() > 5 && word.length() < 15) {
                    System.out.println(word);
                }
            }
        }
    }

    public void addWord() {

        System.out.print("Please enter the words: ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            wordList.add(words[i]);
        }
    }
}
