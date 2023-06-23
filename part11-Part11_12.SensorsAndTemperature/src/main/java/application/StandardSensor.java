/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author justin
 */
public class StandardSensor implements Sensor {
    
    private int statusValue;
    
    public StandardSensor(int value) {
        this.statusValue = value;
    }
    
    public int getSensorValue() {
        return this.statusValue;
    }
    
    @Override
    public int read() {
        return this.statusValue;
    }
    
    @Override
    public void setOn() {
        
    }
    
    @Override
    public void setOff() {
        
    }
    
    @Override
    public boolean isOn() {
        return true;
    }
    
    
}
