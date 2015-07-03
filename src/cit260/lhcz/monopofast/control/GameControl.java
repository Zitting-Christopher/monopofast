/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.control;

import cit260.lhcz.monopofast.model.Game;
import cit260.lhcz.monopofast.model.Map;
import cit260.lhcz.monopofast.model.Player;
import monopofast.Monopofast;
import java.util.Scanner;


/**
 *
 * @author Logan
 */

public class GameControl {
    
    public static  void  createNewGame(Player player, Map map) {
        
        Game game = new Game(player,map); // create new game
        Monopofast.setCurrentGame(player); // save player in game
        game.setPlayer(player); // save player in game
         MapControl.createMap();
        game.setMap(map);
        MapControl.moveActorsToStartingLocation(map);
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

    public static void createNewGame(Player player) {
        
    }

    public static void assignScenesToLocations(Map map, MapControl.Scene[] scenes) {
        
    }

    
    
    private Player game;
    private Player player; 
    
 public Player getGame() {
        return player;
    }

    public void setGame(Player player) {
        this.player = game;
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
        
    }

    /*public static class createPlayer {

        public createPlayer() {
        }
    }*/


    
    
}