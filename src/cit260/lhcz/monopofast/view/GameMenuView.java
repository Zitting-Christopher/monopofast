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
 * 
 */
public class GameMenuView extends View {
    
public GameMenuView(){
    
    super("\n"
                + "\n----------------------------------------"
                + "\n| Game Menu                            |"
                + "\n----------------------------------------"
                + "\nC - Continue Game"
                + "\nF - Challange Menu"
                + "\nM - View Map"
                + "\nS - Save Game"
                + "\nH - View High Score"
                + "\nE - Exit"
                + "\n----------------------------------------");
}
    @Override
                   public boolean doAction(Object obj){
                       String value = (String) obj; 
                       value = value.toUpperCase(); // convert to upper case
                     switch(value){
                case "C": //create and start a new game
                    this.ContinueGame();
                    break;
                    
               case "F": //Challange menu
                    this.challangeMenu();
                   break;
                    
                case "M": //View Map
                    this.viewMap();
                 break;
                    case "H": //View Map
                    this.highScore();
                        
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
                        private void ContinueGame(){
                        // create a new game
                               System.out.println("create new game stub");
                        }
                         private void saveGame(){
                        
                            System.out.println("Save game");
                        }
                          private void challangeMenu(){
{
                          }
                         ChallengeMenuView challengeMenu = new ChallengeMenuView();
                         challengeMenu.display();
                    }

                        private void viewMap() {
                        MapMenuView map = new MapMenuView();
                        map.display();
                        }
                        private void highScore(){
                        
                            HighScoreView highScore = new HighScoreView();
                         highScore.display();
                        }
                         
                        }
                         

                         


