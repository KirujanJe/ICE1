package exercise1;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 * Student: Kirujan Jegatheeswaran
 * Date: 2023-02-03
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7]; // an array is created with value of 7 for its index
        Random random = new Random(); // instantiate the random generator
        Scanner scanner = new Scanner(System.in);  //instantiate user input
        
         System.out.println("Pick a card from 1 to 10, 11 for jack, 12 for queen, 13 for king");
        int guessValue = scanner.nextInt(); // read the user's guess for the value of the card
        
        System.out.println("Pick the suit of your card: 1 for Hearts, 2 for Diamonds, 3 for Spades, 4 for Clubs");
        int guessSuit = scanner.nextInt() - 1; // read the user's guess for the suit of the card (0 to 3)
        
        for (int i = 0; i < hand.length; i++) { // for loop
            Card card = new Card(); // instantiate the new card object 
           card.setValue(random.nextInt(13) + 1); // set the value of the card using random generator (1 to 13)
           card.setSuit(Card.SUITS[random.nextInt(4)]); // set the suit of the card using random generator (0 to 3)
            hand[i] = card; // add the card to the hand
        } // end of this for loop
        // SUITS array is in the Card class


        // loop through the cards in the hand array to see if there's a match
        for (int i = 0; i < hand.length; i++) {
            if (hand[i].getValue() ==  guessValue && hand[i].getSuit() == guessSuit) {
                System.out.println("The guess was succesful"); // print the info of the card if the guess is successful
                return; // exit the program if the guess is successful
            } // end of for loop for array match checking
        }
        
        System.out.println("The card you picked is not in the hand."); // print this if the guess is not successful
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println("Hello, My Name is Kirujan Jegatheeswaran");
        
    
    }

}
