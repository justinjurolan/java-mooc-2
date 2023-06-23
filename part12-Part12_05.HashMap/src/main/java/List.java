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
    private Type[] list;
    private int listIndex;
    
    public List() {
        this.list = (Type[]) new Object[10];
        this.listIndex = 0;
    }
    
    public void add(Type value) {
        // grow the list if list size = listValue;
        if (this.list.length == this.listIndex) {
            grow();
        }
        
        this.list[this.listIndex] = value;
        this.listIndex++;
    }
    
    private void grow() {
        int newSize = this.list.length + this.list.length / 2;
        Type[] newArray = (Type[]) new Object[newSize];
        for (int i = 0; i < this.list.length; i++) {
            newArray[i] = this.list[i];
        }
        
        this.list = newArray;
    }
    
    public boolean contains(Type value) {
       return indexOfValue(value) >= 0;
    }
    
    public int size() {
        return this.listIndex;
    }
    
    public int indexOfValue(Type value) {
        for (int i = 0; i < this.listIndex; i++) {
            if (this.list[i].equals(value)) {
                return i;
            }
        }
        
        return -1;
    }
    
    public void remove(Type value) {
        int indexValue = indexOfValue(value);
        if (indexValue < 0) {
            return;
        }
        
        moveToTheLeft(indexValue);
        this.listIndex--;
        
    }
    
    
    private void moveToTheLeft(int fromIdx) {
        for (int i = fromIdx; i < this.listIndex - 1; i++) {
            this.list[i] = this.list[i + 1];
        }
    }
    
    public Type value(int index) {
        
        if (index < 0 || index >= this.listIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.listIndex + "]");
        } 
        
        return this.list[index];
    }
    
}
