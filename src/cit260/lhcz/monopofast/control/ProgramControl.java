/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.control;

import cit260.lhcz.monopofast.model.Player;
import monopofast.Monopofast;

/**
 *
 * @author Logan
 */
public class ProgramControl {

    private final static ChallengeControl challengeControl = new ChallengeControl();
    private final static GameControl gameControl = new GameControl();
    private final static ProductControl productControl = new ProductControl();

    public static Player createPlayer(String playerName) {
        if (playerName == null) {
            return null;
        }
        Player player = new Player();
        player.setName(playerName);

        Monopofast.setPlayer(player);

        return player;
    }

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
