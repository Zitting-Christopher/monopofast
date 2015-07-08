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
                
                    this.loadGame();
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
                         GameControl.createNewGame(Monopofast.getPlayer());
                        
                         GameMenuView gameMenu = new GameMenuView();
                         gameMenu.display();
                    }
                                 

                                 
                   private void loadGame(){
                        // create a new game
                        int value = 0;
                                GameControl.loadGame(Monopofast.getCurrentGame());
                        if (value < 0){
                            ErrorView.display(this.getClass().getName(),"ERROR- Failed to load new game");
                        }
                        
                    }
                    private void saveGame(){
                        // create a new game
                        int value = 0;
                                GameControl.saveGame(Monopofast.getCurrentGame());
                        if (value < 0){
                            ErrorView.display(this.getClass().getName(),"ERROR- Failed to load new game");
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

