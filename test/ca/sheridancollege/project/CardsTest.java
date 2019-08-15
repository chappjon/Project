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
public class CardsTest {
    
    public CardsTest() {
    }    
        
    /**
     * Test of match method, of class Cards.
     */
   
    @Test
    public void testMatchGood() {
        System.out.println("match Good");
        Cards card = new Cards(Cards.Color.RED, Cards.Value.ONE);
        Cards instance = new Cards(Cards.Color.RED, Cards.Value.ONE);
        boolean expResult = true;
        boolean result = instance.match(card);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testMatchBad() {
        System.out.println("match Bad");
        Cards card = new Cards(Cards.Color.RED, Cards.Value.ONE);
        Cards instance = new Cards(Cards.Color.YELLOW, Cards.Value.TWO);
        boolean expResult = false;
        boolean result = instance.match(card);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testMatchBoundary() {
        System.out.println("match Boundary");
        Cards card = new Cards(Cards.Color.RED, Cards.Value.ONE);
        Cards instance = new Cards(Cards.Color.RED, Cards.Value.TWO);
        boolean expResult = true;
        boolean result = instance.match(card);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
