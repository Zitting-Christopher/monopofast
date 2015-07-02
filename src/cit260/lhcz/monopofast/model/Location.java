/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.model;

import cit260.lhcz.monopofast.control.MapControl.Scene;
import java.io.Serializable;

/**
 *
 * @author Logan
 */
public class Location implements Serializable {
    private int row;
    private int column;
    private boolean visited;
    private Scene scene;
    private ArrayList<Player> players;

    private static class ArrayList<T> {

        public ArrayList() {
        }
    }
    
}
