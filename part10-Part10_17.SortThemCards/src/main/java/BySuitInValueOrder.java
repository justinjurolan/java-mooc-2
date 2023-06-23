/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justin
 */

import java.util.Comparator;
public class BySuitInValueOrder implements Comparator<Card> {
    @Override
    public int compare(Card c1, Card c2) {
        int card = 0;
        int suit = c1.getSuit().ordinal() - c2.getSuit().ordinal();
        if (suit == 0) {
            card = c1.getValue() - c2.getValue();
        }
        return card + suit;
    }
}
