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
public abstract class Player extends GroupOfCards{

    private String name; //the unique name for this player
    private GroupOfCards hand;  //the unique hand for this player
    
    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
    public Player(String name) {
        this.name = name;
    }

    /**
     * @return the player name
     */
    public String getName() {
        return name;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param name the player name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The method to be overridden when you subclass the Player class with your specific type of Player and filled in
     * with logic to play your game.
     */
    public abstract void play(MiddleDeck middleCard);

    /**
     * @return the hand
     */
    public GroupOfCards getHand() {
        return hand;
    }

    /**
     * @param hand the hand to set
     */
    public void setHand(GroupOfCards hand) {
        this.hand = hand;
    }

}
