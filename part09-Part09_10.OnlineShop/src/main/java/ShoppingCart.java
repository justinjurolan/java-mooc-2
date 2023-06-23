/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justin
 */
import java.util.List;
import java.util.ArrayList;
public class ShoppingCart {
    private List<Item> cart;
    
    public ShoppingCart() {
        this.cart = new ArrayList<>();
    }
    
    public void add(String product, int price) {
        
        if (this.cart.contains(new Item(product,1,price))) {
            for (Item i : this.cart) {
                if (i.getProduct().equals(product)) {
                    i.increaseQuantity();
                }
            }
        } else {
            this.cart.add(new Item(product,1,price));
        }   
    }
    
    public int price() {
        int total = 0;
        for (Item i : this.cart) {
            total += i.price();
        }
        return total;
    }
    
    public void print() {
        for (Item i : this.cart) {
            System.out.println(i);
        }
    }
}
