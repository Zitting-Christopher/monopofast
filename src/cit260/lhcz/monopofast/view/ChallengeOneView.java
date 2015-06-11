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

 public class ChallengeOneView {
    
    private final String MENU = "\n"
            + "\n=================================="
            + "\n   Challenge One  "
            + "\n=================================="
            + "\nIf it takes you 8 seconds to make a Son of a Bacon Eater Sandwich,"
            + "\nand there are 15 people ordering one, and you must wash your hands."
            + "\n(which takes 20 seconds), how long will it take you complete all of the above? "
            + "\n0 - go back"
            + "\n==================================";
    
  public void displayMenu() {
               char selection;
        
        do{
            System.out.println(MENU); //display the main menu
            String input = this.getInput();
            selection = input.charAt(0);
            
            
            } while (selection != 'E');
    
    
}
        
     public String getInput(){
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
    String selection = null;
    while (!valid){
        System.out.println("What is the answer?");
        selection = keyboard.nextLine();
        selection = selection.trim();
        if(selection.length()<1) {
            System.out.println("\n*** Invalid selection *** Try again");
             continue; //and repeat again
        }
        
        break;
        
    }
    return selection;
    }
    private final int handWash = 20;
    private final double baconEaterSeconds = 8;
    private final int numOrders1=15;
    private double total = baconEaterSeconds * numOrders1 + handWash;
   
    public void doAction(int choice) {
   
      if (choice == total) {
            System.out.println("That is right!");
            }
    else{
            System.out.println("Your answer is incorrect. Try again.");
    }   
    }
 }

       
        
    