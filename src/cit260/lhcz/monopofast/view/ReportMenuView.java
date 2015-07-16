/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.view;

import cit260.lhcz.monopofast.control.MapControl;
import cit260.lhcz.monopofast.model.Products;
import cit260.lhcz.monopofast.model.Character;
import cit260.lhcz.monopofast.model.Ingredients;
import cit260.lhcz.monopofast.model.SubLevel;
import exception.GameControlException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumSet;

/**
 *
 * @author Christopher
 */
public class ReportMenuView extends View  {

    
        
     public ReportMenuView(){
                  super("\n"
                + "\n----------------------------------------"
                + "\n| Report Menu                            |"
                + "\n----------------------------------------"
                + "\nC - Save Character Report"
                + "\nI - Save Ingredient Report"
                + "\nM - Save Location Report"
                + "\nP - Save Product Report"
                + "\nS - Save SubLevel Report"
                + "\nE - Exit"
                + "\n----------------------------------------");
                       }
     
     
                    @Override
                   public boolean doAction(Object obj){
                       String value = (String) obj; 
                       value = value.toUpperCase(); // convert to upper case
                     switch(value){
                
                case "C": //Character Report
                    this.saveCharacterReport();
                    break;
                    
                case "P": //Product Report
                    this.saveProductReport();
                    break;
                    
                case "I": //Ingredient Report
                    Ingredients.saveIngrReport();
                    break;
                 case "S": //SubLevel Report
                    this.saveSubleReport();
                    break;
                 case "M": //Location Report
                    this.printMap();
                    break;
                case "E": //exit game
                    return true;
                    
                default:
                    ErrorView.display(this.getClass().getName(),"\n*** Invalid Selection ***");
                    break;
                     }
    return false;
    
}

    private void printMap() {
        try{
        MapControl.printMap();
        }catch(Exception ex){
            ErrorView.display("ReportMenuView", ex.getMessage());
        }
      
    }
    private void saveCharacterReport() {
        try{
        Character.saveCharacterReport();
        }catch(Exception ex){
            ErrorView.display("ReportMenuView", ex.getMessage());
        }
      
    }private void saveProductReport() {
        try{
        Products.saveProductReport();
        }catch(Exception ex){
            ErrorView.display("ReportMenuView", ex.getMessage());
        }
      
    }private void saveSubleReport() {
        try{
        SubLevel.saveSubleReport();
        }catch(Exception ex){
            ErrorView.display("ReportMenuView", ex.getMessage());
        }
      
    }
     public void saveIngrReport(ArrayList<Ingredients> ingrList, String fileLoc) {
         Ingredients.saveIngrReport(ingrList, fileLoc);
          
    }

}
