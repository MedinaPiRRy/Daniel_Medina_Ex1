
package exercise1;
import java.util.Scanner;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Card[] hand = new Card[7];
        Card card = new Card();
        
                for (int i = 0; i < hand.length; i++) {
            int a = (int) ((Math.random() * 13) + 1);
            hand[0].setValue(a);
            
            int b = (int) (Math.random() * 3);
            hand[0].setSuit(card.SUITS[b]);
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }

        System.out.println("Choose your card");
        System.out.println("Choose the value of your card");
        System.out.println("Remember that 1: ace, 11: jack, 12: queen, 13: king");
        Card user = new Card();
        int a1 = input.nextInt();
        user.setValue(a1);
        System.out.println("Choose yout card's suit");
        System.out.println("0: Hearts, 1: Diamonds, 2: Spades, 3: Clubs");
        int a2 = input.nextInt();
        user.setSuit(user.SUITS[a2]);
        for (int j = 0; j < hand.length; j++) {
            if (hand[j].getSuit().equals(user.getSuit()) && hand[j].getValue() == user.getValue()) {
            printInfo();
        } else  {
            System.out.println("There is no matches");
        }
        
        }
        
        printInfo();
        
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
     * I'm Done
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Daniel Medina");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Get into the IT team in my job");
        System.out.println("-- Finish school as soon as possible");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Reading");
        System.out.println("-- Watching movies");
        System.out.println("-- Listening to music");
        System.out.println("-- Create and play music");

        System.out.println();
        
    
    }

}
