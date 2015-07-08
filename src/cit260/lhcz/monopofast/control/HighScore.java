/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.control;

import java.io.BufferedReader;
import java.io.PrintWriter;
import monopofast.Monopofast;

 
/**
 *
 * @author Logan
 *
 */
public class HighScore {
    
    protected final BufferedReader keyboard = Monopofast.getInFile();
    protected final PrintWriter console = Monopofast.getOutFile();
    
         public static void highScoreArray(){
                   final int MAX = 5;
                   int[] scores = {12346, 12344, 12343, 12342, 12341};
                   String[] names = {"\nPlayer 1.","\nPlayer 2.","\nPlayer 3.","\nPlayer 4.","\nPlayer 5."};
      for(int i=0; i<scores.length; i++)
        {
            for(int j=i + 1; j<scores.length; j++)
            {
                if(scores[i] < scores[j])
                {
                    int temp = scores[i];
                    scores[i] = scores[j];
                    scores[j] = temp;
                }
            }

        }
                   this.console.println("                  High Scores"
                   +"\n**************************************************");
                   for(int ctr=0;ctr<scores.length;ctr++)
                       {
                           this.console.println( names[ctr]+ " " +  scores[ctr]);
                                   
                   }
         }

   
        
    
    }


   

 

   
                   


   