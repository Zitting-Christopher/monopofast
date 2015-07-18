/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.view;

import cit260.lhcz.monopofast.control.*;
import cit260.lhcz.monopofast.model.*;
import monopofast.Monopofast;

/**
 * @author Logan
 *
 */
public class GameMenuView extends View {

    public GameMenuView() {

        super("\n"
                + "\n----------------------------------------"
                + "\n| Game Menu                            |"
                + "\n----------------------------------------"
                + "\nC - Continue Game"
                + "\nF - Challange Menu"
                + "\nM - View Map"
                + "\nS - Save Game"
                + "\nE - Exit"
                + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase(); // convert to upper case
        switch (value) {
            case "C": //create and start a new game
                this.ContinueGame();
                break;

            case "F": //Challange menu
                this.challangeMenu();
                break;
            case "H": //Challange menu
                this.displayHelpMenu();
                break;
            case "M": //View Map
                this.viewMap();
                break;
            
            case "S": //save game
                this.saveGame();
                break;

            case "E": //exit game
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid Selection ***");
                break;
        }
        return false;
    }

    private void ContinueGame() {
        // create a new game
        this.console.println("create new game stub");
    }

    private void saveGame() {
        this.console.println("\n\n Please enter the file path where you would like this game to be saved.");
        String filePath = this.getInput();

        try {
            GameControl.saveGame(Monopofast.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    private void displayHelpMenu() {

        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

    private void challangeMenu() {
        {
        }
        ChallengeMenuView challengeMenu = new ChallengeMenuView();
        challengeMenu.display();
    }

   private void viewMap() {

        Location[][] locations = Monopofast.getCurrentGame().getMap().getLocations();

        this.console.println("\n***** Pizza Village ******");
        this.console.println("   |  0 |  1 |  2 |  3 |  4 |  5 | 6 |");

        for (int i = 0; i < locations[0].length; i++) {
            this.console.println("\n----------------------------------");
            this.console.format("%2d", i);
            for (int j = 0; j < locations[0].length; j++) {
                this.console.print(" | ");
                this.console.print(locations[i][j].getScene().getSymbol());

            }
            this.console.print(" | ");
        }
        this.console.println("\n----------------------------------");

        Map map = new Map();
        MapControl.printScene();
    }

   
}