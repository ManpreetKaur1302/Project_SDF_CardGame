/**
 * SYST 17796 Project Summer 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * 
 */
public abstract class Card 
{
    protected int cardValue;
    
    public Card(int value){
        cardValue = value;
    }
 
    public abstract int getCardValue();
    public abstract void setCardValue(int value);
    
    @Override
    public abstract String toString();
    
}

