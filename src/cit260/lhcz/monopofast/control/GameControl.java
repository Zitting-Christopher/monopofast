/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.control;

import cit260.lhcz.monopofast.model.Game;
import cit260.lhcz.monopofast.model.Player;
import monopofast.Monopofast;
import java.util.Scanner;


/**
 *
 * @author Logan
 */

public class GameControl {
    
    public static void createNewGame(Player player) {
        System.out.println("\n*** createNewGame ***");
    }
    
    public static Player createPlayer (String playerName) {
    if (playerName == null)
    {
    return null;
    }
    
    Player player = new Player();
    player.setPlayerName(playerName);
    
    Monopofast.setPlayer(player);
    return player;
    }
    private Game game;
    private Player player; 
    
 public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    
    
    /*public static Player createPlayer(String playerName) {
        
        System.out.println("\n**** createPlayer function called ****");
        
        return null;
    
    }*/

    public void saveGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /*public static class createPlayer {

        public createPlayer() {
        }
    }*/


    
    
}