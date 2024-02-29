package com.github.zipcodewilmington;

//starts the game
//a random word is chosen from a list
//the number of tries allowed is set to the length of the word
//setup the two (the solution and the player's guesses) character arrays
//WHILE the numbers of tries is less than tries allowed AND
//the player has not guessed the word
//print the current state of the player's guesses
//ask the player for a letter (a character)
//if the letter is a minus "-", quit the game
//else process the letter
//if the letter makes the work complete,
//the player wins
//after the while loop
//if the word is not guessed, player loses
public class Game {
    private int numberGuesses;
    private String randomWord;
    private String randomList;
    private String solution;
    private String playerGuesses;

    public Game() {
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

    public String getRandomList() {
        return randomList;
    }
    public void setRandomList(String randomList) {
        this.randomList = randomList;
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
}

