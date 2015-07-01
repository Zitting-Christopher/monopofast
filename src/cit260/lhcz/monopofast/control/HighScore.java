/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.control;

 
/**
 *
 * @author Logan
 *
 */
public class HighScore {
    
         public static void highScoreArray(){
                   final int MAX = 5;
                   double[] scores = {12345, 12344, 12343, 12342, 12341};
                   String[] names = {"\nPlayer 1.","\nPlayer 2.","\nPlayer 3.","\nPlayer 4.","\nPlayer 5."};
     
                   System.out.print("                  High Scores"
                   +"\n**************************************************");
                   for(int ctr=0;ctr<scores.length;ctr++)
                       {
                           System.out.print( names[ctr]+ " " +  scores[ctr]);
                                   
                   }
        
                   }
}

   