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

    private int row;
    private int column;
    private Location[][] locations;
    private int noOfRows;
    private int noOfColumns;

    public Map() {
    }

    public Map(int noOfRows, int noOfColumns) {

        if (noOfRows < 1 || noOfColumns < 1) {
            ErrorView.display(this.getClass().getName(), "The number of columns and rows must be > than 0");
            return;
        }

        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;

        this.locations = new Location[noOfRows][noOfColumns];

        for (int row = 0; row < noOfRows; row++) {
            for (int column = 0; column < noOfColumns; column++) {

                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);

                locations[row][column] = location;
            }
        }

    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    public int getNoOfRows() {
        return noOfRows;
    }

    public void setNoOfRows(int noOfRows) {
        this.noOfRows = noOfRows;
    }

    public int getNoOfColumns() {
        return noOfColumns;
    }

    public void setNoOfColumns(int noOfColumns) {
        this.noOfColumns = noOfColumns;
    }

    @Override
    public String toString() {
        return "Map{" + "row=" + row + ", column=" + column + ", locations=" + locations + ", noOfRows=" + noOfRows + ", noOfColumns=" + noOfColumns + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.row;
        hash = 79 * hash + this.column;
        hash = 79 * hash + Arrays.deepHashCode(this.locations);
        hash = 79 * hash + this.noOfRows;
        hash = 79 * hash + this.noOfColumns;
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
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (!Arrays.deepEquals(this.locations, other.locations)) {
            return false;
        }
        if (this.noOfRows != other.noOfRows) {
            return false;
        }
        if (this.noOfColumns != other.noOfColumns) {
            return false;
        }
        return true;
    }

}