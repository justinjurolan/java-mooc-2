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
public class Box implements Packable {
    private ArrayList<Packable> box;
    private double capacity;
    
    public Box (double maximumCapacity) {
        this.capacity = maximumCapacity;
        this.box = new ArrayList<>();
    }
    
    public double weight() {
        double total = 0.0;
        for (Packable p : this.box) {
            total += p.weight();
        }
        return total;
    }
    
    public void add(Packable item) {
        if (this.weight() <= this.capacity) {
            this.box.add(item);
            this.capacity -= this.weight();
        }
    }
    
    @Override
    public String toString() {
        return "Box: " + this.box.size() + " items, total weight " + this.weight() + " kg";
    }
    
    
}
