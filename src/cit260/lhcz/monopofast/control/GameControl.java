/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.control;

import cit260.lhcz.monopofast.model.Game;
import cit260.lhcz.monopofast.model.Player;



/**
 *
 * @author Logan
 */

public class GameControl {
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

    
    
    public Player createPlayer(String PlayerName) {
        
        player = new Player();
        player.setPlayerName(PlayerName);
        
        return player;
    
    }

    public void saveGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
    
}