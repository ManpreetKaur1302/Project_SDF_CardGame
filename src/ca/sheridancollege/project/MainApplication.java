
package ca.sheridancollege.project;

/**
 *
 * @author manni
 */
public class MainApplication {

    public static void main(String[] args) {
        boolean playAgain;
        do{
            System.out.println("Welcome to No Thanks Card Game.");
            NoThanks noThanks = new NoThanks("No Thanks");
            noThanks.play();
            noThanks.declareWinner();
            playAgain = noThanks.playAgain();
            System.out.println();
        }while(playAgain);
        
        System.out.println("Thanks for playing!");
    }

}

