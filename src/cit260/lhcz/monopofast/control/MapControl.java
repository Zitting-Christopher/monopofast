package cit260.lhcz.monopofast.control;

import cit260.lhcz.monopofast.model.Map;
import cit260.lhcz.monopofast.model.Player;

import exception.MapControlException;
import java.awt.Point;
import monopofast.Monopofast;

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
    private static Object monopofast;
    public static Map createMap() {
        
       Map map = new Map(20,20);
       Scene[] scenes = createScenes();
       assignScenesToLocations(map, scenes);
       return map;
    }

    public static Scene[] createScenes() {
        
        return null;
}
   
    

    public static void assignScenesToLocations(Map map, Scene[] scenes) {
        
    }

    public static void moveActorsToStartingLocation(Map map) {
       Player[] players = Player.values();
       for(Player player: players){
            Point coordinates = player.getCoordinates();
            MapControl.moveActorsToLocation(player, coordinates);
       
       }
    }
    public static void movePlayerToLocation(Player player, point coordinates)
        throws MapControlException{
    Map map = Monopofast.getCurrentGame().getMap();
    int newRow = coordinates.x-1;
    int newColumn = coordinates.y-1;
     if(newRow < 0 || newRow >= map.getRow() || newColumn < 0 || newColumn >= map.getColumn()) {
      throw new MapControlException("Can not move to that location "
      + coordinates.x + ", " + coordinates.y
      + " because that Location is not "
      + " somewhere we will let you go. ");
    }    
         
    } 
       
    public static int moveActorsToLocation(Player player, Point coordinates) {
        return 0;
        
    }

    public static class Scene {

        public Scene() {
        }
    }

    public static class point {
        private int x;
        private int y;

        public point() {
        }
    }
    
}
