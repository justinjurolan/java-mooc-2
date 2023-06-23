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

import java.util.ArrayList;
import java.util.List;
public class AverageSensor implements Sensor {
    private ArrayList<Sensor> listOfSensors;
    private List<Integer> listOfReadings;
    
    public AverageSensor() {
        this.listOfSensors = new ArrayList<>();
        this.listOfReadings = new ArrayList<>();
        
    }
    
    public void addSensor(Sensor toAdd) {
        this.listOfSensors.add(toAdd);
    }
    
    @Override
    public void setOn() {
        this.listOfSensors.stream().forEach(s -> s.setOn());
        
    }
    
    @Override
    public void setOff() {
        this.listOfSensors.stream().forEach(s -> s.setOff());
       
    }
    
    @Override
    public int read() {
        if (this.listOfSensors.isEmpty()) {
            throw new IllegalStateException("Average sensor is off or sensor list is empty");
        }
        int sum = 0;
        for (Sensor s : this.listOfSensors) {
            sum += s.read();
        }
        this.listOfReadings.add(sum / this.listOfSensors.size());
        return sum / this.listOfSensors.size();
    }
    
    @Override
    public boolean isOn() {
        boolean sensorState = false;
        
        for (Sensor s : this.listOfSensors) {
            if (s.isOn() == true) {
                sensorState = true;
            } else {
                sensorState = false;
            }
        }
        
        return sensorState;
    }
    
    public List<Integer> readings() {
        return this.listOfReadings;
    }
    
    
}
