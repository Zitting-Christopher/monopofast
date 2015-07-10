/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.control;

import cit260.lhcz.monopofast.model.Game;
import cit260.lhcz.monopofast.model.Map;
import cit260.lhcz.monopofast.model.Player;
import cit260.lhcz.monopofast.view.ErrorView;
import monopofast.Monopofast;
import cit260.lhcz.monopofast.view.View;
import exception.GameControlException;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;



/**
 *
 * @author Logan
 */

public class GameControl {
    private static String filepath;

  

    public static void getSaveGame(String filePath) throws GameControlException {
        Game game = null;
        
        try( FileInputStream fips = new FileInputStream(filepath)) {
             ObjectInputStream output = new ObjectInputStream(fips);
             
             game = (Game) output.readObject();
        }
             catch(FileNotFoundException fnfe) {
                throw new GameControlException(fnfe.getMessage());
                
                }
        catch(Exception e) {
                throw new GameControlException(e.getMessage());
        }
        Monopofast.setCurrentGame(game);
    }
    
    protected final BufferedReader keyboard = Monopofast.getInFile();
    protected final PrintWriter console = Monopofast.getOutFile();
    
    public static  void  createNewGame(Player player, Map map) {
        
        Game game = new Game(player,map); // create new game
        Monopofast.setCurrentGame(game); // save player in game
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

    

    public static void assignScenesToLocations(Map map, MapControl.Scene[] scenes) {
        
    }

    public static void saveGame(Game game, String filePath) 
        throws GameControlException {
        
        try( FileOutputStream fops = new FileOutputStream(filepath)) {
             ObjectOutputStream output = new ObjectOutputStream(fops);
             
             output.writeObject(game);
        }
    
        catch(IOException e) {
                throw new GameControlException(e.getMessage());
                
                }
        }
    
    public void createNewGame(Player player) {
        
    }
//    public void saveGame(Player currentGame) {
//      
//        this.console.println("\n\n Where do you want to save the game?");
//        
//        
//        try {
//            //save the game to specified file
//            String filePath = this.getInput();
//            GameControl.saveGame(Monopofast.getCurrentGame(), filePath);
//        }
//        catch(Exception ex) {
//            ErrorView.display("MainMenuView", ex.getMessage());
//        }
//    }

    public static void StartSavedGame(String filepath) 
       throws GameControlException {
        Game game = null;
        
        try( FileInputStream fips = new FileInputStream(filepath)) {
             ObjectInputStream output = new ObjectInputStream(fips);
             
//             game = (Game) output.readObject();
        }
             catch(FileNotFoundException fnfe) {
                throw new GameControlException(fnfe.getMessage());
                
                }
        catch(IOException e) {
                throw new GameControlException(e.getMessage());
        }
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

    
    public static class createPlayer {

        public createPlayer() {
        }
    }

    private String getInput() {
        return null;
        
    }


    
    
}