/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.control;

/**
 *
 * @author Logan
 */
public final class Controls {
    
    private final static ChallengeControl challengeControl = new ChallengeControl();    
    private final static GameControl gameControl = new GameControl();    
    private final static ProductControl productControl = new ProductControl();
    

    public static ChallengeControl getChallengeControl() {
        return challengeControl;
    }

    public static GameControl getGameControl() {
        return gameControl;
    }

    public static ProductControl getProductControl() {
        return productControl;
    }
    
      
}