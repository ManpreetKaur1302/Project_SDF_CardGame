
package ca.sheridancollege.project;

import java.util.Comparator;

/**
 *
 * @author manni
 */
public class CardComparator implements Comparator{
    public int compare(Object o1, Object o2){
        CardChild card1 = (CardChild)o1;
        CardChild card2 = (CardChild)o2;
        
        if(card1.getCardValue() == card2.getCardValue()){
            return 0;
        }
        else if(card1.getCardValue() > card2.getCardValue()){
            return 1;
        }
        else{
            return -1;
        }
    }
}

