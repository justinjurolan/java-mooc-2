/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justin
 */
public class CD implements Packable {
    private String artist;
    private String cdName;
    private int year;
    private double weight;
    
    public CD (String artist, String cdName, int year) {
        this.artist = artist;
        this.cdName = cdName;
        this.year = year;
        this.weight = 0.1;
    }

    public String getArtist() {
        return artist;
    }

    public String getCdName() {
        return cdName;
    }

    public int getYear() {
        return year;
    }

    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.cdName + " (" + this.year + ")";
    }
    
    
    
}
