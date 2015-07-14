/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.control;

import cit260.lhcz.monopofast.model.Map;
import cit260.lhcz.monopofast.model.Player;
import exception.MapControlException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import monopofast.Monopofast;

/**
 *
 * @author Logan
 */
public class CharacterControl {
    private final String PROMPT = "Input a direction to go or back to return to the menu:";
    protected final BufferedReader keyboard = Monopofast.getInFile();
    protected final PrintWriter console = Monopofast.getOutFile();
    
   
     
    public static void moveCharacterToLocation(Player player, int row, int column)
        throws MapControlException{
        Map map = Monopofast.getCurrentGame().getMap();
        int newRow = row - 1;
        int newColumn = column - 1;
        
        if (newRow < 0 || newRow >= map.getRowCount() || newColumn < 0 || newColumn >= map.getColumnCount()){
            throw new MapControlException("Cannot move to " + row + "," + column +
                                          "because that location is out of the map boundaries.");
        }
    }
}
    

   