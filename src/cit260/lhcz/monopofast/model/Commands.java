/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.model;

import java.io.Serializable;

public enum Commands implements Serializable {

    //Create commands
    add(0, "add ingredients to a product", "add"),
    bake(1, "bake a product", "bake"),
    blend(2, "blend a beverage", "blend"),
    dispense(3, "dispense a beverage", "dispense"),
    frost(4, "frost a baked good", "frost"),
    move(5, "use to move oneself to another station", "move"),
    prepare(6, "prepare certain items", "prepare"),
    remove(7, "remove ingredients from a product", "remove"),
    serve(8, "serve a product", "serve");

    //Define variables
    private final int commId;
    private final String commDesc;
    private final String commKeyword;



    public int getCommId() {
        return commId;
    }

    public String getCommDesc() {
        return commDesc;
    }

    public String getCommKeyword() {
        return commKeyword;
    }

   
    Commands(int commId, String commDesc, String commKeyword) {
        this.commId = commId;
        this.commDesc = commDesc;
        this.commKeyword = commKeyword;

    }

}
