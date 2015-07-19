/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import monopofast.Monopofast;

/**
 *
 * @author Logan
 */
public abstract class View implements ViewInterface {

    String promptMessage;

    protected final BufferedReader keyboard = Monopofast.getInFile();
    protected final PrintWriter console = Monopofast.getOutFile();

    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    @Override
    public void display() {

        char firstLetter;

        do {
            this.console.println(promptMessage);

            String selection = this.getInput();
            firstLetter = selection.toUpperCase().charAt(0);

            this.doAction(selection);

        } while (firstLetter != 'E' && firstLetter != 'Q');

    }

    @Override
    public String getInput() {
        boolean valid = false;
        String menuItem = "";

        while (!valid) {

            try {
                this.console.println("Please make a selection.");

                menuItem = this.keyboard.readLine();
                menuItem = menuItem.trim();
                menuItem = menuItem.toUpperCase();

                if (menuItem.length() < 1) {
                    ErrorView.display(this.getClass().getName(), "Invalid option, please try again");
                    continue;
                }
                break;
            } catch (Exception e) {
                ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
            }
        }

        return menuItem;
    }
}