/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopofast;

import cit260.lhcz.monopofast.model.Player;
import cit260.lhcz.monopofast.view.ErrorView;
import cit260.lhcz.monopofast.view.StartView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
/**
 *
 * @author Christopher
 */
public class Monopofast {

    private static Player currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Monopofast.player = player;
    }

    public static Player getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Player currentGame) {
        Monopofast.currentGame = currentGame;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Monopofast.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        Monopofast.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        Monopofast.logFile = logFile;
    }

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        try {
            //open Character stream files for end user input/output
            
            Monopofast.inFile = new BufferedReader(new InputStreamReader(System.in));
            
            Monopofast.outFile = new PrintWriter(System.out, true);
            
            //open log file
            String filePath = "log.txt";
            Monopofast.logFile = new PrintWriter(filePath);
            
        
        //Create startView and start the program
        StartView startView = new StartView();
        startView.startProgram();
        return;
        }
        catch(Throwable e) {
                ErrorView.display(this.getClass().getName(),"Exception: " + e.toString()+
                        "\nCause: " + e.getCause() +
                        "\nMessage: " + e.getMessage());
                e.printStackTrace();;
        }
        
        finally{
            try {
                if(Monopofast.inFile != null)
                    Monopofast.inFile.close();
                
                if(Monopofast.outFile != null)
                    Monopofast.outFile.close();
                
                if(Monopofast.logFile != null)
                    Monopofast.logFile.close();
                
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(),"Error closing files.");
                return;
            }
        }
        /*
        // Game toString()
        Game newGame = new Game();
        
        newGame.setGameName("New Game");
        newGame.setGameId(1);
        newGame.setLastSublevel(1);
        
        String gameInfo = newGame.toString();
        this.console.println(gameInfo);
        
        // Character toString()
        Character frank = new Character();
        
        frank.setCharacterName("Frank");
        frank.setCharacterId(1);
        
        String charInfo = frank.toString();
        this.console.println(charInfo);
        
        // SubLevel toString()
        SubLevel sOne = new SubLevel();
        
        sOne.setSubLevelId(1);
        sOne.setMaxTime(30.0);
        sOne.setRecordTime(10.0);
        
        String subLevelInfo = sOne.toString();
        this.console.println(subLevelInfo);
        
        // Level toString()
        Level lOne = new Level();
        
        
        lOne.setLevelId(1);
        lOne.setLevelName("Drink Station");
        
                
        String levelInfo = lOne.toString();
        this.console.println(levelInfo);
        
        // World toString()
        World venti = new World();
        
        venti.setWorldId(1);
        venti.setWorldName("Venti's");
        
        String worldInfo = venti.toString();
        this.console.println(worldInfo);
        
        
        // Map toString()
        Map mOne = new Map();
        
        mOne.setMapId(1);
        mOne.setMapName("Map");
        
        String mapInfo = mOne.toString();
        this.console.println(mapInfo);
        
        // Ingredients toString()
        Ingredients cola = new Ingredients();
        
        cola.setIngredientId(1);
        cola.setIngredientName("cola");
        
        String ingrInfo = cola.toString();
        this.console.println(ingrInfo);
        
        // Products toString()
        Products triple = new Products();
        
        triple.setProductId(1);
        triple.setProductName("triple");
        
        String prodInfo = triple.toString();
        this.console.println(prodInfo);
        */
    }

   
   
    
}
