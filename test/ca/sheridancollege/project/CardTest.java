/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ukule
 */
public class CardTest {
    
    public CardTest() {
    }
    
    @BeforeClass //annotations
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCardColours method, of class Card.
     */
    @Test
    public void testGetCardColours() {
        Card card = new CardImpl();
        String[] result = card.getCardColours();
        String[] assertEqual = {"Red","Yellow","Green","Blue"};
        assertArrayEquals(assertEqual, result);
    }

    /**
     * Test of getCardNumbers method, of class Card.
     */
    @Test
    public void testGetCardNumbers() {
        Card card = new CardImpl();
        int[] result = card.getCardNumbers();
        int[] assertEqual = {1,2,3,4,5,6,7,8,9};
        assertArrayEquals(assertEqual, result);
    }

    /**
     * Test of getSpecialCards method, of class Card.
     */
    @Test
    public void testGetSpecialCards() {
        Card card = new CardImpl();
        String[] result = card.getSpecialCards();
        String[] assertEqual = {"Plus-Two","Plus-Four","Skip","None"};
        assertArrayEquals(assertEqual, result);
    }

    /**
     * Test of getNumber method, of class Card.
     */
    @Test
    public void testGetNumber() {
        Card card = new CardImpl(5,"Red","None");
        int result = card.getNumber();
        int assertEqual = 5;
        assertEquals(assertEqual, result);
    }
    
    /**
     * Test of setNumber method, of class Card.
     */
    @Test
    public void testSetNumber() {
        Card card = new CardImpl();
        card.setNumber(1);
        assertEquals(card.getNumber(), 1);
    }

    /**
     * Test of getColour method, of class Card.
     */
    @Test
    public void testGetColour() {
        Card card = new CardImpl(5,"Red","None");
        String result = card.getColour();
        String assertEqual = "Red";
        assertEquals(assertEqual, result);
    }
    
    /**
     * Test of setColour method, of class Card.
     */
    @Test
    public void testSetColour() {
        Card card = new CardImpl();
        card.setColour("Red");
        assertEquals(card.getColour(), "Red");
    }
    
    /**
     * Test of getSpecial method, of class Card.
     */
    @Test
    public void testGetSpecial() {
        Card card = new CardImpl(5,"Red","None");
        String result = card.getSpecial();
        String assertEqual = "None";
        assertEquals(assertEqual, result);
    }
    
    /**
     * Test of setSpecial method, of class Card.
     */
    @Test
    public void testSetSpecial() {
        Card card = new CardImpl();
        card.setSpecial("None");
        assertEquals(card.getSpecial(), "None");
    }

    public class CardImpl extends Card {
        
        public CardImpl(){
            
        }
        
        public CardImpl(int number, String colour, String special){
            super(number, colour, special);
        }
        
        public String toString() {
            return "";
        }
    }
    
}
