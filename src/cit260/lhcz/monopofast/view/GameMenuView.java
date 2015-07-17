/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.view;

/**
 * @author Logan
 *
 */
public class GameMenuView extends View {

    public GameMenuView() {

        super("\n"
                + "\n----------------------------------------"
                + "\n| Game Menu                            |"
                + "\n----------------------------------------"
                + "\nC - Continue Game"
                + "\nF - Challange Menu"
                + "\nM - View Map"
                + "\nS - Save Game"
                + "\nE - Exit"
                + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase(); // convert to upper case
        switch (value) {
            case "C": //create and start a new game
                this.ContinueGame();
                break;

            case "F": //Challange menu
                this.challangeMenu();
                break;

            case "M": //View Map
                this.viewMap();
                break;
            
            case "S": //save game
                this.saveGame();
                break;

            case "E": //exit game
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid Selection ***");
                break;
        }
        return false;
    }

    private void ContinueGame() {
        // create a new game
        this.console.println("create new game stub");
    }

    private void saveGame() {

        this.console.println("Save game");
    }

    private void challangeMenu() {
        {
        }
        ChallengeMenuView challengeMenu = new ChallengeMenuView();
        challengeMenu.display();
    }

    private void viewMap() {
       

    }

   

}
