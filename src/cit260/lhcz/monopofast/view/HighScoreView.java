/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.view;
import cit260.lhcz.monopofast.control.HighScore;
/**
 *
 * @author Logan
 */
public class HighScoreView extends View {
    
public HighScoreView(){
    
    super("___________________________________________________________"
            +"/n               High Score"
            + array
           );

}
@Override
                   public boolean doAction(Object obj){
                       String value = (String) obj; 
                       value = value.toUpperCase(); // convert to upper case
                     switch(value){
      
         
               case "E": //exit game
                   return true;
                default:
                    System.out.println("\n*** Invalid Selection ***");
                    break;
                     }
    return false;
    } 
}
