/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card_game;

import java.util.Random;

/**
 *
 * @author manav
 */
public class CardHandGenerator {

    public static Card[] generateHand(int numCards) {
//create an array to hold 7 cards
        Card[] hand = new Card[numCards];

//we will use random to generate suit and values
        Random random = new Random();

        for (int i = 0; i < hand.length; i++) {

            Card.Value value = Card.Value.values()[random.nextInt(13)];
            Card.Suit suit = Card.Suit.values()[random.nextInt(4)];

            Card card = new Card(value, suit);
            hand[i] = card;
        }//end of for
        return hand;
    }

}
