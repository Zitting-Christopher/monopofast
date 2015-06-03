/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.view;
import java.util.Scanner;

/**
 *
 * @author Christopher
 */
public class StartView {
    
    public void StartGame(){
        Scanner sc = new Scanner(System.in);    
        String banner = "Hi! Welcome to Monopofast - the fast food game of corporate domination!\n"
                    + "Monopofast is a quick-paced game and its objective is to monopolize the major fast food"
                    + "joints in the US. To do this, you must work your way through the ranks ensuring that you are"
                    + "faster than the owner of each joint at making their food. You'll start as a lowly fry-dipper and"
                    + "work your way up to completing the most difficult sandwiches in record time. "
                    + "After conquering one fast food joint, you will move on to the next, starting"
                    + "at the bottom each time. Restaurants included in the game are: McDumbledore’s,"
                    + "Venti’s, Ardy’s, Karl’s Sr., Jack and the Fox, and Queen Burger.\n"
                    + "Please press S to get started!";
            System.out.println(banner);
            
            
            
            
}
