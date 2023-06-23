/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justin
 */


public class Hideout<T> {
    private T element;
    
    
    public Hideout() {
        this.element = null;
    }
    
    public void putIntoHideout(T toHide) {
        this.element = toHide;
    }
    
    public T takeFromHideout() {
        T sample = this.element;
        this.element = null;
        return sample;
    }
    
    public boolean isInHideout() {
        if (this.element != null) {
            return true;
        }
        return false;
    }
     
}
