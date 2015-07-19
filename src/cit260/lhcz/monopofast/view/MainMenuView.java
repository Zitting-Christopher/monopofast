/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.view;

import cit260.lhcz.monopofast.control.*;
import cit260.lhcz.monopofast.model.*;
import exception.MapControlException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import monopofast.Monopofast;

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
            case "G":                  
                this.startNewGame();
        
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

                      
            case "E": //exit game

                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid Selection ***");
                break;
        }
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(Monopofast.getPlayer());

        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

    private void LoadGame() {
        this.console.println("\n\nEnter the file path where the game is saved.");
        
        String filePath = this.getInput();
        
        try{
            GameControl.loadGame(filePath);
        }
        
        catch(Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
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
   
    
   

    
    
