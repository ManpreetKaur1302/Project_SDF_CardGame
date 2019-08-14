/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

public class CardChild extends Card{
    
    public CardChild(int value){
        super(value);
    }
    
    @Override
    public int getCardValue(){
        return this.cardValue;
    }
    
    @Override
    public void setCardValue(int value){
        this.cardValue = value;
    }
    
    @Override
    public String toString(){
        String[] ones = {"one", "two", "three", "four", "five", "six", "seven", 
            "eight", "nine"};
        String[] tens = {"eleven", "twelve", "thirteen", "fourteen", "fifteen",
            "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] multipleOfTens = {"ten", "twenty", "thirty"};
        
        if(this.cardValue < 10){
            return ones[this.cardValue - 1];
        }
        else if(this.cardValue < 20 && this.cardValue > 10){
            return tens[this.cardValue % 10 - 1];
        }
        else if(this.cardValue % 10 == 0){
            return multipleOfTens[this.cardValue / 10 - 1];
        }
        else{
            String first = multipleOfTens[this.cardValue / 10 - 1];
            String second = ones[this.cardValue % 10 - 1];
            
            return first + "-" + second;
        }
        
    }
}

