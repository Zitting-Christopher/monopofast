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
 * @author Christopher
 * @author Logan
 */
public enum Character implements Serializable {

    Vivian(0, "The Bacon Lady"),
    Hardy(1, "The Horse King"),
    Jackie(2, "The Vixen"),
    Maria(3, "The Cake Queen"),
    Ron(4, "The Wizard");

    
    private final int charId;
    private final String charDesc;

    private World world;

    public int getCharId() {
        return charId;
    }

    public String getCharDesc() {
        return charDesc;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    Character(int charId, String charDesc) {
        this.charId = charId;
        this.charDesc = charDesc;
    }

    public static void saveCharReport(EnumSet<Character> charaList, String fileLoc) throws GameControlException, IOException {
        PrintWriter out = null;
        fileLoc = "CharReport.txt";
        try {
            out = new PrintWriter(fileLoc);
            out.println("\n \n              Character Report                ");
            out.printf("%n-20s%10s%10s", "Character ID", "Character Description");
            out.printf("%n-20s%10s%10s", "-------------", "------------------");
            for (Character cha : EnumSet.allOf(Character.class)) {
                out.printf("%n-20s%10s%10s", cha.getCharId(), cha.getCharDesc());
            }
//                
            out.flush();

//              
        } catch (Exception ex) {
            throw new GameControlException(ex.getMessage());

        }
    }
}
