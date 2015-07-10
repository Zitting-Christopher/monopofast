/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.view;

import cit260.lhcz.monopofast.control.GameControl;
import cit260.lhcz.monopofast.model.Player;
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
                + "\nT - View Top Scores"
                + "\nL - Load Game"
                + "\nB - Bio page"
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
                
                    this.StartSavedGame();
                    break;
                case "H": //Help menu
               
                    this.HelpMenuView();
                   
                    break;
                     case "B": //Help menu
               
                    this.StoreBioMenuView();
                   
                    break;
                case "S": //save game
                
                    this.saveGame();
                    break;
                    case "T": //save game
                
                    this.highScore();
                    break;
                case "E": //exit game
             
                    return true;
                default:
                    ErrorView.display(this.getClass().getName(),"\n*** Invalid Selection ***");
                    break;
                     }
    return false;
        }   
                   private void startNewGame(){
                        // create a new game
                                          
                         this.StartSavedGame();                    }
                                 

                                 
                   private void StartSavedGame(){
                        // create a new game
                        System.out.println("\n\nEnter the file path for file where the game "
                        + "is to be saved.");
                        String filePath = this.getInput();
                         try {
                            // save the game to the speciried file                        }
                                GameControl.getSaveGame(filePath);
                        }catch (Exception ex) {
                            ErrorView.display("MainMenuView", ex.getMessage());
                        }
                        
                    }
                    private void saveGame(){
                        // create a new game
                        //prompt for and get the name of the file to save the game in
                        System.out.println("\n\nEnter the file path for file where the game "
                        + "is to be saved.");
                        String filePath = this.getInput();
                        try {
                            // save the game to the speciried file                        }
                                GameControl.saveGame(Monopofast.getCurrentGame(), filePath);
                        }catch (Exception ex) {
                            ErrorView.display("MainMenuView", ex.getMessage());
                        }
                    }
                        private void HelpMenuView(){
                       HelpMenuView helpMenu = new HelpMenuView();
                   helpMenu.display(); 
                        }
                           private void highScore(){
                        
                            HighScoreView highScore = new HighScoreView();
                         highScore.display();
                        }
                       private void StoreBioMenuView(){
                        
                            StoreBioMenuView StoreBioMenu = new StoreBioMenuView();
                         StoreBioMenu.display();
                        }     
                         
                    }

