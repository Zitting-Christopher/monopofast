/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.view;

import cit260.lhcz.monopofast.control.GameControl;
import cit260.lhcz.monopofast.control.MapControl;
import cit260.lhcz.monopofast.model.Products;
import cit260.lhcz.monopofast.model.Character;
import cit260.lhcz.monopofast.model.Ingredients;
import cit260.lhcz.monopofast.model.Map;
import cit260.lhcz.monopofast.model.SubLevel;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

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
                + "\nP - Save Product Report"
                + "\nI - Save Ingredient Report"
                + "\nE - Exit"
                + "\n----------------------------------------");
                       }
                    @Override
                   public boolean doAction(Object obj){
                       String value = (String) obj; 
                       value = value.toUpperCase(); // convert to upper case
                     switch(value){
                
//                case "C": //Character Report
//                    this.saveCharacterReport();
//                    break;
//                    
//                case "P": //Product Report
//                    this.saveProductReport();
//                    break;
//                    
//                case "I": //Ingredient Report
//                    this.saveIngrReport();
//                    break;
//                 case "S": //SubLevel Report
//                    this.saveSubleReport();
//                    break;
                     case "P": //Location Report
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

//    public void saveCharacterReport() {
//            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
//            String filePath = "CharacterReport - ";
//            String extension = ".txt";
//                        try {
//                            // save the game to the specified file                        }
//                                GameControl.saveCharacterReport(java.util.Arrays.asList(Character.values()), filePath + dateFormat + extension);
//                        }catch (Exception ex) {
//                            ErrorView.display("ReportMenuView", ex.getMessage());
//                        }
//    }
//
//    public void saveProductReport() {
//            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");    
//            String filePath = "ProductReport - ";
//            String extension = ".txt";
//                        try {
//                            // save the game to the specified file                        }
//                                GameControl.saveProductReport(java.util.Arrays.asList(Products.values()), filePath + dateFormat + extension);
//                        }catch (Exception ex) {
//                            ErrorView.display("ReportMenuView", ex.getMessage());
//                        }
//    }
//
//    public void saveIngrReport() {
//            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
//            String filePath = "IngrReport - ";
//            String extension = ".txt";
//                        try {
//                            // save the game to the specified file                        }
//                                GameControl.saveIngrReport(java.util.Arrays.asList(Ingredients.values()), filePath + dateFormat + extension);
//                        }catch (Exception ex) {
//                            ErrorView.display("ReportMenuView", ex.getMessage());
//                        }
//    }
//     public static PrintWriter saveLocReport() {
//            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
//            String filePath = "C:\\LocReport.txt";
//            String extension = ".txt";
//                        try {
//                            // save the game to the specified file                        }
//                                GameControl.saveLocReport(java.util.Arrays.asList(Map.values()), filePath);
//                        }catch (Exception ex) {
//                            ErrorView.display("ReportMenuView", ex.getMessage());
//                        }
//         return null;
//     }
    private void printMap() {
        try{
        MapControl.printMap();
        }catch(Exception ex){
            ErrorView.display("ReportMenuView", ex.getMessage());
        }
      
    }
}
