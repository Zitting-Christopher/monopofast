/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.model;

import java.io.Serializable;

/**
 *
 * @author Christopher
 */
public enum Level implements Serializable {

    //Venti's Level Description
    Level1(0, "Vendy's Drink Station"),
    Level2(1, "Vendy's Fried Food Station"),
    Level3(2, "Vendy's Milkshake Station"),
    Level4(3, "Vendy's Sr. Bacon Cheeseburger Station"),
    Level5(4, "Vendy's Son of a Bacon Eater Station"),
    //Ardy's Level Description
    Level6(5, "Ardy's Drink Station"),
    Level7(6, "Ardy's Baked Good Station"),
    Level8(7, "Ardy's Fried Food Station"),
    Level9(8, "Ardy's Spicy Roast Station"),
    Level10(9, "Ardy's Turkey, Ranch and Bacon Station"),
    //Jack and the Fox Level Description
    Level11(10, "Jack and the Fox Drink Station"),
    Level12(11, "Jack and the Fox Milkshake Station"),
    Level13(12, "Jack and the Fox Fried Food Station"),
    Level14(13, "Jack and the Fox Jack's Flamin Chicken Station"),
    Level15(14, "Jack and the Fox Loaded Breakfast Station"),
    //Queen Burger Level Description
    Level16(15, "Queen's Kitchen Drink Station"),
    Level17(16, "Queen's Kitchen Fried Food Station"),
    Level18(17, "Queen's Kitchen Milkshake Station"),
    Level19(18, "Queen's Kitchen Double Dropper Station"),
    Level20(19, "Queen's Kitchen Big Queen Station"),
    //McDumbledore's Level Description
    Level21(20, "McDumbledore's Drink Station"),
    Level22(21, "McDumbledore's Milkshake Station"),
    Level23(22, "McDumbledore's Fried Food Station"),
    Level24(23, "McDumbledore's Plain Double McBurger Station"),
    Level25(24, "McDumbledore's McTriple Eater Station");

    //Let's define the variables we'll be using with the enum
    private final int levelId;
    private final String lDesc;

    private World world;
    private Products products;
    private Ingredients[] ingredients;
    private Commands[] commands;
    private Map map;

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public int getLevelId() {
        return levelId;
    }

    public String getLDesc() {
        return lDesc;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public Ingredients[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredients[] ingredients) {
        this.ingredients = ingredients;
    }

   
    public Commands[] getCommands() {
        return commands;
    }

    public void setCommands(Commands[] commands) {
        this.commands = commands;
    }

    Level(int levelId, String lDesc) {
        this.levelId = levelId;
        this.lDesc = lDesc;
    }

}
