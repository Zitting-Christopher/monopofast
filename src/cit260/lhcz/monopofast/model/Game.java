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
public class Game implements Serializable {
    private String gameName;
    private int gameId;
    private String lastSaveDateTime;
    private int score;
    private int lastSublevel;
    
    private Player[] player;
    private Map map;
    
    
    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getLastSaveDateTime() {
        return lastSaveDateTime;
    }

    public void setLastSaveDateTime(String lastSaveDateTime) {
        this.lastSaveDateTime = lastSaveDateTime;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLastSublevel() {
        return lastSublevel;
    }

    public void setLastSublevel(int lastSublevel) {
        this.lastSublevel = lastSublevel;
    }

    public Player[] getPlayer() {
        return player;
    }

    public void setPlayer(Player[] player) {
        this.player = player;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

     
    
    @Override
    public String toString() {
        return "Game{" + "gameName=" + gameName + ", gameId=" + gameId + ", lastSaveDateTime=" + lastSaveDateTime + ", score=" + score + ", lastSublevel=" + lastSublevel + '}';
    }
    

    
    public Game() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.gameName);
        hash = 53 * hash + this.gameId;
        hash = 53 * hash + Objects.hashCode(this.lastSaveDateTime);
        hash = 53 * hash + this.score;
        hash = 53 * hash + this.lastSublevel;
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.gameName, other.gameName)) {
            return false;
        }
        if (!Objects.equals(this.gameId, other.gameId)) {
            return false;
        }
        if (!Objects.equals(this.lastSaveDateTime, other.lastSaveDateTime)) {
            return false;
        }
        if (this.score != other.score) {
            return false;
        }
        if (!Objects.equals(this.lastSublevel, other.lastSublevel)) {
            return false;
        }
        return true;
    }
    
    
    
}
