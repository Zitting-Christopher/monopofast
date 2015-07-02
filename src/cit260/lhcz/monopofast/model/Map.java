/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.model;
import java.io.Serializable;

/**
 *
 * @author Christopher
 */
public class Map implements Serializable {
    
    
    
    private  int noOfRows;
    private int noOfColumns;
    private Location[][] locations;
    
    private Level[] level;
    private SubLevel[] subLevel;
    private World[] world;

    public Map(int i, int i0) {
        
    }
    
//Venti(0,"The Bacon Empire"),
//    Ardy(1,"The Horse Kingdom"),
//    Jack(2,"The Fox Den"),
//    Queen(3,"The Cake Realm"),
//    McDumbledore(4,"The Wizard's Tower");
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNoOfRows() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    private static class Location {

        public Location() {
        }
    }

}
