/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.view;

/**
 *
 * @author Logan
 */
public class StoreBioMenuView extends View {

    public StoreBioMenuView() {

        super("\n"
                + "\n----------------------------------------"
                + "\n| Store BackGround                           |"
                + "\n----------------------------------------"
                + "\nA - Venti's "
                + "\nB - Ardy's"
                + "\nC - Queen's Kitchen"
                + "\nD - McDumbledore's"
                + "\nF - Jack and the fox"
                + "\nE - Exit"
                + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase(); // convert to upper case
        switch (value) {
            case "A": //create and start a new game
                this.Venny();
                break;

            case "B": 
                this.Ardy();
                break;

            case "C":
                this.QueenKitchen();
                break;
            case "D": 
                this.McDumbledore();

                break;
               
            case "F": 
                this.Jack();

                break;


            case "E": //exit game
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid Selection ***");
                break;
        }
        return false;
    }

    private void Venny() {
        // create a new game
        this.console.println("Venny's"
                + "\n********************"
                + "\nVenny's was founnded on one idea, and that idea was bacon and more"
                + "\nbacon. it was founned in China. it serves american style food"
                + "\nwith a Asian twist. It has become popular worldwide"
                + "\nand has made it way to America, where it is rocking the boat"
                + "\nwith it's strange Asian style decore yet it serves no Asian food.");
    }

    private void Ardy() {
        // create a new game
        this.console.println("Ardy's"
                + "\n********************"
                + "\nThe founder of Ardy's Mr. Hardy is a spend thrift and many"
                + "\npeople say that he uses horse meat instead of beef on his "
                + "\nsandwiches. He claimes that even if he did you would not be able to tell.");
    }

    private void QueenKitchen() {
        // create a new game
        this.console.println("Queen's Kitchen"
                + "\n********************"
                + "\n This is your one place to go when your on a budget and want "
                + "\nto be treated like royalty."
        );

    }

    private void McDumbledore() {
        // create a new game
        this.console.println("McDumbledore"
                + "\n********************"
                + "\nThis wizard theme restruant make you feel as though you have"
                + "\nstepped through the padges of your favorite book seris.");
    }
    private void Jack() {
        // create a new game
        this.console.println("Jack and the Fox"
                + "\n********************"
                + "\nThe Vixen that started this company loves to keep her customers"
                + "\nguessing what will happen next.");
    }
}

