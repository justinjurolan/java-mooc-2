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

public class Abbreviations {
    
    private HashMap<String,String> abbreviation;
    
    public Abbreviations () {
        this.abbreviation = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        String key = sanitizedString(abbreviation);
        this.abbreviation.put(key, explanation);
    }
    
    public String sanitizedString(String str) {
        
        if (str == null) {
            return "";
        }
        
        
        str = str.toLowerCase();
        return str.trim();
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        String key = sanitizedString(abbreviation);
        if (this.abbreviation.containsKey(key)) {
            return true;
        }
        return false;
    }
    
    public String findExplanationFor(String abbreviation) {
        abbreviation = sanitizedString(abbreviation);
        return this.abbreviation.get(abbreviation);
    }
    
    
}
