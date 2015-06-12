/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Logan
 */
public class ChallengeControlTest {
    
    public ChallengeControlTest() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    @Test
    public void testCalcChallengeOne() {
        System.out.println("calcChallengeOne");
        
        
    /**
     * Test One
     */
        System.out.println("Test one");
        double baconEaterSeconds = 6.0;
        int numOrders1 = 6;
        ChallengeControl instance = new ChallengeControl();
        double expResult = 56.0;
        double result = instance.calcChallengeOne(baconEaterSeconds, numOrders1);
        assertEquals(expResult, result, 56.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        
        /**
     * Test two
     */
        System.out.println("Test two");
        baconEaterSeconds = 4.0;
        numOrders1 = 1;
//        ChallengeControl instance = new ChallengeControl();
        expResult = -1.0;
        result = instance.calcChallengeOne(baconEaterSeconds, numOrders1);
        assertEquals(expResult, result, -1.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
            /**
     * Test three
     */
        System.out.println("Test three");
        baconEaterSeconds = 6.0;
        numOrders1 = 0;
//        ChallengeControl instance = new ChallengeControl();
        expResult = -1.0;
        result = instance.calcChallengeOne(baconEaterSeconds, numOrders1);
        assertEquals(expResult, result, -1.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
            /**
     * Test four
     */
        System.out.println("Test four");
        baconEaterSeconds = 5.0;
        numOrders1 = 1;
//        ChallengeControl instance = new ChallengeControl();
        expResult = 25.0;
        result = instance.calcChallengeOne(baconEaterSeconds, numOrders1);
        assertEquals(expResult, result, 25.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
            /**
     * Test five
     */
        System.out.println("Test five");
        baconEaterSeconds = 15.0;
        numOrders1 = 20;
//        ChallengeControl instance = new ChallengeControl();
        expResult = 320.0;
        result = instance.calcChallengeOne(baconEaterSeconds, numOrders1);
        assertEquals(expResult, result, 320.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
