/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.view;

import cit260.lhcz.monopofast.model.Products;
import cit260.lhcz.monopofast.model.Character;
import cit260.lhcz.monopofast.model.Ingredients;
import cit260.lhcz.monopofast.model.Map;
import cit260.lhcz.monopofast.model.SubLevel;
import exception.GameControlException;
import java.io.IOException;
import java.util.EnumSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Christopher
 */
public class ReportMenuView extends View  {
EnumSet<SubLevel> subList;
    EnumSet<Ingredients> ingrList;
    EnumSet<Products> prodList;
    EnumSet<Character> charaList;
        String fileLoc;
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
                    try{
                    Character.saveCharReport(charaList,fileLoc);
                           } catch (GameControlException ex) {
                               Logger.getLogger(ReportMenuView.class.getName()).log(Level.SEVERE, null, ex);
                           } catch (IOException ex) {
                               Logger.getLogger(ReportMenuView.class.getName()).log(Level.SEVERE, null, ex);
                           }
                    break;
                    
                case "P": //Product Report
                     try {
                               Products.saveProdReport(prodList,fileLoc);
                           } catch (GameControlException ex) {
                               Logger.getLogger(ReportMenuView.class.getName()).log(Level.SEVERE, null, ex);
                           } catch (IOException ex) {
                               Logger.getLogger(ReportMenuView.class.getName()).log(Level.SEVERE, null, ex);
                           }
                    
                case "I": 
                          
                           try {
                               Ingredients.saveIngrReport(ingrList,fileLoc);
                           } catch (GameControlException ex) {
                               Logger.getLogger(ReportMenuView.class.getName()).log(Level.SEVERE, null, ex);
                           } catch (IOException ex) {
                               Logger.getLogger(ReportMenuView.class.getName()).log(Level.SEVERE, null, ex);
                           }
                       
                    break;
                 case "S": //SubLevel Report
                 
                     try {
                              SubLevel.saveSubleReport(subList,fileLoc);
                           } catch (GameControlException ex) {
                               Logger.getLogger(ReportMenuView.class.getName()).log(Level.SEVERE, null, ex);
                           } catch (IOException ex) {
                               Logger.getLogger(ReportMenuView.class.getName()).log(Level.SEVERE, null, ex);
                           }
                 
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
        Map.printMap();
        }catch(Exception ex){
            ErrorView.display("ReportMenuView", ex.getMessage());
        }
      
    }
    public void saveCharReport(EnumSet<Character> charaList, String fileLoc) {
          try{
              
         Character.saveCharReport(charaList,fileLoc);
          }catch(Exception ex){
            ErrorView.display("ReportMenuView", ex.getMessage());
        }
    
    }
    public void saveProdReport(EnumSet<Products> prodList, String fileLoc) {
         try{
        Products.saveProdReport(prodList, fileLoc);
             
        }catch(Exception ex){
            ErrorView.display("ReportMenuView", ex.getMessage());
        }
    }
    

private void saveSubleReport(EnumSet<SubLevel> subList, String fileLoc) {
        try{
        SubLevel.saveSubleReport(subList, fileLoc);
        }catch(Exception ex){
            ErrorView.display("ReportMenuView", ex.getMessage());
        }
      
    }
     public void saveIngrReport(EnumSet<Ingredients> ingrList, String fileLoc) {
          try{
         Ingredients.saveIngrReport(ingrList, fileLoc);
          }catch(Exception ex){
            ErrorView.display("ReportMenuView", ex.getMessage());
        }
    }

}
