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
public class StorageFacility {
    
    private HashMap<String,ArrayList<String>> storage;
    
    
    public StorageFacility() {
        this.storage = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<>());
        this.storage.get(unit).add(item);
    }
    
    public ArrayList<String> contents (String storageUnit) {
        if (this.storage.containsKey(storageUnit)) {
            return this.storage.get(storageUnit);
        }
        return new ArrayList<>();
    }
    
    public void remove(String storageUnit, String item) {
        
        if (this.storage.get(storageUnit).size() == 1) {
            this.storage.remove(storageUnit);
        } else {
            this.storage.get(storageUnit).remove(item); 
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> namesOfStorage = new ArrayList<>();
        for (String s : this.storage.keySet()) {
            namesOfStorage.add(s);
        }
        return namesOfStorage;
    }
    
}
