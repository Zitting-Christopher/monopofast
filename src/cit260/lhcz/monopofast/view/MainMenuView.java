/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.view;

import cit260.lhcz.monopofast.control.GameControl;
import cit260.lhcz.monopofast.view.GameMenuView;
import cit260.lhcz.monopofast.view.HelpMenuView;
import java.util.Scanner;
import monopofast.Monopofast;

/**
 *@author Logan
 * @author Christopher
 */
public class MainMenuView extends View{

                   public MainMenuView(){
                  super("\n"
                + "\n----------------------------------------"
                + "\n| Main Menu                            |"
                + "\n----------------------------------------"
                + "\nG - Start Game"
                + "\nH - Get Help"
                + "\nS - Save Game"
                + "\nL - Load Game"
                + "\nE - Exit"
                + "\n----------------------------------------");
                       }
                   public boolean doAction(Object obj){
                       return false;
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
