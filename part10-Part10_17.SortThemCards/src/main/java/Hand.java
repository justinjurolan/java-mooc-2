/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justin
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> cards;
    
    public Hand() {
        this.cards = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.cards.add(card);
    }
    
    public void print() {
        this.cards.stream().forEach(c -> System.out.println(c));
    }
    
    public void sort() {
        Collections.sort(this.cards);
    }
    
    public int sumOfValues() {
        int sum = 0;
        for (Card c : this.cards) {
            sum += c.getValue();
        }
        return sum;
    }
    
    
    @Override
    public int compareTo(Hand newHand) {
        if (this.sumOfValues() == newHand.sumOfValues()) {
            return 0;
        } else if (this.sumOfValues() > newHand.sumOfValues()) {
            return 1;
        } else {
            return -1;
        }
    }
    
    public void sortBySuit() {
        Collections.sort(this.cards, new BySuitInValueOrder());
    }
    
}
