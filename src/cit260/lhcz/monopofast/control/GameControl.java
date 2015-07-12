/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.control;

import cit260.lhcz.monopofast.model.Character;
import cit260.lhcz.monopofast.model.Game;
import cit260.lhcz.monopofast.model.Ingredients;
import cit260.lhcz.monopofast.model.Map;
import cit260.lhcz.monopofast.model.Player;
import cit260.lhcz.monopofast.model.Products;
import cit260.lhcz.monopofast.model.SubLevel;
import cit260.lhcz.monopofast.view.ReportMenuView;
import monopofast.Monopofast;
import exception.GameControlException;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.List;



/**
 *
 * @author Logan
 */

public class GameControl {

  

    public static void getSaveGame(String filePath) throws GameControlException {
        Game game = null;
        
        try( FileInputStream fips = new FileInputStream(filePath)) {
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

    
    

    public void saveCharacterReport(List<Character> asList, String string) {
        ReportMenuView.saveCharacterReport();
    }

    public void saveProductReport(List<Products> asList, String string) {
        ReportMenuView.saveProductReport();
    }

    public void saveIngrReport(List<Ingredients> asList, String string) {
        ReportMenuView.saveIngrReport();
    }
    
     public void saveLocReport(List<Map> asList, String string) {
        ReportMenuView.saveLocReport();
    }
     public static void saveSubleReport(List<SubLevel> asList, String string) {
        ReportMenuView.saveLocReport();
    }
    protected final BufferedReader keyboard = Monopofast.getInFile();
    protected final PrintWriter console = Monopofast.getOutFile();
    protected final PrintWriter charRptFile = Monopofast.getCharRptFile();
    protected final PrintWriter prodRptFile = Monopofast.getProdRptFile();
    protected final PrintWriter IngrRptFile = Monopofast.getIngrRptFile();
    protected final PrintWriter LocRptFile = Monopofast.getLocRptFile();
    protected final PrintWriter sublevptFile = Monopofast.getSubleRptFile();
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
        
        try( FileOutputStream fops = new FileOutputStream(filePath)) {
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

    public static void StartSavedGame(String filePath) 
       throws GameControlException {
        Game game = null;
        
        try( FileInputStream fips = new FileInputStream(filePath)) {
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