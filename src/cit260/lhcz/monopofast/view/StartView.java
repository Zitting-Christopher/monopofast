/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.view;
import cit260.lhcz.monopofast.control.GameControl;
import cit260.lhcz.monopofast.model.Game;
import cit260.lhcz.monopofast.model.Player;
import java.util.Scanner;

/**
 *
 * @author Christopher
 */
public class StartView {
    private static Game currentGame = null;
    private static Player player = null;

    private static void display() {
        
    }
    public StartView(String[] args){
        StartProgramView startProgramView = StartProgramView();
        try{
            startProgramView.display();
        }catch(Throwable te){
            System.out.println(te.getMessage());
            te.printStackTrace();
            StartView.display();
        }
        return;
        }

    public StartView() {
        
    }
    
    
    public void startProgram() {
        //Display the banner screen
        this.displayBanner();
        
        //Prompt the user to press S for Start
        String playerName = this.getPlayerName();
        
        //Create and save the player object
        Player player = GameControl.createPlayer(playerName);
        
        //Create a personalized welcome message
        this.displayWelcomeMessage(player);
        
        //Display the Main Menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }
    
    
    public void displayBanner(){
        
           System.out.println("                                                 MONOPOFAST                                            "
                +           "\n***************************************************************************************************");
        System.out.println("         Hi! Welcome to Monopofast - the fast food game of corporate domination!\n"
                    + "Monopofast is a quick-paced game and its objective is to monopolize the major fast food\n"
                    + "joints in the US. To do this, you must work your way through the ranks ensuring that you are\n"
                    + "faster than the owner of each joint at making their food. You'll start as a lowly fry-dipper and\n"
                    + "work your way up to completing the most difficult sandwiches in record time. \n"
                    + "After conquering one fast food joint, you will move on to the next, starting \n"
                    + " at the bottom each time. Restaurants included in the game are: McDumbledore’s,\n"
                    + "Venti’s, Ardy’s, Karl’s Sr., Jack and the Fox, and Queen Burger.\n"
                    + "                                                   (\\__/)\n" 
                    + "                                                   (>'.'<)\n"
                    + "                                                   (\")_(\")\n");
        System.out.println("***************************************************************************************************");
            
            
            }

    private String getPlayerName() {
        boolean valid = false; //indicates if the name has been retrieved
        String playerName = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input
        
        while(!valid) {
            //prompt player for name
            System.out.println("Enter the player's name below:");
            
            //get the name from the keyboard and trim the blanks
            playerName = keyboard.nextLine();
            playerName = playerName.trim();
            
            //if name is invalid (less than two character in length)
            if (playerName.length() < 2) {
                System.out.println("Invalid name - the name must not be blank");
                continue; // and repeat again
            }            
            break; // out of the (exit) the repition
        }
        return playerName; //returns the player name 
    }

    public void displayWelcomeMessage(Player player) {
        System.out.println("\n\n================================================="
                         + "\n\tWelcome to Monopofast, " + player.getPlayerName() + "!");
        System.out.println("\tWe hope you enjoy our game!"
                + "\n=================================================") ;
    
    
    }

    private StartProgramView StartProgramView() {
        return null;
        
    }

    private static class StartProgramView {

        public StartProgramView() {
        }

        private void display() {
            
        }
    }

}
