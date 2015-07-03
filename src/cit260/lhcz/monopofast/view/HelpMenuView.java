/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.view;



/**
 *
 * @author Christopher
 * @author Logan the I
 */
public class HelpMenuView extends View {
    
    public HelpMenuView(){
                  super("\n"
                + "\n----------------------------------------"
                + "\n| Help Menu                            |"
                + "\n----------------------------------------"
                + "\nC - View Commands"
                + "\nI - View Ingredients"
                + "\nP - View Products"
                + "\nR - Return to Main Menu"
                + "\n----------------------------------------");
   
    
    }
    
           @Override
                   public boolean doAction(Object obj){
                       String value = (String) obj; 
                       value = value.toUpperCase(); // convert to upper case
                     switch(value){
                case "C": //view Commands
                 this.commandsList();
                    break;
                                  
                case "I": //view Ingredients
                                  this.ingredientsList();
                   break;
                    
                case "P": //view Products
                                  this.productsList();
                    break;
                
                case "R": //exit game
                   return true;
                default:
                    System.out.println("\n*** Invalid Selection ***");
                    break;
                     }
    return false;
    } 

    private void commandsList() {
        String stars = "***************************************************************************************";
        System.out.println("\n" + stars);
        System.out.println("To use a command, while in gameplay, simply type the command followed by the ingredient.");
        System.out.println(stars);
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
        String stars = "********************************************************************************************";
        System.out.println("\n" + stars);
        System.out.println("To use an ingredient, while in gameplay, simply type the command followed by the ingredient.");
        System.out.println(stars);
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
        System.out.println("World 1: Vendy's");
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
        System.out.println("World 4: Queen's Kitchen");
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
                         



