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
           
            case "F": //Challange menu
                this.challengeMenuView();
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

  

    private void viewMap() {

        Location[][] locations = Monopofast.getCurrentGame().getMap().getLocations();

        this.console.println("\n***** Pizza Village ******");
        this.console.println("   |  0 |  1 |  2 |  3 |  4 |  5 | 6 |");

         for (int i = 0; i < locations[0].length; i++) {
            this.console.println("\n----------------------------------");
            this.console.format("%2d", i);
            for (int j = 0; j < locations[0].length; j++) {
                this.console.print(" | ");
                this.console.print(locations[i][j].getScene().getMapSymbol());

            }
            this.console.print(" | ");
        }
        this.console.println("\n----------------------------------");

        MapView mapView = new MapView();
        mapView.display();
    }

   
    private void saveGame() {
        this.console.println("\n\n Please enter the file path where you would like this game to be saved.");
        String filePath = "SavedGames/" + this.getInput();

        try {
            GameControl.saveGame(Monopofast.getCurrentGame(), filePath);
            this.console.println("Game saved successfully!");
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    private void displayHelpMenu() {

        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

    private void challengeMenuView() {

         ChallengeMenuView challengeMenuView = new ChallengeMenuView();
        challengeMenuView.display();
    }

    

}