/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.view;

import cit260.lhcz.monopofast.control.ChallengeControl;
import java.util.Scanner;
import monopofast.Monopofast;

/**
 *@author Logan
 * 
 */
public class ChallengeMenuView{
    

    
    private final String MENU = "\n"
                + "\n----------------------------------------"
                + "\n| Challenge Menu                            |"
                + "\n----------------------------------------"
                + "\n1 - Challenge One"
                + "\n2 - Challenge Two"
                + "\n3 - Challenge Three"
                + "\nE - Exit"
                + "\n----------------------------------------";
   
    public void displayMenu() {
        char selection;
        
        do{
            System.out.println(MENU); //display the main menu
            String input = this.getInput();
            selection = input.charAt(0);
            this.doAction(selection);
            
            } while (selection != 'E' && selection != 'e');
    }
    
    public String getInput(){
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
    String selection = null;
    while (!valid){
        selection = keyboard.nextLine();
        selection = selection.trim();
        if(selection.length()<1) {
            System.out.println("\n*** Invalid selection *** Attempt again");
        }
        
        break;
        
    }
    return selection;
    }

    public void doAction(char choice) {
            
            switch(choice){
                case '1': //Challange 1
                    this.calcChallenge1();
                    break;
                                  
                case '2': //Challange 2
                    this.calcChallenge2();
                   break;
                case '3': //Challange 3
                    this.calcChallenge3();
                    break;
                case 'E': //exit game
                case 'e':  
                    return;
                default:
                    System.out.println("\n*** Invalid Selection ***");
                    break;
            }
    } 
                        private void calcChallenge1(){
                        // create a new game
                               int value = 1;
                                ChallengeOneView ChallengeOne = new ChallengeOneView();
                                ChallengeOne.displayMenu();
        if (value < 0){
                            System.out.println("ERROR- Failed to load new game");
                        }
                        }
                         private void calcChallenge2(){
                        
                            System.out.println("Save game");
                        }
                          private void calcChallenge3(){
{
                         System.out.println("help menu");
                        }
                         }
}
                         



