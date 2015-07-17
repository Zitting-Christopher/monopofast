/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import monopofast.Monopofast;

/**
 *
 * @author Logan
 */
public abstract class View implements ViewInterface {

    private String messagePrompt;

    protected final BufferedReader keyboard = Monopofast.getInFile();
    protected final PrintWriter console = Monopofast.getOutFile();

    

    public View(String messagePrompt) {
        this.messagePrompt = messagePrompt;
    }

    @Override
    public void display() {

        char firstLetter;

        do {
            this.console.println(messagePrompt);

            String selection = this.getInput();
            firstLetter = selection.toUpperCase().charAt(0);

            this.doAction(selection);

        } while (firstLetter != 'E' && firstLetter != 'Q');
    }

    @Override
    public String getInput() {
        boolean valid = false;
        String value = null;
        // while a valid name not retrived 
        while (!valid) {
            try {
                value = this.keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
            value = value.trim();
            if (value.length() < 1) {// blank value entered
                ErrorView.display(this.getClass().getName(), "You must enter a value.");
                continue;
            }
            break;

        }
        return value; //return the name
    }

   

    public String getMessagePrompt() {
        return messagePrompt;
    }

    public void setMessagePrompt(String messagePrompt) {
        this.messagePrompt = messagePrompt;
    }

}
