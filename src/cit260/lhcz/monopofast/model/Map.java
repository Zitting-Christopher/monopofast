/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.model;

import cit260.lhcz.monopofast.view.*;
import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author Christopher
 */
public class Map implements Serializable {

    private int x;
    private int y;
    private Location[][] locations;
    private int noOfXs;
    private int noOfYs;

    public Map() {
    }

    public Map(int noOfXs, int noOfYs) {

        if (noOfXs < 1 || noOfYs < 1) {
            ErrorView.display(this.getClass().getName(), "The number of ys and xs must be > than 0");
            return;
        }

        this.noOfXs = noOfXs;
        this.noOfYs = noOfYs;

        this.locations = new Location[noOfXs][noOfYs];

        for (int x = 0; x < noOfXs; x++) {
            for (int y = 0; y < noOfYs; y++) {

                Location location = new Location();
                location.setY(y);
                location.setX(x);
                
                locations[x][y] = location;
            }
        }

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    public int getNoOfXs() {
        return noOfXs;
    }

    public void setNoOfXs(int noOfXs) {
        this.noOfXs = noOfXs;
    }

    public int getNoOfYs() {
        return noOfYs;
    }

    public void setNoOfYs(int noOfYs) {
        this.noOfYs = noOfYs;
    }

    @Override
    public String toString() {
        return "Map{" + "row" + x + ", column" + y + ", locations=" + locations + ", noOfXs=" + noOfXs + ", noOfYs=" + noOfYs + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.x;
        hash = 79 * hash + this.y;
        hash = 79 * hash + Arrays.deepHashCode(this.locations);
        hash = 79 * hash + this.noOfXs;
        hash = 79 * hash + this.noOfYs;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        if (!Arrays.deepEquals(this.locations, other.locations)) {
            return false;
        }
        if (this.noOfXs != other.noOfXs) {
            return false;
        }
        if (this.noOfYs != other.noOfYs) {
            return false;
        }
        return true;
    }

   
}