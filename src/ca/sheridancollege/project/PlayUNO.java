package ca.sheridancollege.project;

import java.util.Scanner;

/**
 * This class +++Insert Description Here+++
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
        Scanner s = new Scanner(System.in);
        
        while(playAgain == true){
            System.out.println("Welcome to Nadeem's UNO game!");
            System.out.println("To play, please type 'play'!");
            input = s.next();
            if(input.equalsIgnoreCase("play")){
                Play game = new Play();
                game.play();
                System.out.println("Thanks for playing!");
                while(!input.equalsIgnoreCase("again")){
                    System.out.println("To play again, type 'again'!");
                    System.out.println("To stop playing, type 'stop'!");
                    if(input.equalsIgnoreCase("stop"))
                        playAgain = false;
                }
            }
        }
    }
}
