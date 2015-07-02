/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.view;
import cit260.lhcz.monopofast.control.MapControl;
import cit260.lhcz.monopofast.model.Player;
import exception.MapControlException;
import java.awt.Point;
import java.util.Scanner;
/**
 *
 * @author Logan
 */
public abstract class View implements ViewInterface {
    private String messagePrompt;
    private Point coordinates;
    public View(String messagePrompt){
        this.messagePrompt = messagePrompt;
    }
    @Override
    public void display(){
        String value = "";
        boolean done = false;
        do {
            System.out.println(this.messagePrompt);// view prompt
            value = this.getInput(); // get value that player
            done = this.doAction(value); // do Action
        } while(!done);
        }
    @Override
    public String getInput(){
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String value = null;
        // while a valid name not retrived 
        while (!valid){
            value = keyboard.nextLine();
            value = value.trim();
            if (value.length() < 1){// blank value entered
                System.out.println("You must enter a value.");
                continue;
            }
            break;
            
            }
        return value; //return the name
        }
 @Override
    public boolean doAction(){
        Player player = null;
       try{
        MapControl.moveActorsToLocation(player,coordinates);
       } catch (MapControlException me){
           System.out.println(me.getMessage());
       }
        return false;
    }
    public String getMessagePrompt() {
        return messagePrompt;
    }

    public void setMessagePrompt(String messagePrompt) {
        this.messagePrompt = messagePrompt;
    }

    }


    

