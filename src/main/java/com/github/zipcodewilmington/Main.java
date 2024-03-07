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
        int numberGuesses;
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("");
        char playAgain = 0;
        boolean restart = true;


        while (restart) {
            numberGuesses = randomWord.length() + 1;
            userWord = Wordguess.generateUserWord(randomWord);
            System.out.println("Lets play WordGuess!\nYou have " + numberGuesses + " guesses.\nEnter a single character:\n");
            System.out.println(userWord);

            while (numberGuesses > 0 || userWord.toString().equals(randomWord)) {

                userGuess = scanner.nextLine().charAt(0);
                userWord = new StringBuilder(Wordguess.checkUserGuess(userGuess, randomWord, userWord));
                if (userWord.toString().equals(randomWord)) {
                    System.out.println("Congratulations, you won!\nWould you like to play again? [Y/N]");
                    playAgain = scanner.nextLine().charAt(0);
                    if (playAgain == 'N') {
                        restart = false;
                        break;
                    } else {
                        break;
                    }
                } else {
                    System.out.println(userWord);
                    numberGuesses--;
                    if (numberGuesses == 0) {
                        System.out.println("You lose.\nWould you like to play again? [Y/N]");
                        playAgain = scanner.nextLine().charAt(0);
                        if (playAgain == 'N') {
                            restart = false;
                            break;
                        } else {
                            break;
                        }
                        }
                    System.out.println("You have " + numberGuesses + " guesses left.");
                }
            }
        }
    }
    }