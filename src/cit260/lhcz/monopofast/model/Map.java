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
    
    private int mapId;
    String description;
    

    public int getMadId() {
        return mapId;
    }

   
     Map(int mapId ,String description) {
         this.mapId= mapId;
        this.description= description;
    }

}
