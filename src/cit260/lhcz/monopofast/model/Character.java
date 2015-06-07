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
public class Character implements Serializable {
    private String characterName;
    private int characterId;
    private String attribute;

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public int getCharacterId() {
        return characterId;
    }

    public void setCharacterId(int characterId) {
        this.characterId = characterId;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.characterName);
        hash = 67 * hash + this.characterId;
        hash = 67 * hash + Objects.hashCode(this.attribute);
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
        final Character other = (Character) obj;
        if (!Objects.equals(this.characterName, other.characterName)) {
            return false;
        }
        if (this.characterId != other.characterId) {
            return false;
        }
        if (!Objects.equals(this.attribute, other.attribute)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Character{" + "characterName=" + characterName + ", characterId=" + characterId + ", attribute=" + attribute + '}';
    }

    public Character() {
    }

    
}
