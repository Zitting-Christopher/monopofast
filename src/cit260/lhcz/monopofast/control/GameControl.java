/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.control;

import cit260.lhcz.monopofast.model.*;
import monopofast.Monopofast;
import exception.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import cit260.lhcz.monopofast.model.Game;

/**
 *
 * @author Logan
 */
public class GameControl {

    public static void createNewGame(Player player) {
        Game game = new Game();
        Monopofast.setCurrentGame(game);

        game.setPlayer(player);

        Map map = MapControl.createMap();
        game.setMap(map);

        player.setLocation(map.getLocations()[0][0]);

    }

    public static void saveGame(Game currentGame, String filePath) throws GameControlException {
        try (FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);

            output.writeObject(currentGame);
        } catch (IOException e) {
            throw new GameControlException(e.getMessage());
        }

    }
public static void loadGame(String filePath) throws GameControlException {
   Game game = null;

        try (FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream output = new ObjectInputStream(fips);

            game = (Game) output.readObject();
        } catch (FileNotFoundException fnfe) {
            throw new GameControlException(fnfe.getMessage());
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }

       Monopofast.setCurrentGame(game);
   
}
public static Player createPlayer(String playersName) throws GameControlException {

        if (playersName == null || playersName.length() < 2) {
            throw new GameControlException("Player's name is not valid."
                    + " Please enter a name with atleast"
                    + " two characters in it.");
}
        Player player = new Player();
        player.setName(playersName);

        Monopofast.setPlayer(player);
        return player;
}
}