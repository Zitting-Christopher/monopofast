/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.model;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Christopher
 */
public class Player implements Serializable{
    private String playerName;
    private int playerId;
    
    private Game game;
    private Character[] character;
    private World[] world;
    private Level[] level;
    private SubLevel[] sublevel[];

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Character[] getCharacter() {
        return character;
    }

    public void setCharacter(Character[] character) {
        this.character = character;
    }

    public World[] getWorld() {
        return world;
    }

    public void setWorld(World[] world) {
        this.world = world;
    }

    public Level[] getLevel() {
        return level;
    }

    public void setLevel(Level[] level) {
        this.level = level;
    }

    public SubLevel[][] getSublevel() {
        return sublevel;
    }

    public void setSublevel(SubLevel[][] sublevel) {
        this.sublevel = sublevel;
    }
    
    @Override
    public String toString() {
        return "Player{" + "playerName=" + playerName + ", playerId=" + playerId + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.playerName);
        hash = 83 * hash + this.playerId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.playerName, other.playerName)) {
            return false;
        }
        if (this.playerId != other.playerId) {
            return false;
        }
        return true;
    }
    
    

    public Player() {
    }
    
    
    
}
