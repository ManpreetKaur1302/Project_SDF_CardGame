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
 * @author Manpreet Kaur
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
     * Test of getSize method, of class GroupOfCards.
     */
    @Test
    public void testGetSizeGood() {
        System.out.println("getSize");
        GroupOfCards instance = new GroupOfCards(4);
        boolean expResult = true;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of getSize method, of class GroupOfCards.
     */
    @Test
    public void testGetSizeBad() {
        System.out.println("getSize");
        GroupOfCards instance = new GroupOfCards(6);
        boolean expResult = false;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of getSize method, of class GroupOfCards.
     */
    @Test
    public void testGetSizeBoundary() {
        System.out.println("getSize");
        GroupOfCards instance = new GroupOfCards(3);
        boolean expResult = true;
        int result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
}
