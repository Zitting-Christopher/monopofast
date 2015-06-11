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
public class HelpMenuView {
    
    private final String MENU = "\n"
                + "\n----------------------------------------"
                + "\n| Help Menu                            |"
                + "\n----------------------------------------"
                + "\nC - View Commands"
                + "\nI - View Ingredients"
                + "\nP - View Products"
                + "\nR - Return to Main Menu"
                + "\n----------------------------------------";
   
    public void displayMenu() {
        char selection;
        
        do{
            System.out.println(MENU); //display the main menu
            String input = this.getInput();
            selection = input.charAt(0);
            this.doAction(selection);
            
            } while (selection != 'R');
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
            
            switch(choice){
                case 'C': //view Commands
                case 'c':
                    this.commandsList();
                    break;
                                  
                case 'I': //view Ingredients
                case 'i':
                    this.ingredientsList();
                   break;
                case 'P': //view Products
                case 'p':
                    this.productsList();
                    break;
                case 'R': //exit game
                case 'r':
                    return;
                default:
                    System.out.println("\n*** Invalid Selection ***");
                    break;
            }
    } 

    private void commandsList() {
        System.out.println("\n**********************************************************************");
        System.out.println("To use a command, simply type the command followed by the ingredient.");
        System.out.println("**********************************************************************");
        System.out.println("add");
        System.out.println("bake");
        System.out.println("blend");
        System.out.println("dispense");
        System.out.println("frost");
        System.out.println("move");
        System.out.println("prepare");
        System.out.println("remove");
        System.out.println("serve");
    }

    private void ingredientsList() {
        System.out.println("\n*************************************************************************");
        System.out.println("To use an ingredient, simply type the command followed by the ingredient.");
        System.out.println("*************************************************************************");
        System.out.println("bacon");
        System.out.println("bottom bun");
        System.out.println("bread");
        System.out.println("burger");
        System.out.println("cheese");
        System.out.println("chicken nuggets");
        System.out.println("chocolate milkshake");
        System.out.println("cola");
        System.out.println("diet lemonade");
        System.out.println("egg");
        System.out.println("fries");
        System.out.println("frothy");
        System.out.println("fruit punch");
        System.out.println("grilled onions");
        System.out.println("ham");
        System.out.println("heehaw sauce");
        System.out.println("jalapeno poppers");
        System.out.println("ketchup");
        System.out.println("lemon-lime soda");
        System.out.println("lettuce");
        System.out.println("mayo");
        System.out.println("mozarella sticks");
        System.out.println("mustard");
        System.out.println("onion");
        System.out.println("onion rings");
        System.out.println("pepper sauce");
        System.out.println("pickles");
        System.out.println("ranch");
        System.out.println("roast beef");
        System.out.println("sauce");
        System.out.println("sausage");
        System.out.println("spicy chicken");
        System.out.println("strawberry milkshake");
        System.out.println("strawberry banana milkshake");
        System.out.println("tomato");
        System.out.println("top bun");
        System.out.println("turkey");
        System.out.println("turnover");
        
    }

    private void productsList() {
        System.out.println("\n*************************************************************************");
        System.out.println("World 1: Venti's");
        System.out.println("*************************************************************************\n");
        System.out.println("\tLevel 1 - cola");
        System.out.println("\tLevel 2 - chicken nuggets");
        System.out.println("\tLevel 3 - frothy");
        System.out.println("\tLevel 4 - Sr. Bacon Cheesburger");
        System.out.println("\tLevel 5 - Son of a Bacon Eater Sandwich");
        System.out.println("\n*************************************************************************");
        System.out.println("World 2: Ardy's");
        System.out.println("*************************************************************************\n");
        System.out.println("\tLevel 1 - root beer");
        System.out.println("\tLevel 2 - turnover");
        System.out.println("\tLevel 3 - mozzarella sticks");
        System.out.println("\tLevel 4 - Spicy Roast Beef Sandwich");
        System.out.println("\tLevel 5 - Turkey Ranch and Bacon Sandwich");
        System.out.println("\n*************************************************************************");
        System.out.println("World 3: Jack and the Fox");
        System.out.println("*************************************************************************\n");
        System.out.println("\tLevel 1 - diet lemonade");
        System.out.println("\tLevel 2 - strawberry banana milkshake");
        System.out.println("\tLevel 3 - jalapeno poppers");
        System.out.println("\tLevel 4 - Jack's Flamin Chicken Sandwich");
        System.out.println("\tLevel 5 - Packed Breakfast Sandwich");
        System.out.println("\n*************************************************************************");
        System.out.println("World 4: Queen Burger");
        System.out.println("*************************************************************************\n");
        System.out.println("\tLevel 1 - fruit punch");
        System.out.println("\tLevel 2 - onion rings");
        System.out.println("\tLevel 3 - strawberry milkshake");
        System.out.println("\tLevel 4 - Double Dropper Burger");
        System.out.println("\tLevel 5 - Big Queen Burger");
        System.out.println("\n*************************************************************************");
        System.out.println("World 5: McDumbledore's");
        System.out.println("*************************************************************************\n");
        System.out.println("\tLevel 1 - lemon-lime soda");
        System.out.println("\tLevel 2 - chocolate milkshake");
        System.out.println("\tLevel 3 - fries");
        System.out.println("\tLevel 4 - McBurger");
        System.out.println("\tLevel 5 - McTriple");
        
        
    }
}
                         



