/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justin
 */
public class Person implements Saveable {
    private String name;
    private String address;
    
    public void load(String address) {
        System.out.println(address);
    }
    
    public void delete() {
        System.out.println("delete");
    }
    
    public void save() {
        System.out.println("save");
    }
}
