/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package card_game;

import card_game.Card.Suit;
import card_game.Card.Value;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author manav
 */
public class Card_game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Card[] hand = new Card[7];
//
//        Random random = new Random();
//
//        for (int i = 0; i < hand.length; i++) {
//            Value value = Card.Value.values()[random.nextInt(13)];
//            Suit suit = Card.Suit.values()[random.nextInt(4)];
//
//            Card card = new Card(value, suit);
//            hand[i] = card;
//        }

         
        Card[]hand=CardGenerator.generateHand(7);
        System.out.println("Generated cards as follows");
        for (Card card : hand) {
            System.out.println(card.getValue() + ":" + card.getSuit());
        }
        System.out.println("Enter a suit for the guess in int:");
        for (int i = 0; i < Card.Suit.values().length; i++) {
            System.out.println(i + ":" + Card.Suit.values()[i]);
        }
        Scanner input = new Scanner(System.in);
        int suitPos = input.nextInt();

        System.out.println("Enter a value for the guess in int:");
        for (int i = 0; i < Card.Value.values().length; i++) {
            System.out.println(i + ":" + Card.Value.values()[i]);
        }
        int valuePos=input.nextInt();

        Card userGuess = new Card(Card.Value.values()[valuePos], Card.Suit.values()[suitPos]);

        boolean match = false;

        for (Card card : hand) {
            if (card.getValue() == userGuess.getValue() && card.getSuit()==userGuess.getSuit()) {
                match = true;
                break;
            }
        }//end of for

        if (match) {
            System.out.println(" You guessed it right");
        } else {
            System.out.println(" Try again ");
        }

    }

}
