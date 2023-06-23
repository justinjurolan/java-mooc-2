/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justin
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
public class Warehouse {
   
    private Map<String,Integer> warehouse;
    private Map<String,Integer> stock;
    
    public Warehouse() {
        this.warehouse = new HashMap<>();
        this.stock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.warehouse.put(product, price);
        this.stock.put(product, stock);
    }
    
    public int price(String product) {
        
        if (!this.warehouse.containsKey(product)) {
            return -99;
        }
        
       return this.warehouse.get(product);
    }
    
    public int stock(String product) {
        if (!this.warehouse.containsKey(product)) {
            return 0;
        } 
        return this.stock.get(product);
    }
    
    public boolean take(String product) {
        if (!this.warehouse.containsKey(product)) {
            return false;
        }
        
        if (this.stock.get(product) > 0) {
            this.stock.replace(product, this.stock.get(product) - 1);
            return true;
        }
        
        return false;
    }
    
    public Set<String> products() {
        Set<String> products = new HashSet<>();
        
        for (String i : this.warehouse.keySet()) {
            products.add(i);
        }
        
        return products;
    }
    
    
    
}
