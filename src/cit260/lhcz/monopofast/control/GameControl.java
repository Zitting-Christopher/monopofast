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

/**
 *
 * @author Logan
 */
public class GameControl {

    public static void createNewGame(Player player) throws MapControlException {
        Game game = new Game();
        Monopofast.setCurrentGame(game);

        game.setPlayer(player);

        Map map = MapControl.createMap();
        game.setMap(map);

        MapControl.startAtLocation(map);
    }

    public static void saveGame(Game currentGame, String filePath)
            throws GameControlException {
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
            ObjectInputStream input = new ObjectInputStream(fips);
            game = (Game) input.readObject();
            Monopofast.setCurrentGame(game);
        } catch (FileNotFoundException fnfe) {
            throw new GameControlException(fnfe.getMessage());
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void getLoadGame(String filePath) {

    }

    private Player game;
    private Player player;

    public Player getGame() {
        return player;
    }

    public void setGame(Player player) {
        this.player = game;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public static Player createPlayer(String playerName) {
        if (playerName == null) {
            return null;
        }
        Player player = new Player();
        player.setPlayerName(playerName);

        Monopofast.setPlayer(player);

        return player;
    }

    public static void moveCharacterToLocation(Player player, int row, int column)
            throws MapControlException {
        Map map = Monopofast.getCurrentGame().getMap();
        int newRow = row - 1;
        int newColumn = column - 1;

        if (newRow < 0 || newRow >= map.getRowCount() || newColumn < 0 || newColumn >= map.getColumnCount()) {
            throw new MapControlException("Cannot move to " + row + "," + column
                    + "because that location is out of the map boundaries.");
        }
    }

}
