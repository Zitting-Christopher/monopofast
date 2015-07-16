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
public class Map implements Serializable{
    private int rowCount;
    private int columnCount;
    private Location[][] locations;

    protected final BufferedReader keyboard = Monopofast.getInFile();
    protected final PrintWriter console = Monopofast.getOutFile();
    public Map() {
    }

    public Map(int rows, int columns) {
        if (rows<0||columns<0){
            this.console.println("Invalid map size.");
            return;
        }
        this.rowCount=rows;
        this.columnCount=columns;
        
        //Create 2d array for location objects
        this.locations=new Location[rowCount][columnCount];
        
        for(int row=0;row<rowCount;row++){
            for(int column=0;column<columnCount;column++){
                Location location=new Location();
                location.setY(column);
                location.setX(row);
                locations[row][column]=location;
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
            throws GameControlException{
        try(FileOutputStream fops = new FileOutputStream("C:\\Users\\Logan\\Documents\\mapReport.txt")){
            ObjectOutputStream output = new ObjectOutputStream(fops);
            output.writeObject(Monopofast.getCurrentGame().getMap());
        }catch(Exception ex){
            throw new GameControlException(ex.getMessage());
        }
    }

}


//        Ve1(0,0,"Level 1 - Vendy's Drink Station"),
//        Ve2(0,1,"Level 2 - Vendy's Fried Food Station"),
//        Ve3(0,2,"Level 3 - Vendy's Milkshake Station"),
//        Ve4(0,3,"Level 4 - Vendy's Sr. Bacon Cheeseburger Station"),
//        Ve5(0,4,"Level 5 - Vendy's Son of a Bacon Eater Station"),
//        //Ardy's levels
//        Ar1(1,0,"Level 6 - Ardy's Drink Station"),
//        Ar2(1,1,"Level 7 - Ardy's Baked Good Station"),
//        Ar3(1,2,"Level 8 - Ardy's Fried Food Station"),
//        Ar4(1,3,"Level 9 - Ardy's Spicy Roast Station"),
//        Ar5(1,4,"Level 10 - Ardy's Turkey, Ranch and Bacon Station"),
//        //Jack and the Fox levels
//        Ja1(2,0,"Level 11 - Jack and the Fox Drink Station"),
//        Ja2(2,1,"Level 12 - Jack and the Fox Milkshake Station"),
//        Ja3(2,2,"Level 13 - Jack and the Fox Fried Food Station"),
//        Ja4(2,3,"Level 14 - Jack and the Fox Jack's Flamin Chicken Station"),
//        Ja5(2,4,"Level 15 - Jack and the Fox Loaded Breakfast Station"),
//        //Queen's Kitchen levels
//        Qu1(3,0,"Level 16 - Queen's Kitchen Drink Station"),
//        Qu2(3,1,"Level 17 - Queen's Kitchen Fried Food Station"),
//        Qu3(3,2,"Level 18 - Queen's Kitchen Milkshake Station"),
//        Qu4(3,3,"Level 19 - Queen's Kitchen Double Dropper Station"),
//        Qu5(3,4,"Level 20 - Queen's Kitchen Big Queen Station"),
//        //McDumbledore's levels
//        Mc1(4,0,"Level 21 - McDumbledore's Drink Station"),
//        Mc2(4,1,"Level 22 - McDumbledore's Milkshake Station"),
//        Mc3(4,2,"Level 23 - McDumbledore's Fried Food Station"),
//        Mc4(4,3,"Level 24 - McDumbledore's Plain Double McBurger Station"),
//        Mc5(4,4,"Level 25 - McDumbledore's McTriple Eater Station");
        
       