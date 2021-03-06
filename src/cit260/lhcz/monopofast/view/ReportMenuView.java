/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.view;

import cit260.lhcz.monopofast.model.*;
import cit260.lhcz.monopofast.model.Character;
import cit260.lhcz.monopofast.model.Ingredients;
import exception.*;
import java.io.IOException;
import java.util.EnumSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Christopher
 */
public class ReportMenuView extends View {

    
    EnumSet<Ingredients> ingrList;
    EnumSet<Products> prodList;
    EnumSet<Character> charaList;
    String fileLoc;

    public ReportMenuView() {
        super("\n"
                + "\n----------------------------------------"
                + "\n| Report Menu                            |"
                + "\n----------------------------------------"
                + "\nC - Save Character Report"
                + "\nI - Save Ingredient Report"
                + "\nP - Save Product Report"
                + "\nE - Exit"
                + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase(); // convert to upper case
        switch (value) {

            case "C": //Character Report
                try {
                    Character.saveCharReport(charaList, fileLoc);
                    System.out.println("Report saved successfully");
                } catch (GameControlException | IOException ex) {
                    Logger.getLogger(ReportMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;

            case "P": //Product Report
                try {
                    Products.saveProdReport(prodList, fileLoc);
                            System.out.println("Report saved successfully");
                } catch (GameControlException | IOException ex) {
                    Logger.getLogger(ReportMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }

            case "I":

                try {
                    Ingredients.saveIngrReport(ingrList, fileLoc);
                    System.out.println("Report saved successfully");
                } catch (GameControlException | IOException ex) {
                    Logger.getLogger(ReportMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }

                break;
            
            case "E": //exit game
                return true;

            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid Selection ***");
                break;
        }
        return false;

    }

}
