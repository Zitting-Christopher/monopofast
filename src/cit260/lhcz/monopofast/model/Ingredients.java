/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.model;
import java.io.Serializable;
 /*
 * @author Christopher
 */
public enum Ingredients implements Serializable {
    
    //Define ingredients
    bacon(0,"bacon"),
    btmbun(1,"bottom bun"),
    bread(2,"bread"),
    burger(3,"burger"),
    cheese(4,"cheese"),
    chknug(5,"chicken nuggets"),
    chocmilk(6,"chocolate milkshake"),
    cola(7,"cola"),
    dilem(8,"diet lemonade"),
    egg(9,"egg"),
    fries(10,"fries"),
    frothy(11,"frothy"),
    frtpch(12,"fruit punch"),
    grloni(13,"grilled onions"),
    ham(14,"ham"),
    heesau(15,"heehaw sauce"),
    jalpop(16,"jalapeno poppers"),
    ketchup(17,"ketchup"),
    lemlim(18,"lemon-lime soda"),
    lettuce(19,"lettuce"),
    mayo(20,"mayo"),
    mozz(21,"mozzarella sticks"),
    must(22,"mustard"),
    onion(23,"onion"),
    onrin(24,"onion rings"),
    pepsau(25,"pepper sauce"),
    pickles(26,"pickles"),
    ranch(27,"ranch"),
    rbeef(28,"roast beef"),
    sauce(29,"sauce"),
    sausage(30,"sausage"),
    spchk(31,"spicy chicken"),
    strmlk(32,"strawberry milkshake"),
    strban(33,"strawberry banana milkshake"),
    tomato(34,"tomato"),
    topbun(35,"top bun"),
    turkey(36,"turkey"),
    turnover(37,"turnover");
    
    
    
    private final int ingrId;
    private final String ingrKeyword;

    public int getIngrId() {
        return ingrId;
    }
    
    public String getIngrKeyword() {
        return ingrKeyword;
    }

    Ingredients(int ingrId, String ingrKeyword) {
        this.ingrId = ingrId;
        this.ingrKeyword = ingrKeyword;
    }
    
}
