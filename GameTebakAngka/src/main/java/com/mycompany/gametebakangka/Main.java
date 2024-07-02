/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gametebakangka;

/**
 *
 * @author WINDOWS 11
 */
public class Main {
    public static void main(String[] args) {
        NumberGuessingGame numberGame = new NumberGuessingGame(7);
        numberGame.play();
        
        String[] words = {"apel", "pisang", "mangga"};
        WordGuessingGame wordGame = new WordGuessingGame(5, words);
        wordGame.play();
}

    private static class WordGuessingGame {

        public WordGuessingGame() {
        }

        private WordGuessingGame(int i, String[] words) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void play() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}