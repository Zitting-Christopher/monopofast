/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.control;

import cit260.lhcz.monopofast.model.Game;
import cit260.lhcz.monopofast.model.Player;
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
     * Test of getGame method, of class GameControl.
     */
    @Test
    public void testGetGame() {
        System.out.println("getGame");
        GameControl instance = new GameControl();
        Game expResult = null;
        Game result = instance.getGame();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGame method, of class GameControl.
     */
    @Test
    public void testSetGame() {
        System.out.println("setGame");
        Game game = null;
        GameControl instance = new GameControl();
        instance.setGame(game);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayer method, of class GameControl.
     */
    @Test
    public void testGetPlayer() {
        System.out.println("getPlayer");
        GameControl instance = new GameControl();
        Player expResult = null;
        Player result = instance.getPlayer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayer method, of class GameControl.
     */
    @Test
    public void testSetPlayer() {
        System.out.println("setPlayer");
        Player player = null;
        GameControl instance = new GameControl();
        instance.setPlayer(player);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createPlayer method, of class GameControl.
     */
    @Test
    public void testCreatePlayer() {
        System.out.println("createPlayer");
        String PlayerName = "";
        GameControl instance = new GameControl();
        Player expResult = null;
        Player result = instance.createPlayer(PlayerName);
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
        GameControl instance = new GameControl();
        instance.saveGame();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
