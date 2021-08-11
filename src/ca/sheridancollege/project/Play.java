/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nadeem Rashid
 */
public class Play extends Game{
    
    @Override
    public void play() {
        Scanner s = new Scanner(System.in);
        ArrayList<Player> players = new ArrayList<>();
        //Creating the middle deck, that will be used in the game
        MiddleDeck middleCard = new MiddleDeck();
        middleCard.randomCard();
        String input;
        
        //This is used to add empty space, for cleaning up the console.
        for(int i = 0; i<20; i++){
            System.out.println();
        }
        System.out.println("Welcome to Nadeem's UNO. To begin, please input the"
                + " name for the first player: ");
        input = s.next();
        //This will loop until all needed players are added
        while(!input.equalsIgnoreCase("no") || 2 > players.size()){
            if(!input.equalsIgnoreCase("no")){
                PlayerInGame p1 = new PlayerInGame(input);
                players.add(p1);
                System.out.println(input + " has been added.");
            }
            System.out.println("Please input the next player's name. Otherwise,"
                    + " type 'no' (NOTE: 2 players minimum needed).");
            input = s.next();
        }
        if(input.equalsIgnoreCase("no")){
            setPlayers(players);
            
            System.out.println("Hello,");
            for(Player p : players){
                System.out.println(p.getName());
            }
            System.out.println("\nEach player will start with 7 cards!");
            //Each player will be given 7 random cards
            for(Player p : players){
                for(int i = 0; i<2; i++){
                    p.drawCard();
                }
            }
            System.out.println("It's time to play!");
            //This method will be used to let the user to press 'enter' to continue,
            //As creating a new instance of the scanner class is required to do so
            promptEnterKey();
            boolean playing = true;
            //This 'player' will be used to keep track of the previous player,
            //which is used to determine if the previous player won the game
            Player prevPlayer = new PlayerInGame("Previous Player");
            prevPlayer.drawCard();
            
            while(playing == true){
                //Each player will play a round, until their hand size is 0.
                for(Player p : players){
                    if(prevPlayer.getSize()>0){
                        System.out.println(prevPlayer.getSize());
                        //The player will bring in the middleCard to the play method
                        p.play(middleCard);
                    }
                    else{
                        //If the player's hand size is 0, they are declared the winner
                        declareWinner(prevPlayer);
                        playing = false;
                    }
                    //The current player will turn into the previous player, after
                    //their turn ends.
                    prevPlayer = p;
                }
            }
        }
    }

    @Override
    public void declareWinner(Player p) {
        System.out.println("We have a winner! The winner of this game is: ");
        System.out.println(p.getName() + "!");
        System.out.println("Congratulations, " + p.getName() + "! You won!");
    }
    
    public void promptEnterKey(){
        System.out.println("Press 'Enter' to continue: ");
        Scanner s = new Scanner(System.in);
        s.nextLine();
    }
}
