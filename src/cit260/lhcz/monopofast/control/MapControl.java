package cit260.lhcz.monopofast.control;

import cit260.lhcz.monopofast.model.Map;
import cit260.lhcz.monopofast.model.Player;
import java.awt.Point;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Logan
 */
public class MapControl {

    public static Map createMap() {
        
       Map map = new Map(20,20);
       Scene[] scenes = createScenes();
       assignScenesToLocations(map, scenes);
       return map;
    }

    private static Scene[] createScenes() {
        
        return null;
}
   
    

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        
    }

    public static int moveActorsToStartingLocation(Map map) {
       Player[] players = Player.values();
       for(Player player: players){
           Point coordinates = player.getCoordinates();
           int returnValue = MapControl.moveActorsToLocation(player, coordinates);
           if(returnValue < 0){
               return returnValue;
           }
           }
       return 0;
       }

    public static int moveActorsToLocation(Player player, Point coordinates) {
        return 0;
        
    }
    

    public static class Scene {

        public Scene() {
        }
    }
    
}
