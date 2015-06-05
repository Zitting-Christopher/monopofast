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
public class ControlsTest {
    
    public ControlsTest() {
    }

    /**
     * Test of getChallengeControl method, of class Controls.
     */
    @Test
    public void testGetChallengeControl() {
        System.out.println("getChallengeControl");
        ChallengeControl expResult = null;
        ChallengeControl result = Controls.getChallengeControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGameControl method, of class Controls.
     */
    @Test
    public void testGetGameControl() {
        System.out.println("getGameControl");
        GameControl expResult = null;
        GameControl result = Controls.getGameControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProductControl method, of class Controls.
     */
    @Test
    public void testGetProductControl() {
        System.out.println("getProductControl");
        ProductControl expResult = null;
        ProductControl result = Controls.getProductControl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
