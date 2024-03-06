package com.github.zipcodewilmington;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        String randomWord = Wordguess.generateRandomWord();
        StringBuilder userWord = new StringBuilder();
        char userGuess;
        int numberGuesses = randomWord.length() - 1;
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("");

        System.out.println("Lets play WordGuess!\nYou have " + numberGuesses + " guesses.");


        userWord = Wordguess.generateUserWord(randomWord);
        System.out.println(userWord);

        while (numberGuesses > 0 ) {

            userGuess = scanner.nextLine().charAt(0);
            userWord = new StringBuilder(Wordguess.checkUserGuess(userGuess, randomWord, userWord));
            System.out.println(userWord);
            numberGuesses --;
        }
    }
}