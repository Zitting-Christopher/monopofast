/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.model;
import cit260.lhcz.monopofast.control.GameControl;
import cit260.lhcz.monopofast.control.MapControl.Scene;
import java.io.Serializable;

/**
 *
 * @author Christopher
 */
public class Map implements Serializable {

    private static Scene[] createScenes() {
        return null;
      
    }
    
    
    
    private  int noOfRows;
    private int noOfColumns;
    private Location[][] locations;
    
    private Level[] level;
    private SubLevel[] subLevel;
    private World[] world;
public Map(){
}
    public Map(int noOfRows, int noOfColumns) {
       if (noOfRows < 1 || noOfColumns < 1) {
    System.out.println("The number of rows and columns must be > zero");
    return;
} 
    }
    this.noOfRows = noOfRows;
    this.noOfColumns = noOfColumns;
    this.locations = new Location[noOfRows][noOfColumns];
for (int row = 0; row < noOfRows; row++){
    for(int column = 0; column < noOfColumns; column++) {
        Location location = new Location();
        location.setColumn(column);
        location.setRow(row);
        location.setVisited(false);
        locations[row] [column] = location;
    }
}
    public int  getMapId() {
        return noOfRows;
    }
    
    public int getMapDesc() {
        return noOfColumns;
    }

    public Level[] getLevel() {
        return level;
    }

    public void setLevel(Level[] level) {
        this.level = level;
    }

    public SubLevel[] getSubLevel() {
        return subLevel;
    }

    public void setSubLevel(SubLevel[] subLevel) {
        this.subLevel = subLevel;
    }

    public World[] getWorld() {
        return world;
    }

    public void setWorld(World[] world) {
        this.world = world;
    }

    public boolean getNoOfColumns() {
        return false;
        
    }

    public int getNoOfRows() {
        return 0;
        
    }

    private static Map createMap() {
        Map map = new Map(20, 20);
        Scene[] scenes = createScenes();
        GameControl.assignScenesToLocations(map, scenes);
        return map;
    }

    private static class Location {

        public Location() {
        }

        private void setVisited(boolean b) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setRow(int row) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setColumn(int column) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class noOfColumns {

        public noOfColumns() {
        }
    }

    private static class row<T0, T1> {

        public row() {
        }
    }

    private static class noOfRows {

        public noOfRows() {
        }
    }

    private static class locations {

        public locations() {
        }
    }

  
    }
