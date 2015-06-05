/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.control;

import cit260.lhcz.monopofast.model.Game;

/**
 *
 * @author Christopher
 */
public class GameControl {
    
    public String setGameName = setName();
   public String startNewGame(String setGameName)
    {
        return "Your game has been created.";
    }
    public String getGameName = getName(); 
    public String loadGame(String getGameName)
    {
       
        return "Your game has been loaded.";
    }
    
    public String saveGame(String getGameName)
    {
        return "Your game has been saved.";
    }

    private String setName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
