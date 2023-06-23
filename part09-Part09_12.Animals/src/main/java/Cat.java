/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justin
 */


public class Cat extends Animal implements NoiseCapable  {
    private String catName;
    
    public Cat() {
        super("Cat");
        this.catName = "Cat";
    }
    
    public Cat(String name) {
        super(name);
        this.catName = name;
    }
    
    public void purr() {
        System.out.println(this.catName + " purrs");
    }
    
    public void makeNoise() {
        this.purr();
    }
}
