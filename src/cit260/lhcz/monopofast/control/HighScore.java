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
        public static void BubbleSort( double [ ] scores )
{
     int j;
     boolean flag = true;   // set flag to true to begin first pass
     int temp;   //holding variable

     while ( flag )
     {
            flag= false;    //set flag to false awaiting a possible swap
            for( j=0;  j < scores.length -1;  j++ )
            {
                   if ( scores[ j ] < scores[j+1] )   // change to > for ascending sort
                   {
                           temp = (int) scores[ j ];                //swap elements
                           scores[ j ] = scores[ j+1 ];
                           scores[ j+1 ] = temp;
                          flag = true;              //shows a swap occurred  
                  } 
            } 
      } 
} 

   
                   }


   