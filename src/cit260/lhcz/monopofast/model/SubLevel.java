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
public class SubLevel {
    private int id;
    private double recordTime;
    private double maxTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(double recordTime) {
        this.recordTime = recordTime;
    }

    public double getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(double maxTime) {
        this.maxTime = maxTime;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.id;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.recordTime) ^ (Double.doubleToLongBits(this.recordTime) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.maxTime) ^ (Double.doubleToLongBits(this.maxTime) >>> 32));
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
        final SubLevel other = (SubLevel) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.recordTime) != Double.doubleToLongBits(other.recordTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.maxTime) != Double.doubleToLongBits(other.maxTime)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SubLevel{" + "id=" + id + ", recordTime=" + recordTime + ", maxTime=" + maxTime + '}';
    }

    public SubLevel() {
    }
    
    
}
