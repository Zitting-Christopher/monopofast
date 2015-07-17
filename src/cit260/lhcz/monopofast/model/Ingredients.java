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

    public static void saveIngrReport() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
 
    
    private final int ingrId;
    private final String ingrKeyword;
    
    private Products[] products;

    public Products[] getProducts() {
        return products;
    }

    public void setProducts(Products[] products) {
        this.products = products;
    }

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
    public static void saveIngrReport(EnumSet<Ingredients> ingrList, String fileLoc) throws GameControlException, IOException {
            PrintWriter out = null;
                fileLoc = "C:\\Users\\Logan\\Documents\\ingrReport.txt";
        try{
                out = new PrintWriter(fileLoc);
                out.println("\n \n              Inventory Report                ");
                out.printf("%n-20s%10s%10s","Ingredient ID","Ingredient Keyword");
                out.printf("%n-20s%10s%10s","-------------","------------------");
                for(Ingredients ingr : EnumSet.allOf(Ingredients.class))
                {
                out.printf("%n-20s%10s%10s",ingr.getIngrId(),ingr.getIngrKeyword());
                }
//                outFile.write(Ingredients<Ingredients[]> ingrList = Arrays.asList(ingrEnum));
                out.flush();
                
//                FileOutputStream fops = new FileOutputStream("C:\\IngrReport.txt")){
//            ObjectOutputStream output = new ObjectOutputStream(fops);
//            output.writeObject(Monopofast.getCurrentGame().getMap()
        }
        
        catch(Exception ex){
//            throw new GameControlException(ex.getMessage());
    System.out.println("error");
        }
    }
}
