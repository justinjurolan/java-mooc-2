/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justin
 */

import java.util.ArrayList;
public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status) {
        this.history.add(status);
    }
    
    public void clear() {
        this.history.clear();
    }
    
    @Override
    public String toString() {
        return this.history.toString();
    }
    
    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0.0;
        }
        double d = this.history.get(0);
        for (Double val : this.history) {
            if (d < val) {
                d = val;
            }
        }
        return d;
    }
    
    public double minValue() {
        if (this.history.isEmpty()) {
            return 0.0;
        }
        double d = this.history.get(0);
        for (Double val : this.history) {
            if (d > val) {
                d = val;
            }
        }
        return d;
    }
    
    public double average() {
        if (this.history.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (Double d : this.history) {
            sum += d;
        }
        return sum / this.history.size();
    }
    
    
}
