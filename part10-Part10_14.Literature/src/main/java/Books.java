/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justin
 */
public class Books {
    private String name;
    private int age;
    
    public Books(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getBookName() {
        return this.name;
    }
    
    public int getBookRecommendedAge() {
        return this.age;
    }
    
    @Override
    public String toString() {
        return this.name + " (recommended for " + this.age + " year-olds or older)"; 
    }
}
