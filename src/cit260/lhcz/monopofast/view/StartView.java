/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.view;
import java.util.Scanner;

/**
 *
 * @author Christopher
 */
public class StartView {
    public StartView(){
    
    }
    
    public void startProgram() {
        //Display the banner screen
        this.displayBanner();
        
        //Prompt the user to press S for Start
        
        //Prompt the Player for their name
        
        //Create and save the player
        
        //Display a personalized welcome message
        
        //Display the Main Menu.
    }
    
    
    public void displayBanner(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n*****************************************************************************************");
        System.out.println("Hi! Welcome to Monopofast - the fast food game of corporate domination!\n"
                    + "Monopofast is a quick-paced game and its objective is to monopolize the major fast food\n"
                    + "joints in the US. To do this, you must work your way through the ranks ensuring that you are\n"
                    + "faster than the owner of each joint at making their food. You'll start as a lowly fry-dipper and\n"
                    + "work your way up to completing the most difficult sandwiches in record time. \n"
                    + "After conquering one fast food joint, you will move on to the next, starting \n"
                    + "at the bottom each time. Restaurants included in the game are: McDumbledore’s,\n"
                    + "Venti’s, Ardy’s, Karl’s Sr., Jack and the Fox, and Queen Burger.\n");
        System.out.println("\n*****************************************************************************************"
                    + "\n\n Please press S to get started!");
            
            
            }
}
