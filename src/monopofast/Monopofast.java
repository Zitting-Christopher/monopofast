/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopofast;

import cit260.lhcz.monopofast.model.Game;
import cit260.lhcz.monopofast.model.Player;
import cit260.lhcz.monopofast.model.Character;
import cit260.lhcz.monopofast.model.Ingredients;
import cit260.lhcz.monopofast.model.Products;
import cit260.lhcz.monopofast.model.Level;
import cit260.lhcz.monopofast.model.Map;
import cit260.lhcz.monopofast.model.SubLevel;
import cit260.lhcz.monopofast.model.World;
import cit260.lhcz.monopofast.view.StartView;

/**
 *
 * @author Christopher
 */
public class Monopofast {

    private static Game currentGame = null;
    private static Player player = null;

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Monopofast.player = player;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Monopofast.currentGame = currentGame;
    }

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Create startView and start the program
        StartView startView = new StartView();
        startView.startProgram();
        /*
        // Game toString()
        Game newGame = new Game();
        
        newGame.setGameName("New Game");
        newGame.setGameId(1);
        newGame.setLastSublevel(1);
        
        String gameInfo = newGame.toString();
        System.out.println(gameInfo);
        
        // Character toString()
        Character frank = new Character();
        
        frank.setCharacterName("Frank");
        frank.setCharacterId(1);
        
        String charInfo = frank.toString();
        System.out.println(charInfo);
        
        // SubLevel toString()
        SubLevel sOne = new SubLevel();
        
        sOne.setSubLevelId(1);
        sOne.setMaxTime(30.0);
        sOne.setRecordTime(10.0);
        
        String subLevelInfo = sOne.toString();
        System.out.println(subLevelInfo);
        
        // Level toString()
        Level lOne = new Level();
        
        
        lOne.setLevelId(1);
        lOne.setLevelName("Drink Station");
        
                
        String levelInfo = lOne.toString();
        System.out.println(levelInfo);
        
        // World toString()
        World venti = new World();
        
        venti.setWorldId(1);
        venti.setWorldName("Venti's");
        
        String worldInfo = venti.toString();
        System.out.println(worldInfo);
        
        
        // Map toString()
        Map mOne = new Map();
        
        mOne.setMapId(1);
        mOne.setMapName("Map");
        
        String mapInfo = mOne.toString();
        System.out.println(mapInfo);
        
        // Ingredients toString()
        Ingredients cola = new Ingredients();
        
        cola.setIngredientId(1);
        cola.setIngredientName("cola");
        
        String ingrInfo = cola.toString();
        System.out.println(ingrInfo);
        
        // Products toString()
        Products triple = new Products();
        
        triple.setProductId(1);
        triple.setProductName("triple");
        
        String prodInfo = triple.toString();
        System.out.println(prodInfo);
        */
    }
   
    
}
