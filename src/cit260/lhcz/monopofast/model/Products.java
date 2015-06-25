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
public enum Products implements Serializable {
    
    cola(0,"A Drink with bubbles in it"),
    chickenNuggets(1,"The other white meat"),
    frothy(2,"A cold choclate ice cream"),
    SrBaconCheesburger(3,"a hamburger with bacon on it"),
    BaconEaterSandwich(4,"this sandich has bacon"),
    turnover(5,"it is a desert...any questions?"),
    RootBeer(6,"The best drink on the planet...order one"),
    RoastBeefSandwich(7,"Roast Beef on Bread"),
    mozzarellaStick(8,"cheese sticks"),
    RanchBaconSandwich(9,"bacon on bread"),
    lemonade(10,"when life gives you a lemon..."),
    strawberryBananaMilkshake(11,"it has fruit in it so it is healthy."),
    jalapenoPoppers(12,"Spicy food."),
    FlaminChickenSandwich(13,"Spicy food] with chicken"),
    PackedBreakfastSandwich(14,"break your fast"),
    fruitPunch(15,"fruity and punchy"),
    onionRings(16,"ring around the onion"),
    strawberryMilkshake(17,"a pinkish milkshake"),
    DoubleDropperBurger(18,"don't drop it"),
    BigQueenBurger(19,"a meal ment for a queen"),
    lemonLimeSoda(20,"Soda with lime but no coconut"),
    chocolateMilkshake(21,"it is chocolate ice cream."),
    fries(23,"the proper way to eat a potato"),
    McBurger(24,"no connection to a clown"),
    McTriple(25,"it only has two pattie...just kidding");
    
    
    private final int productId;
    private final String description;

   

      public int getProductId() {
        return productId;
    }

  

    public String getDescription () {
        return description;
    }

   
   

     Products(int productId ,String description) {
        this.productId= productId;
        this.description= description;
    }

    
}
    
    
   
      