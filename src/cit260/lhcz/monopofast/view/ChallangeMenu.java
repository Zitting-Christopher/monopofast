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
public class ChallangeMenu {
    

    
    private final String MENU = "\n"
                + "\n----------------------------------------"
                + "\n| Challange Menu                            |"
                + "\n----------------------------------------"
                + "\n1 - Continue Game"
                + "\n2 - Challange Menu"
                + "\n3 - Save Game"
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
                    return;
                default:
                    System.out.println("\n*** Invalid Selection ***");
                    break;
            }
    } 
                        private void calcChallenge1(){
                        // create a new game
                               System.out.println("create new game stub");
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
                         



