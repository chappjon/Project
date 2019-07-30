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
 * @author Xiaohong Deng
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
     * Test of getDirection method, of class Game.
     */
    @Test
    public void testGetDirection() {
        System.out.println("getDirection");
        Game instance = new Game();
        int expResult = 0;
        int result = instance.getDirection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDirection method, of class Game.
     */
    @Test
    public void testSetDirection() {
        System.out.println("setDirection");
        int direction = 0;
        Game instance = new Game();
        instance.setDirection(direction);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGameColor method, of class Game.
     */
    @Test
    public void testGetGameColor() {
        System.out.println("getGameColor");
        Game instance = new Game();
        Cards.Color expResult = null;
        Cards.Color result = instance.getGameColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGameColor method, of class Game.
     */
    @Test
    public void testSetGameColor() {
        System.out.println("setGameColor");
        Cards.Color gameColor = null;
        Game instance = new Game();
        instance.setGameColor(gameColor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentPlayer method, of class Game.
     */
    @Test
    public void testGetCurrentPlayer() {
        System.out.println("getCurrentPlayer");
        Game instance = new Game();
        int expResult = 0;
        int result = instance.getCurrentPlayer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrentPlayer method, of class Game.
     */
    @Test
    public void testSetCurrentPlayer() {
        System.out.println("setCurrentPlayer");
        int nextPlayer = 0;
        Game instance = new Game();
        instance.setCurrentPlayer(nextPlayer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayerList method, of class Game.
     */
    @Test
    public void testGetPlayerList() {
        System.out.println("getPlayerList");
        Game instance = new Game();
        Player[] expResult = null;
        Player[] result = instance.getPlayerList();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayerList method, of class Game.
     */
    @Test
    public void testSetPlayerList() {
        System.out.println("setPlayerList");
        Player[] playerList = null;
        Game instance = new Game();
        instance.setPlayerList(playerList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shuffle method, of class Game.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        DeckofCards deck = null;
        Game instance = new Game();
        DeckofCards expResult = null;
        DeckofCards result = instance.shuffle(deck);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deal method, of class Game.
     */
    @Test
    public void testDeal() {
        System.out.println("deal");
        DeckofCards deck = null;
        Game instance = new Game();
        DeckofCards expResult = null;
        DeckofCards result = instance.deal(deck);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isWon method, of class Game.
     */
    @Test
    public void testIsWon() {
        System.out.println("isWon");
        Player player = null;
        Game instance = new Game();
        int expResult = 0;
        int result = instance.isWon(player);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of overwriteColor method, of class Game.
     */
    @Test
    public void testOverwriteColor() {
        System.out.println("overwriteColor");
        Cards card = null;
        Game instance = new Game();
        Cards expResult = null;
        Cards result = instance.overwriteColor(card);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of next method, of class Game.
     */
    @Test
    public void testNext() {
        System.out.println("next");
        Game instance = new Game();
        int expResult = 0;
        int result = instance.next();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
