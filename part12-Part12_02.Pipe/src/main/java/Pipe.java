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
public class Pipe<T> {
    private ArrayList<T> pipes;
    
    public Pipe() {
        this.pipes = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        this.pipes.add(value);
    }
    
    public T takeFromPipe() {
        
        if (this.pipes.isEmpty()) {
            return null;
        }
        return this.pipes.remove(0);
    }
    
    public boolean isInPipe() {
        if (!this.pipes.isEmpty()) {
            return true;
        }
        
        return false;
    }
}
