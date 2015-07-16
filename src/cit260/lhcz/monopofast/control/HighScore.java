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
    
         public static int[] highScoreArray(int[] scores){

    
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
        return scores;
                     
         }

   

   
    }


   

 

   
                   


   