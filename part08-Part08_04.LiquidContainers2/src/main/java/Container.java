/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justin
 */
public class Container {
    private int amount;
    
    public Container() {
        this.amount = 0;
    }
    
    @Override
    public String toString() {
        return this.amount + "/100";
    }
    
    public int contains() {
        return this.amount;
    }
    
    public void add(int amount) {
        
        if (this.amount + amount >= 100) {
            this.amount = 100;
        }
        
        if (amount > 0 && amount + this.amount <= 100) {
            this.amount += amount;
        }
        
    }
    
    public void move(Container c, int amount) {
        
        if (amount + this.amount >= 100) {
            this.amount = 100;
        }
        
        
        if (amount > 0 && amount + this.amount <= 100 && amount >= c.amount) {
            this.add(c.contains());
            c.amount = 0;
        }
        
        if (amount > 0 && amount + this.amount <= 100 && amount <= c.amount) {
            this.amount += amount;
            c.amount -= amount;
        }
    }
    
    
    public void remove(int amount) {
        
        if (amount > 0 && amount > this.amount) {
            this.amount = 0;
        }
        
        if (amount > 0 && amount <= this.amount) {
            this.amount -= amount;
        }
        
    }
}
