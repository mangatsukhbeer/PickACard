/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifier Sukhbeer Singh Mangat 
 * Student Number : 991622133
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Card luckyCard = new Card(); //Adding hardcoded luckyCard object
        luckyCard.setValue(3); // setting the value of lucky card to 3
        luckyCard.setSuit("Hearts"); // setting the suit to hearts
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(1 + (int) (Math.random() * 13)); //setting a random value between 1 and 13 for card c
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]); // setting a random suit for card c
            magicHand[i] = c; //assigning card c's value and suit to magicHand array index i
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        //insert code to ask the user for Card value and suit, create their card
        /* Scanner input = new Scanner(System.in); // Scanner object input to collect user input
        System.out.print("Pick a Card\nPlease enter a random card number between 1-13 :"); // prompt for the user to enter a random number between 1-13
        int cardNumber = input.nextInt(); // user entry saved in integer cardNumber
        while(cardNumber < 1 || cardNumber > 13){ // user entry validation, if the number is not between 1-13, user will get a prompt to re-enter it
            System.out.print("Enter a Valid number (1-13) :"); 
            cardNumber = input.nextInt();
        }
        //code to get the card suit 
        System.out.print("Please choose a Suit\nEnter the Number\n"
                + "0 for Hearts\n"
                + "1 for Diamonds\n"
                + "2 for Spades\n"
                + "3 for Clubs\n:: "); // prompt asking user to enter a number for the suit
        int cardSuit = input.nextInt(); // the number entered by the user then assigned to integer cardSuit
        while(cardSuit < 0 || cardSuit > 3){ //cardSuit validation to make sure user has entered a valid suit number
            System.out.print("Enter a Valid number for The Suit\n"
                    + "0 for Hearts\n"
                    + "1 for Diamonds\n"
                    + "2 for Spades\n"
                    + "3 for Clubs\n:: ");
            cardSuit = input.nextInt();
        }
        Card userCard = new Card(); // new userCard object created to store user entry
        userCard.setSuit(userCard.SUITS[cardSuit]); // userCard Suit set to user's entered suit
        userCard.setValue(cardNumber); // userCard value set to user's preferred card number */
        // and search magicHand here
        int found = 0; // integer found to confirm the result of the search
        for(int i = 0; i < magicHand.length && found == 0;i++){
            if(magicHand[i].getValue() == luckyCard.getValue()){ // if the luckyCard object holds the same Value as one of the magicCard array card value's
                if(magicHand[i].getSuit().equals(luckyCard.getSuit())){ //if any of the objects in magicCard array has the same card value as luckyCard the Suit is checked
                    found = 1; // if the suit for both card matches integer found's value is changed
                }
            }
        }
        //Then report the result here
        if(found == 1){ // if found ==1 means the value of the luckyCard is in the random 7 cards in the magicHand
            System.out.println("Winner!!!!\nThe lucky Card : " + luckyCard.getValue() + " of " + luckyCard.getSuit() +" is in the Magic Hand");
        }
        else{ // else the card is not found in the magicHand
            System.out.println("Your card is NOT in the Magic Hand");
        }
    }
    
}
