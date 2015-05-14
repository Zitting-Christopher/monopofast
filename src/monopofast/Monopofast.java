/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopofast;

import cit260.lhcz.monopofast.model.Player;

/**
 *
 * @author Christopher
 */
public class Monopofast {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Player logan = new Player();
        
        logan.setName("Logan Hamson");
        logan.setId(1);
        
        String playerInfo = logan.toString();
        System.out.println(playerInfo);
    }
    
}
