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
    private double recordTime;
    private double maxTime;
    private int subLevelId;

    public int getSubLevelId() {
        return subLevelId;
    }

    public void setSubLevelId(int subLevelId) {
        this.subLevelId = subLevelId;
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
        hash = 23 * hash + this.subLevelId;
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
        if (this.subLevelId != other.subLevelId) {
            return false;
        }
        if (Double.doubleToLongBits(this.recordTime) != Double.doubleToLongBits(other.recordTime)) {
            return false;
        }
        return Double.doubleToLongBits(this.maxTime) == Double.doubleToLongBits(other.maxTime);
    }

    @Override
    public String toString() {
        return "SubLevel{" + "subLevelId=" + subLevelId + ", recordTime=" + recordTime + ", maxTime=" + maxTime + '}';
    }

    public SubLevel() {
    }
    
    
}
