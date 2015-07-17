/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.model;

import exception.GameControlException;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import monopofast.Monopofast;

/**
 *
 * @author Christopher
 */
public class Map implements Serializable {

    private int rowCount;
    private int columnCount;
    private Location[][] locations;

    protected final BufferedReader keyboard = Monopofast.getInFile();
    protected final PrintWriter console = Monopofast.getOutFile();

    public Map() {
    }

    public Map(int rows, int columns) {
        if (rows < 0 || columns < 0) {
            this.console.println("Invalid map size.");
            return;
        }
        this.rowCount = rows;
        this.columnCount = columns;

        //Create 2d array for location objects
        this.locations = new Location[rowCount][columnCount];

        for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < columnCount; column++) {
                Location location = new Location();
                location.setY(column);
                location.setX(row);
                locations[row][column] = location;
            }
        }
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.rowCount;
        hash = 79 * hash + this.columnCount;
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
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        return true;
    }

    public static void printMap()
            throws GameControlException {
        try (FileOutputStream fops = new FileOutputStream("mapReport.txt")) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            output.writeObject(Monopofast.getCurrentGame().getMap());
        } catch (Exception ex) {
            throw new GameControlException(ex.getMessage());
        }
    }

}


