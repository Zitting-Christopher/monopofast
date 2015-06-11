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
            + "\nYIf it takes you 8 seconds to make a Son of a Bacon Eater Sandwich,"
            + "\nand there are 15 people ordering one, and you must wash your hands."
            + "\n(which takes 20 seconds), how long will it take you complete all of the above? "
            + "\nR - go back"
            + "\n==================================";
    
  public void displayMenu() {
        char selection;
        
        do{
            System.out.println(MENU); //display the main menu
            String input = this.getInput();
            selection = input.charAt(0);
            this.doAction(selection);
            
            } while (selection != 'R');
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

    public void doAction(char choice) {
            
            switch(choice){
                case 'R': //exit game
                case 'r':
                    return;
                default:
                    System.out.println("\n*** Invalid Selection ***");
                    break;
            }
    } 

    
    private int doAction(String answer) {
        
        double guess = Double.parseDouble(answer);
        
        double waterTank = 140;
        
        if (guess == waterTank) {
            
            System.out.println("You found Got the Challenge right.");
            return 1;
        }
        else{
            System.out.println("Your answer is incorrect. Try again.");
            return -1;
        }
    }
 }

   