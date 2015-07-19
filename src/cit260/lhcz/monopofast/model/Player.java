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
public class Player implements Serializable {

    private String name;

   
    private Location location = null;

    private double skillPoints = 10.0;

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public double getSkillPoints() {
        return skillPoints;
    }

    public void setSkillPoints(double skillPoints) {
        this.skillPoints = skillPoints;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name +  ", location=" + location + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.name);
        hash = 43 * hash + Objects.hashCode(this.location);
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
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        return true;
    }

}