package cit260.lhcz.monopofast.control;



import cit260.lhcz.monopofast.model.Location;
import cit260.lhcz.monopofast.model.Map;
import exception.GameControlException;

import exception.MapControlException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import javafx.scene.Scene;
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

    public static Map createMap() {
        Map map = new Map(7, 7);
        assignScenesToLocations(map);

        return map;
    }

    private static void assignScenesToLocations(Map map) {
        Location[][] locations = map.getLocations();

        //start point
        locations[0][0].setScene(Scene.start);
        locations[0][1].setScene(Scene.Vendy);
        locations[0][2].setScene(Scene.Vendy);
        locations[0][3].setScene(Scene.Vendy);
        locations[0][4].setScene(Scene.Vendy);
        locations[0][5].setScene(Scene.Vendy);
        locations[0][6].setScene(Scene.Ardy);
        locations[0][7].setScene(Scene.Ardy);
        locations[0][8].setScene(Scene.Ardy);
        locations[0][9].setScene(Scene.Ardy);
        locations[1][0].setScene(Scene.Ardy);
        locations[1][1].setScene(Scene.Jack);
        locations[1][2].setScene(Scene.Jack);
        locations[1][3].setScene(Scene.Jack);
        locations[1][4].setScene(Scene.Jack);
        locations[1][5].setScene(Scene.Jack);
        locations[1][6].setScene(Scene.Queen);
        locations[1][7].setScene(Scene.Queen);
        locations[1][8].setScene(Scene.Queen);
        locations[1][9].setScene(Scene.Queen);
        locations[2][0].setScene(Scene.Queen);
        locations[2][1].setScene(Scene.McDumbledore);
        locations[2][2].setScene(Scene.McDumbledore);
        locations[2][3].setScene(Scene.McDumbledore);
        locations[2][4].setScene(Scene.McDumbledore);
        locations[2][5].setScene(Scene.McDumbledore);
        locations[2][6].setScene(Scene.Vendy);
        locations[2][7].setScene(Scene.Vendy);
        locations[2][8].setScene(Scene.Vendy);
        locations[2][9].setScene(Scene.Vendy);
        locations[3][0].setScene(Scene.Vendy);
        locations[3][1].setScene(Scene.Vendy);
        locations[3][2].setScene(Scene.Vendy);
        locations[3][3].setScene(Scene.Vendy);
        locations[3][4].setScene(Scene.Vendy);
        locations[3][5].setScene(Scene.Vendy);
        locations[3][6].setScene(Scene.Vendy);
        locations[3][7].setScene(Scene.Vendy);
        locations[3][8].setScene(Scene.Vendy);
        locations[3][9].setScene(Scene.Vendy);
        locations[4][0].setScene(Scene.Vendy);
        locations[4][1].setScene(Scene.Vendy);
        locations[4][2].setScene(Scene.Vendy);
        locations[4][3].setScene(Scene.Vendy);
        locations[4][4].setScene(Scene.Vendy);
        locations[4][5].setScene(Scene.Vendy);
        locations[4][6].setScene(Scene.Vendy);
        locations[4][7].setScene(Scene.Vendy);
        locations[4][8].setScene(Scene.Vendy);
        locations[4][9].setScene(Scene.Vendy);
        locations[5][0].setScene(Scene.Vendy);
        locations[5][1].setScene(Scene.Vendy);
        locations[5][2].setScene(Scene.Vendy);
        locations[5][3].setScene(Scene.Vendy);
        locations[5][4].setScene(Scene.Vendy);
        locations[5][5].setScene(Scene.Vendy);
        locations[5][6].setScene(Scene.Vendy);
        locations[5][7].setScene(Scene.Vendy);
        locations[5][8].setScene(Scene.Vendy);
        locations[5][9].setScene(Scene.Vendy);
        locations[6][0].setScene(Scene.Vendy);
        locations[6][1].setScene(Scene.Vendy);
        locations[6][2].setScene(Scene.Vendy);
        locations[6][3].setScene(Scene.Vendy);
        locations[6][4].setScene(Scene.Vendy);
        locations[6][5].setScene(Scene.Vendy);
        locations[6][6].setScene(Scene.ending);
//        
        
    }

    public static void startAtLocation(Map map) throws MapControlException {
        Player player1 = Monopofast.getPlayer();
        int row = map.getRowCount();
        int column = map.getColumnCount();
        GameControl.moveCharacterToLocation(player1, row, column);
    }
     public static void printMap() 
            throws GameControlException{
        try(FileOutputStream fops = new FileOutputStream("C:\\mapReport.txt")){
            ObjectOutputStream output = new ObjectOutputStream(fops);
            output.writeObject(Monopofast.getCurrentGame().getMap());
        }catch(Exception ex){
            throw new GameControlException(ex.getMessage());
        }
    }

    

    
}
