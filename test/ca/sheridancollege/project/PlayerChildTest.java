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
        System.out.println("getGroupOfCardsGood");
        PlayerChild instance = null;
        GroupOfCards expResult = null;
        GroupOfCards result = instance.getGroupOfCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testGetGroupOfCardsBad() {
        System.out.println("getGroupOfCardsBad");
        PlayerChild instance = null;
        GroupOfCards expResult = null;
        GroupOfCards result = instance.getGroupOfCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testGetGroupOfCardsBoundary() {
        System.out.println("getGroupOfCardsBoundary");
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
        System.out.println("getTokensGood");
        PlayerChild instance = null;
        int expResult = 0;
        int result = instance.getTokens();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testGetTokensBad() {
        System.out.println("getTokensBad");
        PlayerChild instance = null;
        int expResult = 0;
        int result = instance.getTokens();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testGetTokensBoundary() {
        System.out.println("getTokensBoundary");
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
        System.out.println("playGood");
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
        System.out.println("playBad");
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
        System.out.println("playBoundary");
        Card obj = null;
        PlayerChild instance = null;
        boolean expResult = false;
        boolean result = instance.play(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
