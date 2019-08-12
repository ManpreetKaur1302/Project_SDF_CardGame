
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author manni
 */
public class PlayerChild extends Player{
    
    private GroupOfCards deck = new GroupOfCards(0);
    private int tokens = 11;
    
    public PlayerChild(String name){
        super(name);
    }
    
    public GroupOfCards getGroupOfCards(){
        return this.deck;
    }
    
    public void setGroupOfCards(ArrayList<Card> array){
        deck.setCards(array);
        deck.setSize(array.size());
    }
    
    public int getTokens(){
        return this.tokens;
    }
    
    public void setTokens(int value){
        this.tokens = value;
    }
    
    public boolean play(Card obj){
        Scanner input = new Scanner(System.in);
        System.out.print("Do you want to pick this card? (Y/N) ");
        String userDecision = input.nextLine();
        
        if(userDecision.toLowerCase().charAt(0) == 'y'){
            deck.addCard(obj);
            return true;
        }
        else{
            this.tokens--;
            if(tokens < 0){
                System.out.println("No tokens left to skip your turn.");  
                System.out.println("Card Picked.");
                deck.addCard(obj);
                return true;
            }
        }
        return false;
    }
}
 

