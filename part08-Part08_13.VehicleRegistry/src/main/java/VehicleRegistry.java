/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justin
 */
import java.util.HashMap;
import java.util.ArrayList;
public class VehicleRegistry {
    
    private HashMap<LicensePlate,String> registered;
    
    
    public VehicleRegistry() {
        this.registered = new HashMap<>();
        
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        
        if (!this.registered.containsKey(licensePlate)) {
            this.registered.put(licensePlate, owner);
            return true;
        }
        return false;
    }
    
    public String get(LicensePlate licensePlate) {
        if (this.registered.containsKey(licensePlate)) {
            return this.registered.get(licensePlate);
        }
        return null;
    }
    
    public boolean remove (LicensePlate licensePlate) {
        if (this.registered.containsKey(licensePlate)) {
            this.registered.remove(licensePlate);
            return true;
        }
        return false;
    }
    
    public void printLicensePlates() {
        for (LicensePlate lp : this.registered.keySet()) {
            System.out.println(lp);
        }
    }
    
    public void printOwners() {
        
        ArrayList<String> listOfOwners = new ArrayList<>();
        
        for (String lp : this.registered.values()) {
            if (!listOfOwners.contains(lp)) {
                listOfOwners.add(lp);
            }
        }
        
        for (String owners : listOfOwners) {
            System.out.println(owners);
        }
        
    }
    
     
    
    
    
    
}
