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
public class GameControlTest {
    
    public GameControlTest() {
    }

    /**
     * Test of loadGame method, of class GameControl.
     */
    @Test
    public void testLoadGame() {
        System.out.println("loadGame");
        String getGameName = "Pizza";
        GameControl instance = new GameControl();
        String expResult = "Pizza";
        String result = instance.loadGame(getGameName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
