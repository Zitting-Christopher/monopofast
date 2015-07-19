/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.view;

import cit260.lhcz.monopofast.control.MapControl;
import exception.MapControlException;
import java.awt.Point;
import monopofast.Monopofast;

/**
 *
 * @author Logan
 */
public class MapView extends View {

    public MapView() {
         super("\n"
                + "ST = Start"
                + "VD = Venndy's"
                + "RD = Ardy's"
                + "JK = Jack's"
                + "QU = Queen's"
                + "MC = McDumbledore"
                + "ED = Ending"
                + "\n"
                + "\n----------------------------------------------"
                + "\nPlease enter the coordinates of a location on "
                + "\nthe map. (row,column)"
                + "\n"
                + "\nB - Back"
                + "\n----------------------------------------------");

    }
    
    @Override
    public boolean doAction(Object obj) {
        
        String input = (String) obj;

        switch (input) {
            case "E":
                return false;
            default:
                String[] coordinates = input.split(",");
                String inputOne = coordinates[0];
                String inputTwo = coordinates[1];

                int row = Integer.parseInt(inputOne);
                int col = Integer.parseInt(inputTwo);

                try {
                    MapControl.movePlayerToLocation(Monopofast.getPlayer(), new Point(row, col));
                } catch (MapControlException ex) {
                    ErrorView.display("MapView", ex.getMessage());
                    return false;
                }
                this.console.print("Move was successful.");
                GameMenuView gameMenu = new GameMenuView();
                gameMenu.display();
                return true;

        }

    }

}