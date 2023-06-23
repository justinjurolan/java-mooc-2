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
import java.util.Random;
public class TemperatureSensor implements Sensor {
    
    private boolean sensorState;
    private int value;
    
    public TemperatureSensor() {
        this.sensorState = false;
        this.value = 0;
    }
    
    public int getTempValue() {
        return this.value;
    }
    
    @Override
    public int read() {
        
        if (this.sensorState == false) {
            throw new IllegalStateException("Sensor must be on");
        }
        
        Random rnd = new Random();
        int upperbound  = rnd.nextInt(61) - 30;
        this.value = upperbound;
        return upperbound;
    }
    
    @Override
    public void setOn() {
        this.sensorState = true;
    }
    
    @Override
    public void setOff() {
        this.sensorState = false;
    }
    
    @Override
    public boolean isOn() {
        return this.sensorState;
    }
}
