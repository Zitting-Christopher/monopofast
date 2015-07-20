package cit260.lhcz.monopofast.control;

import cit260.lhcz.monopofast.model.*;
import exception.*;
import java.awt.Point;
import java.io.PrintWriter;
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

    static Map createMap() {
        Map map = new Map(6, 6);

        MapControl.assignScenesToLocations(map);

        return map;
    }


    private static void assignScenesToLocations(Map map) {
        Location[][] locations = map.getLocations();


        //start point
        locations[0][0].setScene(Scene.start);
        locations[0][2].setScene(Scene.Vendy);
        locations[0][2].setScene(Scene.Vendy);
        locations[0][3].setScene(Scene.Vendy);
        locations[0][4].setScene(Scene.Vendy);
        locations[0][5].setScene(Scene.Vendy);
        locations[1][0].setScene(Scene.Ardy);
        locations[1][1].setScene(Scene.Jack);
        locations[1][2].setScene(Scene.Jack);
        locations[1][3].setScene(Scene.Jack);
        locations[1][4].setScene(Scene.Jack);
        locations[1][5].setScene(Scene.Jack);
        locations[2][0].setScene(Scene.Queen);
        locations[2][1].setScene(Scene.Queen);
        locations[2][2].setScene(Scene.Queen);
        locations[2][3].setScene(Scene.Queen);
        locations[2][4].setScene(Scene.Queen);
        locations[2][5].setScene(Scene.McDumbledore);
        locations[3][0].setScene(Scene.McDumbledore);
        locations[3][1].setScene(Scene.McDumbledore);
        locations[3][2].setScene(Scene.McDumbledore);
        locations[3][3].setScene(Scene.McDumbledore);
        locations[3][4].setScene(Scene.Ardy);
        locations[3][5].setScene(Scene.Ardy);
        locations[4][0].setScene(Scene.Ardy);
        locations[4][1].setScene(Scene.Ardy);;
        locations[4][2].setScene(Scene.Vendy);
        locations[4][3].setScene(Scene.Vendy);
        locations[4][4].setScene(Scene.Vendy);
        locations[4][5].setScene(Scene.Vendy);
        locations[5][0].setScene(Scene.Vendy);
        locations[5][1].setScene(Scene.Vendy);
        locations[5][2].setScene(Scene.Vendy);
        locations[5][3].setScene(Scene.Vendy);
        locations[5][4].setScene(Scene.Vendy);
        locations[5][5].setScene(Scene.ending);
//        

    }

   public static Location movePlayerToLocation(Player player, Point coordinates) throws MapControlException {


        // get map (location)
        Location[][] locations = Monopofast.getCurrentGame().getMap().getLocations();

        // if player == null, throw MapControlException
        if (player == null) {
            throw new MapControlException("Player is null");
        }

        //if coordinates x and y > 5 or < 0 throw exception
        if (coordinates.x > locations.length - 1 || coordinates.y > locations[0].length - 1 || coordinates.x < 0 || coordinates.y < 0) {
            throw new MapControlException("Location is out of map boundaries");
        }

        Location targetLocation = locations[coordinates.x][coordinates.y];

        //move out of the current location
        player.getLocation().setPlayer(null);

        //put in new location
        targetLocation.setPlayer(player);

        // Assign a new location to the player
        player.setLocation(targetLocation);

        //return new location
        return targetLocation;
        
    }
    
    
    public static void printScene(){
        Map map = Monopofast.getCurrentGame().getMap();
        Location[][] locations = map.getLocations();
        System.out.println("\n" + locations[Monopofast.getCurrentLocation().getRow()][Monopofast.getCurrentLocation().getColumn()].getScene().getDescription());
    }
   

}