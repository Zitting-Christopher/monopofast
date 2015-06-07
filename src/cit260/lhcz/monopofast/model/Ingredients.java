/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.lhcz.monopofast.model;
import java.io.Serializable;
/**
 *
 * @author Christopher
 */
import java.util.Objects;/**
 *
 * @author Christopher
 */
public class Ingredients implements Serializable {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + this.id;
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
        final Ingredients other = (Ingredients) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ingredients{" + "name=" + name + ", id=" + id + '}';
    }

    public Ingredients() {
    }

    public void setIngredientName(String cola) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setIngredientId(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
