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
public class PlayerInGame extends Player{
    
    public PlayerInGame(String name){
        super(name);
    }
    
    @Override
    public void play(MiddleDeck middleCard) {
        Scanner s = new Scanner(System.in);
        //To gather the information of the middle deck's card, the getCard()
        //method is used.
        Card card = middleCard.getCard();
        //The selected card used to determine what card will be placed into the
        //middle deck
        Card selectedCard = null;
        //Boolean variable used to determine if a valid card is found
        boolean cardFound = true;
        //Boolean variable used to determine if a proper response has been given
        boolean answerGiven = false;
        //A temporary ArrayList to hold the player's hand
        ArrayList<Card> tempCards = new ArrayList<Card>();
        tempCards = getCards();
        //The variable used to hold the player's input
        String answer;
        //The variable used to hold the player's integer input, if there is any
        int answer1;
        
        //Method used to hide the previous player's hand
        hidePrevHand();
        
        
        System.out.println("It's your turn, " + getName() + "!");
        
        //If the previous card placed was a skip card, the entire player's round is skipped
        if(card.getSpecial().equals("Skip")){
            System.out.println("Uh oh! Looks like the previous player has placed"
                    + " down a skip card! Your turn will now be skipped!");
            //A random card is drawn to the middle deck, to replace the skip card
            middleCard.randomCard();
        }else{
            //If the previous card placed was a plus-four or plus-two, the current player
            //will be forced to draw four or two cards before the round starts.
            if(card.getSpecial().equals("Plus-Four")){
                System.out.println("Uh oh! Looks like the previous player has placed"
                        + " down a plus-four card! You will now be given 4 extra cards!");
                for(int i = 0; i<4; i++){
                    drawCard();
                }
                middleCard.randomCard();
            }

            if(card.getSpecial().equals("Plus-Two")){
                System.out.println("Uh oh! Looks like the previous player has placed"
                        + " down a plus-two card! You will now be given 2 extra cards!");
                for(int i = 0; i<2; i++){
                    drawCard();
                }
                middleCard.randomCard();
            }
            //Updating the middle deck's card, after potentially changing the card
            card = middleCard.getCard();
            System.out.println("To reveal your hand, press 'Enter':");
            s.nextLine();
            //For privacy reasons, the current player will need to press enter to
            //show their hand
            System.out.println(getCards());
            System.out.println("Deck Size: " + getSize());
            System.out.println("\nThe card in the middle is: ");
            System.out.println(card);
            System.out.println("\nPick a card by typing its index, starting from 0. "
                    + "If you can't, type 'draw' to draw a new card: ");
            
            //This will continuously loop until the proper answer is given
            while(answerGiven == false){
                //This try-catch will make sure no exceptions crash the game,
                //especially when the wrong input is given (ArrayOutOfBounds,InputMismatch,etc)
                try{
                    answer = s.next();
                    //If the answer contains an integer, it will be used to index
                    //the proper card. There are checks to make sure the index 
                    //is proper, and no errors are produced.
                    if(answer.matches(".*\\d.*")){
                        //Parsing the integer, if any, which is used to compare
                        //the integer on the middle card and the user's selected card
                        answer1 = Integer.parseInt(answer);
                            if(tempCards.get(answer1).getColour().equals(card.getColour())
                               || tempCards.get(answer1).getNumber() == card.getNumber()
                               || (tempCards.get(answer1).getSpecial().equals(card.getSpecial())
                               && !tempCards.get(answer1).getSpecial().equals("None"))){
                                //If the two cards match with either their colour,
                                //number, or special card, the card will be found
                                //and the selectedCard will become the selected card
                                cardFound = true;
                                selectedCard = tempCards.get(answer1);
                            }else
                                //If not found, no selectedCard will not be updated.
                                cardFound = false;
                            //Once the user inputs the proper answer, the while
                            //loop will break.
                            answerGiven = true;
                    }
                    //If the user enters the keyword 'draw', they will automatically
                    //Skip their turn and draw a card.
                    if(answer.equalsIgnoreCase("draw")){
                        cardFound = false;
                        answerGiven = true;
                    }
                }catch(Exception E){
                    System.out.println("Please input a proper index:");
                }
            }
            //Once a card is found, the middle card will be updated, and the selected
            //card will be removed from the user's hand.
            if(cardFound == true){
                System.out.println("You have placed down: " + selectedCard);
                middleCard.setCard(selectedCard);
                removeCard(selectedCard);
            }else{
                //Otherwise, the user will be forced to draw a card.
                System.out.println("Unfortunately, you could not place any cards"
                            + " down. A card has been automatically drawn for you.");
                drawCard();
            }
        }
        promptEnterKey();
    }
    
    public void promptEnterKey(){
        System.out.println("Press 'Enter' to continue: ");
        Scanner s = new Scanner(System.in);
        s.nextLine();
    }
}
