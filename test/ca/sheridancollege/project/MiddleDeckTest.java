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
public class MiddleDeckTest {
    
    public MiddleDeckTest() {
    }
    
    @BeforeClass
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
     * Test of getCard method, of class MiddleDeck.
     */
    @Test
    public void testGetCard() {
        Card card = new UNOCard("Red","None");
        MiddleDeck middle = new MiddleDeck();
        middle.setCard(card);
        
        Card result = middle.getCard();
        Card assertEqual = card;
        assertEquals(assertEqual, result);
    }

    /**
     * Test of setCard method, of class MiddleDeck.
     */
    @Test
    public void testSetCard() {
        Card card = new UNOCard("Red","None");
        MiddleDeck middle = new MiddleDeck();
        middle.setCard(card);
        
        Card result = middle.getCard();
        Card assertEqual = card;
        assertEquals(assertEqual, result);
    }
    
}
