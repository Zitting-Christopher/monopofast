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
public enum Scene implements Serializable{
        start("Hi! Welcome to Monopofast - the fast food game of corporate domination!","ST"),
        vendy("Venny's was founnded on one idea, and that idea was bacon and more","VD"),
        ardy("The founder of Ardy's Mr. Hardy is a spend thrift and many","RD"),
        jack("A Food shop. The smell of stale bread and Strange spices fills your nose.","JK"),
        queen("This is your one place to go when your on a budget and want","QU"),
        mcDumbledore("This wizard theme restruant make you feel as though you have.","MC"),
        ending("You Win","EN");
        private String symbol;
        private String description;
    
        Scene(String description, String symbol) {
        this.symbol=symbol;
        this.description = description;
        }
    
        public String getSymbol(){
        return symbol;
        }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", symbol=" + symbol + '}';
    }
}