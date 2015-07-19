/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.view;

import cit260.lhcz.monopofast.control.*;
import cit260.lhcz.monopofast.model.*;
import exception.GameControlException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import monopofast.Monopofast;
/**
 *
 * @author Christopher
 */
public class StartView{
    
    protected final BufferedReader keyboard = Monopofast.getInFile();
    protected final PrintWriter console = Monopofast.getOutFile();

    public void startProgram() throws GameControlException {

        //Display the banner scren
        this.displayBanner();
        //Get player's name
        String name = this.getName();
        //Create a new player
        Player player = GameControl.createPlayer(name);
        Monopofast.setPlayer(player);
        //DISPLAY a customized welcome message
        this.displayWelcomeMessage(player);
        //DISPLAY main menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();

    }

    

    public void displayBanner() {

        this.console.println("                                                 MONOPOFAST                                            "
                + "\n***************************************************************************************************");
        this.console.println("         Hi! Welcome to Monopofast - the fast food game of corporate domination!\n"
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
        this.console.println("***************************************************************************************************");

    }

    private String getName() throws GameControlException {
        boolean valid = false;
        String playersName = null;

        while (!valid) {

            this.console.println("Enter your name");

            try {
                playersName = this.keyboard.readLine();
            } catch (IOException ex) {
               System.out.println("I/O Error: " + ex.getMessage());
            }
            playersName = playersName.trim();

            if (playersName.length() < 2) {
                try {
                    GameControl.createPlayer(playersName);
                } catch (GameControlException pe) {
                    this.console.println(pe.getMessage());
                }
                continue;
            }
            break;
        }

        return playersName;
    }
    
  

      public void displayWelcomeMessage(Player player) {
        this.console.println("\n\n================================================="
                + "\n\tWelcome to Monopofast, " + player.getName() + "!");
        this.console.println("\tWe hope you enjoy our game!"
                + "\n=================================================");


    }

}
   
   
