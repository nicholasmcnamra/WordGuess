package com.github.zipcodewilmington;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */

// Nick McNamara
public class Wordguess {
    //methods

    // Generate random word
    public static String generateRandomWord() {
        String[] wordList = new String[]{
                "apple", "banana", "dog", "airplane", "socks", "temptation",
                "gold", "temporary", "mice", "three"
        };
        Random r = new Random();
        String randomWord;
        int randomNumber = r.nextInt(wordList.length);
        randomWord = wordList[randomNumber];
        return randomWord;
    }

    public static StringBuilder generateUserWord(String randomWord) {
        StringBuilder userWord = new StringBuilder();
        userWord.append("_".repeat(randomWord.length()));
        return userWord;
    }

    public static String checkUserGuess(char userGuess, String randomWord, StringBuilder userWord) {
        char[] randomWordArr = randomWord.toCharArray();
        for (int i = 0; i < randomWord.length(); i++) {
            if (userGuess == randomWordArr[i]) {
                userWord.replace(i, i, String.valueOf(userGuess));
            }
        }
        return userWord.toString();
    }
}


