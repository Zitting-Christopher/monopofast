/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.view;

import cit260.lhcz.monopofast.control.GameControl;
import cit260.lhcz.monopofast.model.Player;
import exception.MapControlException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Logan
 *
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
                + "\n----------------------------------------"
                + "\n| Main Menu                            |"
                + "\n----------------------------------------"
                + "\nG - Start Game"
                + "\nH - Get Help"
                + "\nS - Save Game"
                + "\nL - Load Game"
                + "\nR - Reports"
                + "\nB - Bio page"
                + "\nE - Exit"
                + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase(); // convert to upper case
        switch (value) {
            case "G": {
            try {
                //create and start a new game
                
                this.startNewGame();
            } catch (MapControlException ex) {
                Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case "L": //Load a saved game

                this.LoadGame();
                break;
            case "H": //Help menu

                this.HelpMenuView();

                break;
            case "B": //Help menu

                this.StoreBioMenuView();

                break;

            case "R": //Help menu

                this.ReportMenuView();

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

    private void startNewGame() throws MapControlException {
        // create a new game
Player player = null;
        GameControl.createNewGame(player);
    }

    private void LoadGame() {
        // create a new game
        System.out.println("\n\nEnter the file path for file where the game "
                + "was saved.");
        String filePath = this.getInput();
        try {
            // save the game to the speciried file                        }
            GameControl.loadGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }

    }

    private void saveGame() {
        // create a new game
        //prompt for and get the name of the file to save the game in
        System.out.println("\n\nEnter the file path for file where the game "
                + "is to be saved.");
        String filePath = this.getInput();
        PrintWriter out = null;
        try {
            out = new PrintWriter(filePath);
            
            // save the game to the specified file                        }
//            GameControl.saveGame(Monopofast.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    private void HelpMenuView() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    
    private void StoreBioMenuView() {

        StoreBioMenuView StoreBioMenu = new StoreBioMenuView();
        StoreBioMenu.display();
    }

    private void ReportMenuView() {
        ReportMenuView ReportMenu = new ReportMenuView();
        ReportMenu.display();
    }

    
}
