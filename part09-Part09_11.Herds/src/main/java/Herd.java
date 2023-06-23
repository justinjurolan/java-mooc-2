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
public class Herd implements Movable {
    
    private ArrayList<Movable> herd = new ArrayList<>();
    
    public String toString() {
        String output = "";
        for (Movable m : this.herd) {
            output += m.toString() + "\n";
        }
        return output;
    }
    
    public void addToHerd(Movable movable) {
       this.herd.add(movable);
    }
    
    public void move(int dx, int dy) {
        for (Movable m : this.herd) {
            m.move(dx, dy);
        }
    }
}
