/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @author Megha Patel
 */
public class GroupOfCards extends Card{

    //The group of cards, stored in an ArrayList
    private ArrayList<Card> cards = new ArrayList();
    private int size;//the size of the grouping

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
    
    public void drawCard(){
        int num = (int)Math.round(Math.random()*9);
        int colour = (int)Math.round(Math.random()*3);
        int special = (int)Math.round(Math.random()*2);
        int chance = (int)Math.round(Math.random()*10+1);
        String[] cardColours = getCardColours();
        String[] specialCard = getSpecialCards();
        if(chance == 1){
            Card card = new UNOCard(num,cardColours[colour],specialCard[special]);
            cards.add(card);
        }else{
            Card card = new UNOCard(num,cardColours[colour],specialCard[3]);
            cards.add(card);
        }
        size++;
    }
    
    public void hidePrevHand(){
        for(int i = 0;i<15;i++){
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
