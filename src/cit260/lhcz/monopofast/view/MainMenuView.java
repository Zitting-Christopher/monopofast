/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.view;

import cit260.lhcz.monopofast.control.GameControl;
import cit260.lhcz.monopofast.view.GameMenuView;
import java.util.Scanner;
import monopofast.Monopofast;

/**
 *
 * @author Christopher
 */
public class MainMenuView {

    private final String MENU = "\n"
                + "\n----------------------------------------"
                + "\n| Main Menu                            |"
                + "\n----------------------------------------"
                + "\nG - Start Game"
                + "\nH - Get Help"
                + "\nS - Save Game"
                + "\nL - Load Game"
                + "\nE - Exit"
                + "\n----------------------------------------";
   public void displayMenu() {
       String input = "E"; //get the user's selection
        String selection = input;
//        char selection = ' ';
        do{
            
          System.out.println(MENU); //display the main menu
             Scanner keyboard = new Scanner(System.in); //keyboard input
             selection = keyboard.nextLine();
            
           
     
        
//            selection = input.charAt(selection); //get first char of string
//            
//            this.doAction(selection); //do action based on selection
//                   
           } while (selection != "E"); //selection not Exit
    }
        
        public void doAction(String choice) {
            
            switch(choice){
                case "N": //create and start a new game
                    this.startNewGame();
                    break;
                case "L": //Load a saved game
                    this.loadGame();
                    break;
                case "H": //Help menu
                    this.displayHelpMenu();
                    break;
                case "S": //save game
                    this.saveGame();
                    break;
                case "E": //exit game
                    return;
                default:
                    System.out.println("\n*** Invalid Selection ***");
                    break;
            }
                               
                    
        }              

    private void startNewGame() {
        //create a new game
        GameControl.createNewGame(Monopofast.getPlayer());
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void loadGame() {
        System.out.println("**** loadGame() function called ****");
    }

    private void displayHelpMenu() {
        System.out.println("**** displayHelpMenu() function called ****");
    }

    private void saveGame() {
        System.out.println("**** saveGame() function called ****");
    }

   
    
    }
    
