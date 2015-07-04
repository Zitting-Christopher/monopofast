/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Christopher
 */
public enum Map implements Serializable{
//    private String name;
//    private String description;
//    private final ArrayList<Game> games = new ArrayList<>();
//    private Location[][] locations;
//    private int noOfRows;
//    private int noOfColumns;
    
   
        //Vendy's levels
        Ve1(0,0,"Level 1 - Vendy's Drink Station"),
        Ve2(0,1,"Level 2 - Vendy's Fried Food Station"),
        Ve3(0,2,"Level 3 - Vendy's Milkshake Station"),
        Ve4(0,3,"Level 4 - Vendy's Sr. Bacon Cheeseburger Station"),
        Ve5(0,4,"Level 5 - Vendy's Son of a Bacon Eater Station"),
        //Ardy's levels
        Ar1(1,0,"Level 6 - Ardy's Drink Station"),
        Ar2(1,1,"Level 7 - Ardy's Baked Good Station"),
        Ar3(1,2,"Level 8 - Ardy's Fried Food Station"),
        Ar4(1,3,"Level 9 - Ardy's Spicy Roast Station"),
        Ar5(1,4,"Level 10 - Ardy's Turkey, Ranch and Bacon Station"),
        //Jack and the Fox levels
        Ja1(2,0,"Level 11 - Jack and the Fox Drink Station"),
        Ja2(2,1,"Level 12 - Jack and the Fox Milkshake Station"),
        Ja3(2,2,"Level 13 - Jack and the Fox Fried Food Station"),
        Ja4(2,3,"Level 14 - Jack and the Fox Jack's Flamin Chicken Station"),
        Ja5(2,4,"Level 15 - Jack and the Fox Loaded Breakfast Station"),
        //Queen's Kitchen levels
        Qu1(3,0,"Level 16 - Queen's Kitchen Drink Station"),
        Qu2(3,1,"Level 17 - Queen's Kitchen Fried Food Station"),
        Qu3(3,2,"Level 18 - Queen's Kitchen Milkshake Station"),
        Qu4(3,3,"Level 19 - Queen's Kitchen Double Dropper Station"),
        Qu5(3,4,"Level 20 - Queen's Kitchen Big Queen Station"),
        //McDumbledore's levels
        Mc1(4,0,"Level 21 - McDumbledore's Drink Station"),
        Mc2(4,1,"Level 22 - McDumbledore's Milkshake Station"),
        Mc3(4,2,"Level 23 - McDumbledore's Fried Food Station"),
        Mc4(4,3,"Level 24 - McDumbledore's Plain Double McBurger Station"),
        Mc5(4,4,"Level 25 - McDumbledore's McTriple Eater Station");
        
        //Define our variables
         private final int row;
         private final int column;
         private final String locDesc;
        
    
    
    
    

//    public Map() {
//    }
//
//    public Map(int i, int i0) {
//        
//    }
//
//    @Override
//    public String toString() {
//        return "Restaurant{" + "name=" + name + ", description=" + description + '}';
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 43 * hash + Objects.hashCode(this.name);
//        hash = 43 * hash + Objects.hashCode(this.description);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Map other = (Map) obj;
//        if (!Objects.equals(this.name, other.name)) {
//            return false;
//        }
//        if (!Objects.equals(this.description, other.description)) {
//            return false;
//        }
//        return true;
//    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public String getLocDesc() {
        return locDesc;
    }


       
    
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public int getNoOfRows() {
//        return noOfRows;
//    }
//
//    public void setNoOfRows(int noOfRows) {
//        this.noOfRows = noOfRows;
//    }
//
//    public int getNoOfColumns() {
//        return noOfColumns;
//    }
//
//    public void setNoOfColumns(int noOfColumns) {
//        this.noOfColumns = noOfColumns;
//    }
    
    Map(int row, int column, String locDesc){
        this.row = row;
        this.column = column;
        this.locDesc = locDesc;
    }
    
}