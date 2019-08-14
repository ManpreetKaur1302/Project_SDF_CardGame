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

public class CardChildTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

     /**
     * Test of getCardValue method, of class CardChild.
     */
    @Test
    public void testGetCardValueGood() {
        System.out.println("getCardValueGood");
        CardChild instance = new CardChild(4);
        boolean expResult = true;
        int result = instance.getCardValue();
        assertEquals(expResult, result);
        // TODO review the generated test code 
        //and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        @Test
    public void testGetCardValueBad() {
        System.out.println("getCardValueBad");
        CardChild instance = new CardChild(2);
        boolean expResult = false;
        int result = instance.getCardValue();
        assertEquals(expResult, result);
        // TODO review the generated test code 
        //and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        @Test
    public void testGetCardValueBoundary() {
        System.out.println("getCardValueBoundary");
        CardChild instance = new CardChild(3);
        boolean expResult = true;
        int result = instance.getCardValue();
        assertEquals(expResult, result);
        // TODO review the generated test code 
        //and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    

}
