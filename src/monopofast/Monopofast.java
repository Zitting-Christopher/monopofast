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
import cit260.lhcz.monopofast.control.ChallengeControl;
import cit260.lhcz.monopofast.control.GameControl;
import cit260.lhcz.monopofast.control.ProductControl;
import java.util.Scanner;
import cit260.lhcz.monopofast.view.StartView;

/**
 *
 * @author Christopher
 */
public class Monopofast {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Create startView and start the program
        StartView startView = new StartView();
        startView.startProgram();
        
        // Player toString()
        Player logan = new Player();
        
        logan.setName("Logan Hamson");
        logan.setId(1);
        
        String playerInfo = logan.toString();
        System.out.println(playerInfo);
        
        // Game toString()
        Game newGame = new Game();
        
        newGame.setName("New Game");
        newGame.setId(1);
        newGame.setLastSublevel(1);
        
        String gameInfo = newGame.toString();
        System.out.println(gameInfo);
        
        // Character toString()
        Character frank = new Character();
        
        frank.setName("Frank");
        frank.setId(1);
        
        String charInfo = frank.toString();
        System.out.println(charInfo);
        
        // SubLevel toString()
        SubLevel sOne = new SubLevel();
        
        sOne.setId(1);
        sOne.setMaxTime(30.0);
        sOne.setRecordTime(10.0);
        
        String subLevelInfo = sOne.toString();
        System.out.println(subLevelInfo);
        
        // Level toString()
        Level lOne = new Level();
        
        lOne.setId(1);
        lOne.setName("Drink Station");
        
        String levelInfo = lOne.toString();
        System.out.println(levelInfo);
        
        // World toString()
        World venti = new World();
        
        venti.setId(1);
        venti.setName("Venti's");
        
        String worldInfo = venti.toString();
        System.out.println(worldInfo);
        
        
        // Map toString()
        Map mOne = new Map();
        
        mOne.setId(1);
        mOne.setName("Map");
        
        String mapInfo = mOne.toString();
        System.out.println(mapInfo);
        
        // Ingredients toString()
        Ingredients cola = new Ingredients();
        
        cola.setId(1);
        cola.setName("cola");
        
        String ingrInfo = cola.toString();
        System.out.println(ingrInfo);
        
        // Products toString()
        Products triple = new Products();
        
        triple.setId(1);
        triple.setName("triple");
        
        String prodInfo = triple.toString();
        System.out.println(prodInfo);
        
    }
   
    
}
