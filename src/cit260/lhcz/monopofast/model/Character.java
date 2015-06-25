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
public enum Character implements Serializable {
    
    Venti(0,"The Bacon Lady"),
    Hardy(1,"The Horse King"),
    Jackie(2,"The Vixen"),
    Maria(3,"The Cake Queen"),
    Ron(4,"The Wizard");
    
    
    private final int characterId;
    private final String description;

   

      public int getCharacterId() {
        return characterId;
    }

  

    public String getDescription () {
        return description;
    }

   
   

     Character(int characterId ,String description) {
        this.characterId= characterId;
        this.description= description;
    }

    
}
