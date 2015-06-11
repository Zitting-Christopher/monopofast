/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.view;

import cit260.lhcz.monopofast.control.GameControl;
import java.util.Scanner;
import monopofast.Monopofast;
/**
 *
 * @author Logan
 */

 public class ChallengeTwoView {
    
    private final String MENU = "\n"
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
            + "\n A. 310   B. 320 C. 330. D. 350";
     public void displayMenu() {
        char selection;
        
        do{
            System.out.println(MENU); //display the main menu
            String input = this.getInput();
            selection = input.charAt(0);
            this.doAction(selection);
            
            } while (selection != 'E' && selection != 'e');
    
    
}
    public String getInput(){
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
    String selection = null;
    while (!valid){
        selection = keyboard.nextLine();
        selection = selection.trim();
        if(selection.length()<1) {
            System.out.println("\n*** Invalid selection *** Try again");
        }
        
        break;
    }
    return selection;
    }
    double turnOverSeconds = 8;
            int numOrders2 = 15;
                    double mozzaSeconds = 7;
                            double rootBeerSeconds = 7;
        private double total = turnOverSeconds + mozzaSeconds + rootBeerSeconds * numOrders2;                    
                                    
    public void doAction(char choice) {
       
      switch(choice){
            case 'A': //A
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
             case 'B': //B
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
              case 'C': //C
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
               case 'D': //D
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
                case 'E': //exit Menu
                case 'e':
                    return;
                default:
                    System.out.println("\n*** Invalid Selection ***");
                    break;
            }
    
 }
 }

       
        
    