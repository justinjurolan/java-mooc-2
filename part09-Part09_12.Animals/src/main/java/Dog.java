/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justin
 */
public class Dog extends Animal implements NoiseCapable {
    private String dogName;
    
    public Dog() {
        super("Dog");
        this.dogName = "Dog";
    }
    
    public Dog(String name) {
        super(name);
        this.dogName = name;
    }
    
    public void bark() {
        System.out.println(this.dogName + " barks");
    }
    
    public void makeNoise() {
        this.bark();
    }
}
