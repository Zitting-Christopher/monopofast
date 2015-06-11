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
 *@author Logan
 * @author Christopher
 */
public class GameMenuView {
    
    private final String MENU = "\n"
                + "\n----------------------------------------"
                + "\n| Game Menu                            |"
                + "\n----------------------------------------"
                + "\nC - Continue Game"
                + "\nH - Get Help"
                + "\nS - Save Game"
                + "\nE - Exit"
                + "\n----------------------------------------";
   
    public void displayMenu() {
        char selection;
        
        do{
            System.out.println(MENU); //display the main menu
            String input = this.getInput();
            selection = input.charAt(0);
            this.doAction(selection);
            
            } while (selection != 'E');
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
                case 'C': //create and start a new game
                    this.ContinueGame();
                    break;
                                  
                case 'H': //Help menu
                    this.helpMenu();
                   break;
                case 'S': //save game
                    this.saveGame();
                    break;
                case 'E': //exit game
                    return;
                default:
                    System.out.println("\n*** Invalid Selection ***");
                    break;
            }
    } 
                        private void ContinueGame(){
                        // create a new game
                               System.out.println("ERROR- Failed to create new game");
                        }
                         private void saveGame(){
                        
                            System.out.println("ERROR- Failed to Save game");
                        }
                          private void helpMenu(){
{
                         System.out.println("ERROR- Failed to load the help menu");
                        }
                         }
}
                         


