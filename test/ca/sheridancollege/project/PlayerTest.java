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
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetName() {
        Player player = new PlayerImpl(""); 
        player.setName("Jony");
        assertEquals(player.getName(), "Jony");
    }

    /**
     * Test of setName method, of class Player.
     */
    @Test
    public void testSetName() {
        Player player = new PlayerImpl(""); 
        player.setName("Jony");
        assertEquals(player.getName(), "Jony");
    }

    /**
     * Test of getHand method, of class Player.
     */
    @Test
    public void testGetHand() {
        Player player = new PlayerImpl(""); 
        GroupOfCards cards = new GroupOfCards();
        player.setHand(cards);
        assertEquals(player.getHand(), cards);
    }

    /**
     * Test of setHand method, of class Player.
     */
    @Test
    public void testSetHand() {
        Player player = new PlayerImpl(""); 
        GroupOfCards cards = new GroupOfCards();
        player.setHand(cards);
        assertEquals(player.getHand(), cards);
    }

    public class PlayerImpl extends Player {

        public PlayerImpl(String s) {
            super(s);
        }

        public void play(MiddleDeck middleCard) {
            
        }
    }
    
}
