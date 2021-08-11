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
public class MiddleDeck {
    private Card card;
    
    public MiddleDeck(){
        
    }
    //This method will be used to create a random card for the middle deck
    public void randomCard(){
        int num = (int)Math.round(Math.random()*9);
        int colour = (int)Math.round(Math.random()*3);
        String[] cardColours = {"Red","Yellow","Green","Blue"};
        Card card = new UNOCard(num,cardColours[colour],"None");
        this.card = card;
    }

    /**
     * @return the card
     */
    public Card getCard() {
        return card;
    }

    /**
     * @param card the card to set
     */
    public void setCard(Card card) {
        this.card = card;
    }
}
