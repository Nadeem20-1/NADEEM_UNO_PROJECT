/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author Nadeem Rashid
 */
public abstract class Card {
    //These variables will hold the values of the numbers, colours, and special
    private static final int[] cardNumbers = {1,2,3,4,5,6,7,8,9};
    private static final String[] cardColours = {"Red","Yellow","Green","Blue"};
    private static final String[] specialCards = {"Plus-Two","Plus-Four","Skip","None"};
    
    private int number;
    private String colour;
    private String special;
    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    @Override
    public abstract String toString();
    
    public Card(){
        
    }
    //This method will create a new special card, with no number
    public Card(String colour, String special){
        this.colour = colour;
        this.special = special;
    }
    //This method will create a new regular card
    public Card(int number, String colour, String special){
        this.number = number;
        this.colour = colour;
        this.special = special;
    }
    
    public String[] getCardColours(){
        return cardColours;
    }
    
    public int[] getCardNumbers(){
        return cardNumbers;
    }
    
    /**
     * @return the specialCards
     */
    public String[] getSpecialCards() {
        return specialCards;
    }
    
    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the colour
     */
    
    public String getColour() {
        return colour;
    }

    /**
     * @param colour the colour to set
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * @return the special
     */
    public String getSpecial() {
        return special;
    }

    /**
     * @param special the special to set
     */
    public void setSpecial(String special) {
        this.special = special;
    }
}
