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
public class GameTest {
    
    public GameTest() {
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
     * Test of getPlayers method, of class Game.
     */
    @Test
    public void testGetPlayers() {
        Game game = new GameImpl();
        ArrayList<Player> players = new ArrayList();
        ArrayList<Player> result = game.getPlayers();
        ArrayList<Player> assertEqual = players;
        assertEquals(assertEqual, result);
    }

    public class GameImpl extends Game {
        public GameImpl(){
            
        }

        public void play() {
        }

        public void declareWinner(Player p) {
        }
    }
    
}
