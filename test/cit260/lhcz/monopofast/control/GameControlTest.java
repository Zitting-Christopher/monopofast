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

    /**
     * Test of startNewGame method, of class GameControl.
     */
    @Test
    public void testStartNewGame() {
        System.out.println("startNewGame");
        String setGameName = "";
        GameControl instance = new GameControl();
        String expResult = "";
        String result = instance.startNewGame(setGameName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveGame method, of class GameControl.
     */
    @Test
    public void testSaveGame() {
        System.out.println("saveGame");
        String getGameName = "";
        GameControl instance = new GameControl();
        String expResult = "";
        String result = instance.saveGame(getGameName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
