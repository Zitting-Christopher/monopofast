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

public class ChallengeTwoView extends View {
    
public ChallengeTwoView(){
    
    super("\n"
            + "\n=================================="
            + "\n   Challenge two  "
            + "\n=================================="
            + "\nIf it takes you 8 seconds to to make a turnover, 7 seconds to make mozzarella sticks, "
            + "\nand 7 to make a root beer, and there are 15 people ordering one."
            + "\nhow long will it take you complete all of the above? "
            + "\nE - go back"
            + "\n=================================="
            + "\n"
            + "\n what is your Guess?:"
            + "\n"
            + "\n A. 310   B. 320 C. 330. D. 350");
}
double turnOverSeconds = 8;
int numOrders2 = 15;
double mozzaSeconds = 7;
double rootBeerSeconds = 7;
private double total = turnOverSeconds + mozzaSeconds + rootBeerSeconds * numOrders2;         
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
 

       
        
    