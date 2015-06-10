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
        char selection =' ';
        
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
                case 'N': //create and start a new game
                    this.startNewGame();
                    break;
                case 'L': //Load a saved game
                    this.loadGame();
//                    break;
//                case 'H': //Help menu
//                    this.displayHelpMenu();
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
                    private void startNewGame(){
                        // create a new game
                         GameControl.createNewGame(Monopofast.getPlayer());
                        int value = 0;
                         if (value < 0){
                            System.out.println("ERROR- Failed to create new game");
                        }
                    }
                                 
//                   /* private void displayHelpMenu(){
//                        // create a new game
//                        int value = GameControl.createNewGame(Monopofast.getPlayer());
//                        if (value < 0){
//                            System.out.println("ERROR- Failed to create new game");
//                        }
//                    }*/
                                 
                   private void loadGame(){
                        // create a new game
                        int value = 0;
                                GameControl.createNewGame(Monopofast.getCurrentGame());
                        if (value < 0){
                            System.out.println("ERROR- Failed to load new game");
                        }
                        
                    }
                    private void saveGame(){
                        // create a new game
                        int value = 0;
                                GameControl.createNewGame(Monopofast.getCurrentGame());
                        if (value < 0){
                            System.out.println("ERROR- Failed to load new game");
                        }
                        
                    }
        }   



























//   public void displayMenu() {
//        String selection = "";
////        char selection = ' ';
//        do{
//            
//          System.out.println(MENU); //display the main menu
//             Scanner keyboard = new Scanner(System.in); //keyboard input
//             selection = keyboard.nextLine();
//            String input = "S"; //get the user's selection
//           
//     
//        
////            selection = input.charAt(selection); //get first char of string
////            
////            this.doAction(selection); //do action based on selection
////                   
//           } while (selection != "E"); //selection not Exit
//    }
//        
//               
//
//    private void startNewGame() {
//        //create a new game
//        GameControl.createNewGame();
//        
//        //display the game menu
//        GameMenuView gameMenu = new GameMenuView();
//        gameMenu.displayMenu();
//    }
//
//    private void loadGame() {
//        System.out.println("**** loadGame() function called ****");
//    }
//
//    private void displayHelpMenu() {
//        System.out.println("**** displayHelpMenu() function called ****");
//    }
//
//    private void saveGame() {
//        System.out.println("**** saveGame() function called ****");
//    }
//
//   
//    
//    }
//    
