/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.view;

import cit260.lhcz.monopofast.model.Player;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Logan
 */
public class MapViewTest {
    
    public MapViewTest() {
    }

    /**
     * Test of displayMenu method, of class MapView.
     */
    @Test
    public void testDisplayMenu() {
        System.out.println("displayMenu");
        MapMenuView instance = new MapMenuView();
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
        fail("Your mom.");
    }

    /**
     * Test of getInput method, of class MapView.
     */
    @Test
    public void testGetInput() {
        System.out.println("getInput");
        MapMenuView instance = new MapMenuView();
        String expResult = null;
        String result = instance.getInput();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doAction method, of class MapView.
     */
    @Test
    public void testDoAction() {
        System.out.println("doAction");
        char choice = '3';
        MapMenuView instance = new MapMenuView();
        instance.doAction(choice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of movePlayerToLocation method, of class MapView.
     */
    @Test
    public void testMovePlayerToLocation() {
        System.out.println("movePlayerToLocation");
        Player player = null;
        point coordinates = null;
        int expResult = 0;
        Object result = null;
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
