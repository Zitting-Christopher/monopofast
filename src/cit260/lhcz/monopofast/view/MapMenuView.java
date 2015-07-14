/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.view;


import cit260.lhcz.monopofast.control.GameControl;
import cit260.lhcz.monopofast.control.MapControl;
import cit260.lhcz.monopofast.model.Location;
import cit260.lhcz.monopofast.model.Map;
import cit260.lhcz.monopofast.model.Player;
import exception.MapControlException;
import java.util.Scanner;
import monopofast.Monopofast;

/**
 *
 * @author Christopher
 */
public class MapMenuView extends View{
    private static boolean newcolumn;

                   public MapMenuView(){
                  super("\n"
                + "\n---------------------------------------"
                + "\n| Map Menu                            |"
                + "\n---------------------------------------"
                + "\nA - View All Worlds"
                + "\nR - Return to Previous Menu"
                + "\n---------------------------------------");
                   }
    
     @Override
                   public boolean doAction(Object obj){
                       String value = (String) obj; 
                       value = value.toUpperCase(); // convert to upper case
                     switch(value){
                                 
                 case "A":
                    this.viewMap();
                    break;
                    
                 case "R": //exit game
                   return true;
                default:
                    ErrorView.display(this.getClass().getName(),"\n*** Invalid Selection ***");
                    break;
                     }
    return false;
       
    
        
        }
         private void viewMap() {
        Location[][] locations = Monopofast.getCurrentGame().getMap().getLocations();

        System.out.println("\n              ***** Rabit Hole City ******");
        System.out.println("   | 0  | 1  | 2  | 3  | 4  | 5  | 6  | 7  | 8  | 9  | ");

        for (int i = 0; i < locations[0].length; i++) {
            System.out.println("\n************************************************************");
            System.out.format("%2d", i);
            for (int j = 0; j < locations[0].length; j++) {
                System.out.print(" | ");
                System.out.print(locations[i][j].getScene().getSymbol());

            }
            System.out.print(" | ");
        }
        System.out.println("\n**************************************************************");
    
    }   
         private void printMap() {
        try{
        MapControl.printMap();
        }catch(Exception ex){
            ErrorView.display("GameMenuView", ex.getMessage());
        }
    }
}
              
      