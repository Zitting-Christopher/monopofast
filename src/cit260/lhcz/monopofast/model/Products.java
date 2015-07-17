/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.model;
import exception.GameControlException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.EnumSet;

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
    TurkeyRanchBaconSandwich(9,"bacon on bread"),
    lemonade(10,"when life gives you a lemon..."),
    strawberryBananaMilkshake(11,"it has fruit in it so it is healthy."),
    jalapenoPoppers(12,"Spicy food."),
    FlaminChickenSandwich(13,"Spicy food with chicken"),
    PackedBreakfastSandwich(14,"break your fast"),
    fruitPunch(15,"fruity and punchy"),
    onionRings(16,"ring around the onion"),
    strawberryMilkshake(17,"a pinkish milkshake"),
    DoubleDropperBurger(18,"don't drop it"),
    BigQueenBurger(19,"a meal meant for a queen"),
    lemonLimeSoda(20,"Soda with lime but no coconut"),
    chocolateMilkshake(21,"it is chocolate ice cream."),
    fries(23,"the proper way to eat a potato"),
    McBurger(24,"no connection to a clown"),
    McTriple(25,"it only has two patties...just kidding");

    
    
    public static void saveProdReport() {
    }
    
    
    private final int productId;
    private final String prodDesc;
    
    private Ingredients[] ingredients;
    private Level level;
   
      public int getProductId() {
        return productId;
    }

    public String getProdDesc () {
        return prodDesc;
    }

    public Ingredients[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredients[] ingredients) {
        this.ingredients = ingredients;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
   
     Products(int productId ,String prodDesc) {
        this.productId= productId;
        this.prodDesc= prodDesc;
    }
  public static void saveProdReport(EnumSet<Products> prodList, String fileLoc) throws GameControlException, IOException {
            PrintWriter out = null;
                fileLoc = "C:\\Users\\Logan\\Documents\\prodReport.txt";
        try{
                out = new PrintWriter(fileLoc);
                out.println("\n \n              Product Report                ");
                out.printf("%n-20s%10s%10s","Product ID","Product Description");
                out.printf("%n-20s%10s%10s","-------------","------------------");
                for(Products prod : EnumSet.allOf(Products.class))
                {
                out.printf("%n-20s%10s%10s",prod.getProductId(),prod.getProdDesc());
                }
//                
                out.flush();
                
//              
        }
        
        catch(Exception ex){
            throw new GameControlException(ex.getMessage());
    
        }
    }
}
    
    
   
      
