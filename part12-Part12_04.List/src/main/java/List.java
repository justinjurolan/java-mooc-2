/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justin
 */
public class List<Type> {
    
    private Type[] values;
    private int listSize;
    
    public List() {
        this.values = (Type[]) new Object[10];
        this.listSize = 0;
    }
    
    private void growListSize() {
        int newSize = this.values.length + this.values.length / 2;
        Type[] newValues = (Type[]) new Object[newSize];
        for (int i = 0; i < this.values.length; i++) {
            newValues[i] = this.values[i];
        }
        
        this.values = newValues;
    }
    
    public void add(Type value) {
        if (this.listSize == this.values.length) {
            growListSize();
        }
        
        this.values[this.listSize] = value;
        this.listSize++;
    }
    
    public boolean contains (Type value) {
        return findIndexValue(value) >= 0;
    }
    
    public int findIndexValue(Type value) {
        
        for (int i = 0; i < this.listSize; i++) {
            if (this.values[i].equals(value)) {
                return i;
            }
        }
        
        return -1;
    }
    
    public Type get(int index) {
        if (index < 0 || index >= this.listSize) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.listSize + "]");
        }
        
        return this.values[index];
        
    }
    
    private void shiftIndexValueToLeft(int fromIndex) {
        for (int i = fromIndex; i < this.listSize - 1; i++) {
            this.values[i] = this.values[i + 1];
        }
    }
    
    public void remove (Type value) {
        int indexValue = findIndexValue(value);
        
        if (indexValue < 0) {
            return; // not found;
        }
        
        shiftIndexValueToLeft(indexValue);
        this.listSize--;
    }
    
    public int size() {
        return this.listSize;
    }
}
