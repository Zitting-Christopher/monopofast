/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.view;


import cit260.lhcz.monopofast.control.GameControl;
import java.util.Scanner;
import monopofast.Monopofast;

/**
 *
 * @author Christopher
 */
public class MapView {
    
    private final String MENU = "\n"
                + "\n---------------------------------------"
                + "\n| Map Menu                            |"
                + "\n---------------------------------------"
                + "\n1 - World 1"
                + "\n2 - World 2"
                + "\n3 - World 3"
                + "\n4 - World 4"
                + "\n5 - World 5"
                + "\nA - View All Worlds"
                + "\nR - Return to Previous Menu"
                + "\n---------------------------------------";
    
    public void displayMenu() {
        char selection;
        
        do{
            System.out.println(MENU); //display the main menu
            String input = this.getInput();
            selection = input.charAt(0);
            this.doAction(selection);
            
            } while (selection != 'R' && selection != 'r');
    
    
}
    public String getInput(){
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
    String selection = null;
    while (!valid){
        selection = keyboard.nextLine();
        selection = selection.trim();
        if(selection.length()<1) {
            System.out.println("\n*** Invalid selection *** Try again");
        }
        
        break;
        
    }
    return selection;
    }

    public void doAction(char choice) {
        int playerLevel = 1;
            
            switch(choice){
                case '1': //World 1 Map 
                   String output1 = "You chose level 1!";
                   System.out.println(output1);
                    break;
                    
                case '2': //World 2 Map
                    if (playerLevel < 2)
                    {
                        String output2 = "ACCESS DENIED.";
                        System.out.println(output2);
                    }
                    else
                    {
                        String output2 = "You chose level 2!";
                        System.out.println(output2);
                    }
                   
                    break;
                    
                case '3': //World 3 Map
                    if (playerLevel < 3)
                    {
                        String output3 = "ACCESS DENIED.";
                        System.out.println(output3);
                    }
                    else
                    {
                        String output3 = "You chose level 3!";
                        System.out.println(output3);
                    }
                    break;
                    
                case '4': //World 4 Map
                    if (playerLevel < 4)
                    {
                        String output4 = "ACCESS DENIED.";
                        System.out.println(output4);
                    }
                    else
                    {
                        String output4 = "You chose level 4!";
                        System.out.println(output4);
                    }
                    break;
                    
                case '5': //World 5 Map
                    if (playerLevel < 5)
                    {
                        String output5 = "ACCESS DENIED.";
                        System.out.println(output5);
                    }
                    else
                    {
                        String output5 = "You chose level 5!";
                        System.out.println(output5);
                    }
                    break;
                    
                case 'A':
                case 'a':
                    System.out.println("Here are all the maps!");
                    break;
                    
                case 'R': //exit game
                case 'r':
                    return;
                default:
                    System.out.println("\n*** Invalid Selection ***");
                    break;
            }
    }          
                    
        }   
