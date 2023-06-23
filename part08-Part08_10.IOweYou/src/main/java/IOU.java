/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justin
 */
import java.util.HashMap;
import java.util.Objects;

public class IOU {
    
    private HashMap<String,Double> listOfdebts;
    
    
    public IOU () {
        this.listOfdebts = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        this.listOfdebts.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        return this.listOfdebts.getOrDefault(toWhom,0.0);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.listOfdebts);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final IOU other = (IOU) obj;
        if (!Objects.equals(this.listOfdebts, other.listOfdebts)) {
            return false;
        }
        return true;
    }
    
    
     
}
