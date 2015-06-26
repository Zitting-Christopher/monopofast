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
    
    Venny(0,"The Bacon Lady"),
    Hardy(1,"The Horse King"),
    Jackie(2,"The Vixen"),
    Maria(3,"The Cake Queen"),
    Ron(4,"The Wizard");
    
    
    private final int charId;
    private final String charDesc;

   

      public int getCharId() {
        return charId;
    }

  

    public String getCharDesc () {
        return charDesc;
    }

   
   

     Character(int charId ,String charDesc) {
        this.charId= charId;
        this.charDesc= charDesc;
    }

    
}
