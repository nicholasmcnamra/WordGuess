package com.github.zipcodewilmington;


import java.util.Random;
import java.util.Scanner;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */

// Nick McNamara
public class Wordguess {

    private int numberGuesses;
    private String randomWord;
    private String solution;
    private String playerGuesses;

    public Wordguess() {
    }

    public int getNumberGuesses() {
        return numberGuesses;
    }
    public void setNumberGuesses(int numberGuesses) {
        this.numberGuesses = numberGuesses;
    }

    public String getRandomWord() {
        return randomWord;
    }
    public void setRandomWord(String randomWord) {
        this.randomWord = randomWord;
    }

    public String getSolution() {
        return solution;
    }
    public void setSolution(String solution) {
        this.solution = solution;
    }

    public String getPlayerGuesses() {
        return playerGuesses;
    }
    public void setPlayerGuesses(String playerGuesses) {
        this.playerGuesses = playerGuesses;
    }

    //methods

    static String getNextGuess() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a letter: ");

        return String.valueOf(scan);
    }
    // Get guess from user

    static String generateRandomWord() {
        String[] wordList = new String[] {
                "apple", "banana", "dog", "airplane", "socks", "temptation",
                "gold", "temporary", "mice", "three"
        };
        Random r = new Random();
        int randomNumber = r.nextInt(wordList.length);
//        System.out.println(wordList[randomNumber]);
        String randomWord = wordList[randomNumber];
        return randomWord;
    }
    // Generate random word

    static char[] initialize_game_state(String randomWord) {
        char[] ch = randomWord.toCharArray();
        for (int i = 0; i < ch.length; i++)
            ch[i] = randomWord.charAt(i);
        return ch;
    }
    static boolean is_word_guessed() {
        for (int i = 0; i <)
    }
}

