/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.model;

import java.io.Serializable;

/**
 *
 * @author Logan
 */
public enum Scene implements Serializable {
    
start("Start Scene","Hi! Welcome to Monopofast - the fast food game of corporate domination!", "ST"),
    Vendy("Venny's", "You look around you, and it's sandy.", "VD"),
    Ardy("Ardy's","The founder of Ardy's Mr. Hardy is a spend thrift and many", "RD"),
    Jack("Jack","A Food shop. The smell of stale bread and Strange spices fills your nose.", "JK"),
     Queen("Queen's","This is your one place to go when your on a budget and want", "QU"),
    McDumbledore("McDumbledore","This wizard theme restruant make you feel as though you have.", "MC"),
    ending("Finish","You Win", "EN");
 
    
    
   
    // class instance variables 
    private final String location;
    private final String description;
    private final String mapSymbol;

    private Scene(String location, String description,  String mapSymbol) {
        this.location = location;
        this.description = description;
        this.mapSymbol = mapSymbol;

    }


    public String getDescription() {
        return description;
    }


    public String getTerrainType() {
        return location;
    }

    public String getMapSymbol() {
        return mapSymbol;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", location=" + location +  ", mapSymbol=" + mapSymbol + '}';
    }
}