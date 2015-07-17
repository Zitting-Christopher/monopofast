/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Christopher
 */
public enum World implements Serializable {

    //Define the worlds
    V(0, "Venti's"),
    A(1, "Ardy's"),
    J(2, "Jack and the Fox"),
    Q(3, "Queen Burger"),
    M(4, "McDumbledore's");

    //Create variables
    private final int worldId;
    private final String worldDesc;

    private Level[] level;
    private Character[] character;
    private Products[] products;
    private Map map;

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public int getWorldId() {
        return worldId;
    }

    public String getWorldDesc() {
        return worldDesc;
    }

    public Level[] getLevel() {
        return level;
    }

    public void setLevel(Level[] level) {
        this.level = level;
    }

    public Character[] getCharacter() {
        return character;
    }

    public void setCharacter(Character[] character) {
        this.character = character;
    }

    public Products[] getProducts() {
        return products;
    }

    public void setProducts(Products[] products) {
        this.products = products;
    }

    World(int worldId, String worldDesc) {

        this.worldId = worldId;
        this.worldDesc = worldDesc;
    }

}
