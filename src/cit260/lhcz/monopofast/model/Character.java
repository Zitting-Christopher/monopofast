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
 * @author Logan
 */
public enum Character implements Serializable {
    
    Vivian(0,"The Bacon Lady"),
    Hardy(1,"The Horse King"),
    Jackie(2,"The Vixen"),
    Maria(3,"The Cake Queen"),
    Ron(4,"The Wizard");
    
    
    private final int charId;
    private final String charDesc;
    
    private World world;

   

      public int getCharId() {
        return charId;
    }

  

    public String getCharDesc () {
        return charDesc;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

     Character(int charId ,String charDesc) {
        this.charId= charId;
        this.charDesc= charDesc;
    }

    
}
