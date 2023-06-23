/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justin
 */
public abstract class Animal {
    
    private String animalName;
    
    public Animal(String animalName) {
        this.animalName = animalName;
    }
    
    public String getName() {
        return this.animalName;
    }
    
    public void eat() {
        System.out.println(this.animalName + " eats");
    }
    
    public void sleep() {
        System.out.println(this.animalName + " sleeps");
    }
}
