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
public class UNOCard extends Card{
    //This method will be used to create a special card
    public UNOCard(String colour, String special){
        super(colour, special);
    }
    //This method will be used to create a regular card
    public UNOCard(int number, String colour, String special){
        super(number, colour, special);
    }
    
    //If the card contains a number, it is specified as a regular card,
    //as a special card does not contain numbers.
    @Override
    public String toString() {
        String[] specialCard = getSpecialCards();
        if(getSpecial().equals(specialCard[3])){
            return getColour() + " " + getNumber();
        }else
        return getColour() + " " + getSpecial();
    }
}
