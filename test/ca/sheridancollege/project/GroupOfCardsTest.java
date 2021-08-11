/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
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
public class GroupOfCardsTest {
    
    public GroupOfCardsTest() {
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
     * Test of getCards method, of class GroupOfCards.
     */
    @Test
    public void testGetCards() {
        GroupOfCards cards = new GroupOfCards();
        ArrayList<Card> result = cards.getCards();
        ArrayList<Card> assertEqual = new ArrayList();
        assertEquals(assertEqual, result);
    }

    /**
     * Test of addCard method, of class GroupOfCards.
     */
    @Test
    public void testAddCard() {
        GroupOfCards cards = new GroupOfCards();
        cards.addCard(new UNOCard("Red","None"));
        assertEquals(cards.getSize(), 1);
    }

    /**
     * Test of removeCard method, of class GroupOfCards.
     */
    @Test
    public void testRemoveCard() {
        GroupOfCards cards = new GroupOfCards();
        Card card = new UNOCard("Red","None");
        cards.addCard(card);
        cards.removeCard(card);
        assertEquals(cards.getSize(), 0);
    }

    /**
     * Test of drawCard method, of class GroupOfCards.
     */
    @Test
    public void testDrawCard() {
        GroupOfCards cards = new GroupOfCards();
        cards.addCard(new UNOCard("Red","None"));
        assertEquals(cards.getSize(), 1);
    }

    /**
     * Test of getSize method, of class GroupOfCards.
     */
    @Test
    public void testGetSize() {
        GroupOfCards cards = new GroupOfCards();
        cards.addCard(new UNOCard("Red","None"));
        assertEquals(cards.getSize(), 1);
    }
}
