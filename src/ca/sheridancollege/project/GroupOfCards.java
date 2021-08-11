/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Nadeem Rashid
 */
public class GroupOfCards extends Card{

    //The group of cards, stored in an ArrayList
    private ArrayList<Card> cards = new ArrayList();
    private int size;//the size of the grouping
    
    public GroupOfCards(){
        
    }
    
    public GroupOfCards(int size) {
        this.size = size;
    }

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<Card> getCards() {
        return cards;
    }
    //This method will add the card to the ArrayList storing these cards
    public void addCard(Card card){
        cards.add(card);
        size++;
    }
    //This method will remove the card to the ArrayList storing these cards
    public void removeCard(Card card){
        cards.remove(card);
        size--;
    }
    //This method will be used to draw a random card
    public void drawCard(){
        //A random number will be drawn
        int num = (int)Math.round(Math.random()*8);
        //A random colour will be picked
        int colour = (int)Math.round(Math.random()*3);
        //A random special varaible will be chosen
        int special = (int)Math.round(Math.random()*2);
        //There is also a luck factor involved with getting the special card.
        int chance = (int)Math.round(Math.random()*9)+1;
        int[] cardNumbers = getCardNumbers();
        String[] cardColours = getCardColours();
        String[] specialCard = getSpecialCards();
        //If the drawn card's random lucky number is a 1, then it will generate
        //a random special card
        if(chance == 1){
            Card card = new UNOCard(cardColours[colour],specialCard[special]);
            addCard(card);
        }else{
            //Otherwise, it will draw a normal card
            Card card = new UNOCard(cardNumbers[num],cardColours[colour],specialCard[3]);
            addCard(card);
        }
    }
    //For privacy reasons, this method will be used to hide the previous person's hand
    public void hidePrevHand(){
        for(int i = 0;i<20;i++){
            System.out.println();
        }
    }
    
    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the max size for the group of cards
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    @Override
    public String toString(){
        String str = "";
        for(Card card: cards){
            str = str + card + " ";
        }
        return str;
    }

}//end class
