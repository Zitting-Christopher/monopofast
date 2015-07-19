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

    public HelpMenuView() {
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
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase(); // convert to upper case
        switch (value) {
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
                ErrorView.display(this.getClass().getName(), "\n*** Invalid Selection ***");
                break;
        }
        return false;
    }

    private void commandsList() {
        String stars = "***************************************************************************************";
        this.console.println("\n" + stars);
        this.console.println("To use a command, while in gameplay, simply type the command followed by the ingredient.");
        this.console.println(stars);
        this.console.println("add");
        this.console.println("bake");
        this.console.println("blend");
        this.console.println("dispense");
        this.console.println("frost");
        this.console.println("move");
        this.console.println("prepare");
        this.console.println("remove");
        this.console.println("serve");
    }

    private void ingredientsList() {
        String stars = "********************************************************************************************";
        this.console.println("\n" + stars);
        this.console.println("To use an ingredient, while in gameplay, simply type the command followed by the ingredient.");
        this.console.println(stars);
        this.console.println("bacon");
        this.console.println("bottom bun");
        this.console.println("bread");
        this.console.println("burger");
        this.console.println("cheese");
        this.console.println("chicken nuggets");
        this.console.println("chocolate milkshake");
        this.console.println("cola");
        this.console.println("diet lemonade");
        this.console.println("egg");
        this.console.println("fries");
        this.console.println("frothy");
        this.console.println("fruit punch");
        this.console.println("grilled onions");
        this.console.println("ham");
        this.console.println("heehaw sauce");
        this.console.println("jalapeno poppers");
        this.console.println("ketchup");
        this.console.println("lemon-lime soda");
        this.console.println("lettuce");
        this.console.println("mayo");
        this.console.println("mozarella sticks");
        this.console.println("mustard");
        this.console.println("onion");
        this.console.println("onion rings");
        this.console.println("pepper sauce");
        this.console.println("pickles");
        this.console.println("ranch");
        this.console.println("roast beef");
        this.console.println("sauce");
        this.console.println("sausage");
        this.console.println("spicy chicken");
        this.console.println("strawberry milkshake");
        this.console.println("strawberry banana milkshake");
        this.console.println("tomato");
        this.console.println("top bun");
        this.console.println("turkey");
        this.console.println("turnover");

    }

    private void productsList() {
        this.console.println("\n*************************************************************************");
        this.console.println("World 1: Vendy's");
        this.console.println("*************************************************************************\n");
        this.console.println("\tLevel 1 - cola");
        this.console.println("\tLevel 2 - chicken nuggets");
        this.console.println("\tLevel 3 - frothy");
        this.console.println("\tLevel 4 - Sr. Bacon Cheesburger");
        this.console.println("\tLevel 5 - Son of a Bacon Eater Sandwich");
        this.console.println("\n*************************************************************************");
        this.console.println("World 2: Ardy's");
        this.console.println("*************************************************************************\n");
        this.console.println("\tLevel 1 - root beer");
        this.console.println("\tLevel 2 - turnover");
        this.console.println("\tLevel 3 - mozzarella sticks");
        this.console.println("\tLevel 4 - Spicy Roast Beef Sandwich");
        this.console.println("\tLevel 5 - Turkey Ranch and Bacon Sandwich");
        this.console.println("\n*************************************************************************");
        this.console.println("World 3: Jack and the Fox");
        this.console.println("*************************************************************************\n");
        this.console.println("\tLevel 1 - diet lemonade");
        this.console.println("\tLevel 2 - strawberry banana milkshake");
        this.console.println("\tLevel 3 - jalapeno poppers");
        this.console.println("\tLevel 4 - Jack's Flamin Chicken Sandwich");
        this.console.println("\tLevel 5 - Packed Breakfast Sandwich");
        this.console.println("\n*************************************************************************");
        this.console.println("World 4: Queen's Kitchen");
        this.console.println("*************************************************************************\n");
        this.console.println("\tLevel 1 - fruit punch");
        this.console.println("\tLevel 2 - onion rings");
        this.console.println("\tLevel 3 - strawberry milkshake");
        this.console.println("\tLevel 4 - Double Dropper Burger");
        this.console.println("\tLevel 5 - Big Queen Burger");
        this.console.println("\n*************************************************************************");
        this.console.println("World 5: McDumbledore's");
        this.console.println("*************************************************************************\n");
        this.console.println("\tLevel 1 - lemon-lime soda");
        this.console.println("\tLevel 2 - chocolate milkshake");
        this.console.println("\tLevel 3 - fries");
        this.console.println("\tLevel 4 - McBurger");
        this.console.println("\tLevel 5 - McTriple");

    }

}
