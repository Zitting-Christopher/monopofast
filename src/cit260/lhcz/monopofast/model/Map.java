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
public enum Map implements Serializable {
    
    Venti(0,"The Bacon Empire"),
    Ardy(1,"The Horse Kingdom"),
    Jack(2,"The Fox Den"),
    Queen(3,"The Cake Realm"),
    McDumbledore(4,"The Wizard's Tower");
    
    private final int mapId;
    private final String mapDesc;
    
    private Level[] level;
    private SubLevel[] subLevel;
    private World[] world;
    

    public int getMapId() {
        return mapId;
    }
    
    public String getMapDesc() {
        return mapDesc;
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

     Map(int mapId ,String mapDesc) {
        this.mapId= mapId;
        this.mapDesc= mapDesc;
    }

}
