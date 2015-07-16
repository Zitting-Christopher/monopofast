/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.view;


import cit260.lhcz.monopofast.control.MapControl;
import cit260.lhcz.monopofast.model.Location;
import exception.GameControlException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
                + "\nA - View Map"
                + "\nP - Print Map"          
                + "\nR - Return to Previous Menu"
                + "\n---------------------------------------");
                   }
                   
      private void viewMap() {
        Location[][] locations = Monopofast.getCurrentGame().getMap().getLocations();

        System.out.println("\n***** Pizza Village ******");
        System.out.println("   | 0  | 1  | 2  | 3  | 4  | 5  | 6  |");

        for (int i = 0; i < locations[0].length; i++) {
            System.out.println("\n------------------------------------------------------");
            System.out.format("%2d", i);
            for (int j = 0; j < locations[0].length; j++) {
                System.out.print(" | ");
                System.out.print(locations[i][j].getScene().getSymbol());

            }
            System.out.print(" | ");
        }
        System.out.println("\n------------------------------------------------------");
    
    }
     @Override
                   public boolean doAction(Object obj){
                       String value = (String) obj; 
                       value = value.toUpperCase(); // convert to upper case
                     switch(value){
                                 
                 case "A":
                      viewMap();
                    break;
                    case "P":
                       {
                           try {
                               MapControl.printMap();
                           } catch (GameControlException ex) {
                               Logger.getLogger(MapMenuView.class.getName()).log(Level.SEVERE, null, ex);
                           }
                       }
                    break;
                 case "R": //exit game
                   return true;
                default:
                    ErrorView.display(this.getClass().getName(),"\n*** Invalid Selection ***");
                    break;
                     }
    return false;
       
    
        
        }
        
}
              
      