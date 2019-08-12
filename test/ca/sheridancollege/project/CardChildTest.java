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
 * @author Owner
 */
public class CardChildTest {
    
    public CardChildTest() {
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
     * Test of getCardValue method, of class CardChild.
     */
    @Test
    public void testGetCardValueGood() {
        System.out.println("getCardValueGood");
        CardChild instance = null;
        int expResult = 0;
        int result = instance.getCardValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        @Test
    public void testGetCardValueBad() {
        System.out.println("getCardValueBad");
        CardChild instance = null;
        int expResult = 0;
        int result = instance.getCardValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        @Test
    public void testGetCardValueBoundary() {
        System.out.println("getCardValueBoundary");
        CardChild instance = null;
        int expResult = 0;
        int result = instance.getCardValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    

}
