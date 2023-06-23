/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;
/**
 *
 * @author justin
 */
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.nio.file.Paths;
import java.io.PrintWriter;

public class SaveableDictionary {
    private HashMap<String,String> dictionary;
    private String fileName;
    
    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
        this.fileName = "";
    }
    
    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.fileName = file;   
    }
    
    public boolean load() {
        try (Scanner scanner = new Scanner(Paths.get(this.fileName))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                String[] parts = row.split(":");
                this.add(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) { 
            return false;
        } 
    }
    
    public boolean save() {
        try (PrintWriter writer = new PrintWriter(this.fileName)){
            for (String key : this.dictionary.keySet()) {
                writer.println(this.printKeyandValue(key));
            }
            writer.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public String printKeyandValue(String key) {
        return key + ":" + this.dictionary.get(key);
    }
    
    public void add(String words, String translations) {
        if (!this.dictionary.containsKey(words)) {
            this.dictionary.putIfAbsent(words, translations);
        }
    }
    
    public String translate(String word) {
        String output = null;
        
       for (Entry<String,String> entry : this.dictionary.entrySet()) {
           if (entry.getKey().equals(word)) {
               output = entry.getValue();
           }
           
           if (entry.getValue().equals(word)) {
               output = entry.getKey();
           }
       }
        
        
        return output;
    }
    
    public void delete(String word) {
        Iterator iterator = this.dictionary.entrySet().iterator();
        
        while (iterator.hasNext()) {
            Map.Entry me = (Map.Entry) iterator.next();
            if (me.getKey().equals(word) || me.getValue().equals(word)) {
                iterator.remove();
            }
        }
        
    }
}
