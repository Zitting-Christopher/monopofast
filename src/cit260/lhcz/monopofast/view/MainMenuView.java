/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.view;

import cit260.lhcz.monopofast.control.GameControl;
import monopofast.Monopofast;

/**
 *@author Logan
 * 
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
                    @Override
                   public boolean doAction(Object obj){
                       String value = (String) obj; 
                       value = value.toUpperCase(); // convert to upper case
                     switch(value){
                case "G": //create and start a new game
               
                    this.startNewGame();
                    break;
                case "L": //Load a saved game
                
                    this.loadGame();
                    break;
                case "H": //Help menu
               
                    HelpMenuView helpMenu = new HelpMenuView();
                   helpMenu.displayMenu();
                    break;
                case "S": //save game
                
                    this.saveGame();
                    break;
                case "E": //exit game
             
                    return true;
                default:
                    System.out.println("\n*** Invalid Selection ***");
                    break;
                     }
    return false;
        }   
                   private void startNewGame(){
                        // create a new game
                         GameControl.createNewGame(Monopofast.getPlayer());
                        int value = 1;
                         if (value < 0){
                            System.out.println("ERROR- Failed to create new game");
                        }
                         GameMenuView gameMenu = new GameMenuView();
                         gameMenu.displayMenu();
                    }
                                 

                                 
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