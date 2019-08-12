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
 * @author Owner
 */
public class PlayerChildTest {
    
    public PlayerChildTest() {
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
     * Test of getGroupOfCards method, of class PlayerChild.
     */

    @Test
    public void testGetGroupOfCardsGood() {
        System.out.println("getGroupOfCards");
        PlayerChild instance = null;
        GroupOfCards expResult = null;
        GroupOfCards result = instance.getGroupOfCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testGetGroupOfCardsBad() {
        System.out.println("getGroupOfCards");
        PlayerChild instance = null;
        GroupOfCards expResult = null;
        GroupOfCards result = instance.getGroupOfCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testGetGroupOfCardsBoundary() {
        System.out.println("getGroupOfCards");
        PlayerChild instance = null;
        GroupOfCards expResult = null;
        GroupOfCards result = instance.getGroupOfCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of getTokens method, of class PlayerChild.
     */
    @Test
    public void testGetTokensGood() {
        System.out.println("getTokens");
        PlayerChild instance = null;
        int expResult = 0;
        int result = instance.getTokens();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testGetTokensBad() {
        System.out.println("getTokens");
        PlayerChild instance = null;
        int expResult = 0;
        int result = instance.getTokens();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testGetTokensBoundary() {
        System.out.println("getTokens");
        PlayerChild instance = null;
        int expResult = 0;
        int result = instance.getTokens();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }



    /**
     * Test of play method, of class PlayerChild.
     */
    @Test
    public void testPlayGood() {
        System.out.println("play");
        Card obj = null;
        PlayerChild instance = null;
        boolean expResult = false;
        boolean result = instance.play(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testPlayBad() {
        System.out.println("play");
        Card obj = null;
        PlayerChild instance = null;
        boolean expResult = false;
        boolean result = instance.play(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testPlayBoundary() {
        System.out.println("play");
        Card obj = null;
        PlayerChild instance = null;
        boolean expResult = false;
        boolean result = instance.play(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
