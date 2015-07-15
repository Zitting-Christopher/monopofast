/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.control;

import cit260.lhcz.monopofast.model.Map;
import cit260.lhcz.monopofast.model.Player;
import exception.MapControlException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import monopofast.Monopofast;

/**
 *
 * @author Logan
 * @author Christopher
 */
public class CharacterControl {
    private final String PROMPT = "Input a direction to go or back to return to the menu:";
    protected final BufferedReader keyboard = Monopofast.getInFile();
    protected final PrintWriter console = Monopofast.getOutFile();
    
    public void moveCharacter(){
       char selection=' ';
       do{
            //Displays the main menu
            this.console.println(PROMPT);
            
            //Get users input
            String input = this.getInput();
            //Get first character of string
            selection = input.charAt(0);
            
            //Do action based on selection
            this.doAction(selection);
        } while (selection!='b');         
    }
    private String getInput() {
        boolean valid = false;
        String userInput = "";
        try{
            while(valid!=true){            
        
                //Get name and trim off blanks
                userInput = this.keyboard.readLine();
                userInput = userInput.toLowerCase();
                userInput = userInput.trim();
                
                
                //Checks to see if the name is valid
                if (userInput.length()==0){
                    this.console.println("Invalid input - try another option");
                }else{
                    valid=true;
                }
            } 
        }catch (IOException ex) {
            this.console.println("Error reading input: " + ex.getMessage());
        }
        return userInput;
    }

    private void doAction(char selection) {
        if(selection=='n'){
            this.moveNorth();
        }else if(selection=='e'){
            this.moveEast();
        }else if(selection=='s'){
            this.moveSouth();
        }else if(selection=='w'){
            this.moveWest();
        }else if(selection=='b'){
        }else{
            this.console.println("***Invalid direction-try again***");
        }
    }
    
    public static void moveCharacterToLocation(Player player, int row, int column)
        throws MapControlException{
        Map map = Monopofast.getCurrentGame().getMap();
        int newRow = row - 1;
        int newColumn = column - 1;
        
        if (newRow < 0 || newRow >= map.getRowCount() || newColumn < 0 || newColumn >= map.getColumnCount()){
            throw new MapControlException("Cannot move to " + row + "," + column +
                                          "because that location is out of the map boundaries.");
        }
    }

    private void moveNorth() {
        this.console.println("***moveNorth function called***");
    }

    private void moveEast() {
        this.console.println("***moveEast function called***");
    }

    private void moveSouth() {
        this.console.println("***moveSouth function called***");
    }

    private void moveWest() {
        this.console.println("***moveWest function called***");
    }
}
