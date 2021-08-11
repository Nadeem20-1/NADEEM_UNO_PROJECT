/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 *
 * @author Nadeem Rashid
 */
public class PlayUNO{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean playAgain = true;
        String input;
        String gameName = "Nadeem's UNO Game";
        Scanner s = new Scanner(System.in);
        
        //While loop allows users to play infinitely, until they want to quit
        while(playAgain == true){
            System.out.println("Welcome to " + gameName + "!");
            System.out.println("To play, please type 'play'!");
            input = s.next();
            if(input.equalsIgnoreCase("play")){
                //Creates a new instance of 'Play', which allows users to play
                //the game
                Play game = new Play();
                game.play();
                //Once game is finished, the rest of this code will run
                System.out.println("\nThanks for playing!");
                while(!input.equalsIgnoreCase("again")){
                    System.out.println("To play again, type 'again'!");
                    System.out.println("To stop playing, type 'stop'!");
                    input = s.next();
                    if(input.equalsIgnoreCase("stop")){
                        playAgain = false;
                        break;
                    }
                }
            }
        }
    }
}
