package com.github.zipcodewilmington;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

//      announce_game() prints a welcome

//      game_over() prints "game over"

        Wordguess.initialize_game_state(Wordguess.generateRandomWord());
//      sets up char[] for secret word and guesses

        Wordguess.getNextGuess();
//      get_next_guess() returns a char from player input

//      is_word_guessed() returns boolean

//      ask_to_play_again() returns boolean

//      print_current_state() uses printArray to show player where they are at

//      process() loops thru the word array, looking for the inputed guess, and replaces the "_" with the guesses char if found

//      player_won() prints happy message

//      player_lost() print sad message


    }
}
