/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.view;

import cit260.lhcz.monopofast.control.HighScore;

/**
 *
 * @author Logan
 */
public class HighScoreView extends View {

    private static Object input;

    public HighScoreView() {

        super("\n"
                + "\n----------------------------------------"
                + "\n| High Score                           |"
                + "\n----------------------------------------"
                + "\nD - Display High Score"
                + "\nE - Exit"
                + "\n----------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase(); // convert to upper case
        switch (value) {
            case "D": //Challange 1
                highScoreArray();
                break;

            case "E": //exit game
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid Selection ***");
                break;
        }
        return false;
    }

    public static void highScoreArray() {
        final int MAX = 5;
        int[] scores = {12346, 12344, 12343, 12342, 12341};
        String[] names = {"\nPlayer 1.", "\nPlayer 2.", "\nPlayer 3.", "\nPlayer 4.", "\nPlayer 5."};
        for (int i = 0; i < scores.length; i++) {
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[i] < scores[j]) {
                    int temp = scores[i];
                    scores[i] = scores[j];
                    scores[j] = temp;
                }
            }

        }
        System.out.print("                  High Scores"
                + "\n**************************************************");
        for (int ctr = 0; ctr < scores.length; ctr++) {
            System.out.print(names[ctr] + " " + scores[ctr]);

        }

    }
}
