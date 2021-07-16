/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 * @author Megha Patel
 */
public abstract class Card {
    //default modifier for child classes
    private static final int[] cardNumbers = {0,1,2,3,4,5,6,7,8,9};
    private static final String[] cardColours = {"Red","Yellow","Green","Blue"};
    
    private int number;
    private String colour;
    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    @Override
    public abstract String toString();
    
    public Card(int number, String colour){
        this.number = number;
        this.colour = colour;
    }
    
    public String[] getCardColours(){
        return cardColours;
    }
    
    public int[] getCardNumbers(){
        return cardNumbers;
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

}
