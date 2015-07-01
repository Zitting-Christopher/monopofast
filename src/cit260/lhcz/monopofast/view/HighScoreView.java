/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.view;
import cit260.lhcz.monopofast.control.HighScore;

/**
 *
 * @author Logan
 */

public class HighScoreView extends View {
    private static Object input;

   

    
    
public HighScoreView(){
    
    super("\n"
                + "\n----------------------------------------"
                + "\n| High Score                           |"
                + "\n----------------------------------------"
                + "\nD - Display High Score"
                + "\nS - Sort High Score"
                + "\nE - Exit"
                + "\n----------------------------------------");
}
    @Override
                   public boolean doAction(Object obj){
                       String value = (String) obj; 
                       value = value.toUpperCase(); // convert to upper case
                     switch(value){
                case "D": //Challange 1
                    HighScoreView.highScoreArray();
                    break;
                        case "S": {
                           double[] scores = null;
                           this.sort(scores);
                       }
                    break;                    
                case "E": //exit game
                   return true;
                default:
                    System.out.println("\n*** Invalid Selection ***");
                    break;
                     }
    return false;
    } 
                   public static void highScoreArray(){
                   HighScore highScore = new HighScore();
                         highScore.highScoreArray();
                   }
                     public static void sort(double[] scores) {
                    HighScore sort = new HighScore();
                         sort.BubbleSort(scores);
    }                
}


  
                   
