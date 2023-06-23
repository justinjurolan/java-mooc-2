/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justin
 */
public class Literacy implements Comparable<Literacy> {
    private String gender;
    private String country;
    private String year;
    private double literacyRate;
    
    
    public Literacy(String gender, String country, String year, double rate) {
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.literacyRate = rate;
    }
    
    public String getGender() {
        return this.gender;
    }
    
    public String getCountry() {
        return this.country;
    }
    
    public String getYear() {
        return this.year;
    }
    
    public double getLiteracyRate() {
        return this.literacyRate;
    }
    
    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.gender + ", " + this.literacyRate;
    }
    
    @Override
    public int compareTo(Literacy another) {
        if (this.literacyRate == another.getLiteracyRate()) {
            return 0;
        } else if (this.literacyRate > another.getLiteracyRate()) {
            return 1;
        } else {
            return -1;
        }
    }
}
