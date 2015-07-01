/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.view;

/**
 *
 * @author Logan
 */
public class StoreBioMenuView extends View {
    
public StoreBioMenuView(){
    
    super("\n"
                + "\n----------------------------------------"
                + "\n| Store BackGround                           |"
                + "\n----------------------------------------"
                + "\nA - Venti's "
                + "\nB - Ardy's"
                + "\nC - Queen's Kitchen"
                + "\nD - McDumbledore's"
                + "\nE - Exit"
                + "\n----------------------------------------");
}
    @Override
                   public boolean doAction(Object obj){
                       String value = (String) obj; 
                       value = value.toUpperCase(); // convert to upper case
                     switch(value){
                case "A": //create and start a new game
                    this.Venny();
                    break;
                    
               case "B": //Challange menu
                    this.Ardy();
                   break;
                    
                case "C": //View Map
                    this.QueenKitchen();
                 break;
                    case "D": //View Map
                    this.McDumbledore();
                        
             
                    break;
                    
                       case "E": //exit game
                   return true;
                default:
                    System.out.println("\n*** Invalid Selection ***");
                    break;
                     }
    return false;
    } 
               private void  Venny(){
                        // create a new game
                               System.out.println("Venny's"
                                       + "\n********************"
                                       + "\nVenny's was founnded on one idea, and that idea was bacon and more"
                                       + "\nbacon. it was founned in China. it serves american style food"
                                       + "\nwith a Asian twist. It has become popular worldwide"
                                       + "\nand has made it way to America, where it is rocking the boat"
                                       + "\nwith it's strange Asian style decore yet it serves no Asian food.");
                        }
               private void  Ardy(){
                        // create a new game
                               System.out.println("Ardy's"
                                       + "\n********************"
                                       + "\nThe founder of Ardy's Mr. Hardy is a spend thrift and many"
                                       + "\npeople say that he uses horse meat instead of beef on his "
                                       + "\nsandwiches. He claimes that even if he did you would not be able to tell.");
                        }
               private void  QueenKitchen(){
                        // create a new game
                               System.out.println("Queen's Kitchen"
                                       + "\n********************"
                                       + "\n This is your one place to go when your on a budget and want "
                                       + "\nto be treated like royalty."
                               );
                                       
                        }
                   private void McDumbledore(){
                        // create a new game
                               System.out.println("McDumbledore" 
                                       + "\n********************"
                                       + "\nThis wizard theme restruant make you feel as though you have"
                                       + "\nstepped through the padges of your favorite book seris.");
                        }
}
