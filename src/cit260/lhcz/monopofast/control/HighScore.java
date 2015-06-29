/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.control;

 
/**
 *
 * @author Logan
 * temp code
 */
public class HighScore {
     
    private int highScore[];
    private int length;
 
    public void sort(int[] inputArr) {
         
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.highScore = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }
 
    private void quickSort(int lowerScore, int higherScore) {
         
        int l = lowerScore;
        int h = higherScore;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = highScore[lowerScore+(higherScore-lowerScore)/2];
        // Divide into two arrays
        while (l <= h) {
            
            while (highScore[l] < pivot) {
                l++;
            }
            while (highScore[h] > pivot) {
                h--;
            }
            if (l <= h) {
                exchangeNumbers(l, h);
                //move index to next position on both sides
                l++;
                h--;
            }
        }
        // call quickSort() method recursively
        if (lowerScore < h)
            quickSort(lowerScore, h);
        if (l < higherScore)
            quickSort(l, higherScore);
    }
 
    private void exchangeNumbers(int l, int h) {
        int temp = highScore[l];
        highScore[l] = highScore[h];
        highScore[h] = temp;
    }
     
    public static void main(String a[]){
         
        HighScore  sorter = new HighScore ();
        int[] input = {24,2,45,20,56,75,2,56,99,53,12};
        sorter.sort(input);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
