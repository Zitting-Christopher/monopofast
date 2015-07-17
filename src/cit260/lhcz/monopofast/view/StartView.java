/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.view;

import cit260.lhcz.monopofast.control.*;
import cit260.lhcz.monopofast.model.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import monopofast.Monopofast;

/**
 *
 * @author Christopher
 */
public class StartView {

    protected final BufferedReader keyboard = Monopofast.getInFile();
    protected final PrintWriter console = Monopofast.getOutFile();

    private static void display() {

    }

    public StartView(String[] args) {
        StartProgramView startProgramView = StartProgramView();
        try {
            startProgramView.display();
        } catch (Throwable te) {
            this.console.println(te.getMessage());
            te.printStackTrace();
            StartView.display();
        }
    }

    public StartView() {

    }

    public void startProgram() throws IOException {
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

    private String getPlayerName() throws IOException {
        boolean valid = false; //indicates if the name has been retrieved
        String playerName = null;

        while (!valid) {
            //prompt player for name
            this.console.println("Enter the player's name below:");

            //get the name from the keyboard and trim the blanks
            playerName = this.keyboard.readLine();
            playerName = playerName.trim();

            //if name is invalid (less than two character in length)
            if (playerName.length() < 2) {
                ErrorView.display(this.getClass().getName(), "Invalid name - the name must not be blank");
                continue; // and repeat again
            }
            break; // out of the (exit) the repition
        }
        return playerName; //returns the player name 
    }

    public void displayWelcomeMessage(Player player) {
        this.console.println("\n\n================================================="
                + "\n\tWelcome to Monopofast, " + player.getPlayerName() + "!");
        this.console.println("\tWe hope you enjoy our game!"
                + "\n=================================================");

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
