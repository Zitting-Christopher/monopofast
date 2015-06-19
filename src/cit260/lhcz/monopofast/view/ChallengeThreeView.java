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
public class ChallengeThreeView extends View {
    
public ChallengeThreeView(){
    
    super("\n"
            + "\n=================================="
            + "\n   Challenge One  "
            + "\n=================================="
            + "\nIf it takes you 8 seconds to make a Son of a Bacon Eater Sandwich,"
            + "\nand there are 15 people ordering one, and you must wash your hands."
            + "\n(which takes 20 seconds), how long will it take you complete all of the above? "
            + "\nE - go back"
            + "\n=================================="
            + "\n what is your Guess?:"
            + "\n A. 130   B. 120 C. 140. D. 150");
}
    
    
                     
    private final int handWash = 20;
    private final double baconEaterSeconds = 8;
    private final int numOrders1=15;
    private double total = baconEaterSeconds * numOrders1 + handWash;
           @Override
                   public boolean doAction(Object obj){
                       String value = (String) obj; 
                       value = value.toUpperCase(); // convert to upper case
                     switch(value){
      
            case "A": //A
                    if (total < 140)
                    {
                        String output2 = "Too Low.";
                        System.out.println(output2);
                    }
                    else
                    {
                        String output2 = "Wrong";
                        System.out.println(output2);
                    }
            break;
             case "B": //B
                    if (total < 140)
                    {
                        String output2 = "Too Low.";
                        System.out.println(output2);
                    }
                    else
                    {
                        String output2 = "Wrong";
                        System.out.println(output2);
                    }
             break;
              case "C": //C
                    if (total < 140)
                    {
                        String output2 = "Too Low.";
                        System.out.println(output2);
                    }
                    else
                    {
                        String output2 = "Correct";
                        System.out.println(output2);
                    }
              break;
               case "D": //D
                    if (total > 140)
                    {
                        String output2 = "Too High.";
                        System.out.println(output2);
                    }
                    else
                    {
                        String output2 = "Wrong";
                        System.out.println(output2);
                    }
               case "E": //exit game
                   return true;
                default:
                    System.out.println("\n*** Invalid Selection ***");
                    break;
                     }
    return false;
    } 
    
 }
 

       
        
    