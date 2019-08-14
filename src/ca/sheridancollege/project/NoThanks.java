package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NoThanks extends Game{
    private Scanner input = new Scanner(System.in);
    private GroupOfCards deck = new GroupOfCards(32);
    private ArrayList<GroupOfCards> playerCards = new ArrayList<>();
    private ArrayList<Integer> totalScores = new ArrayList<Integer>();
    private ArrayList<Integer> finalScores = new ArrayList<Integer>();

    public NoThanks(String name){
        super(name);
    }

    public void play(){
        int userInput = startUp();

        while(userInput != 1){
            System.out.println(getDescription());
            userInput = startUp();
        }

        createPlayers();
        try{
            generateCards();
        }catch(Exception ex){}

        int player = 0;
        for(int i = 0; i < 23; i++){
            int tokenCounter = 0;
            Card currentCard = deck.showCards().get(i);

            while(true){
                System.out.println("Card to be picked: " + currentCard.toString());
                System.out.println("Tokens on Table: " + tokenCounter);

                Player currentPlayer = getPlayers().get(player);
                System.out.println(currentPlayer.getPlayerID() + "'s turn:");
                System.out.println("Tokens left: " +
                        ((PlayerChild)currentPlayer).getTokens());
                System.out.println("Cards in hand: " +
                        Arrays.toString(((PlayerChild)currentPlayer).
                                getGroupOfCards().showCards().toArray()));

                boolean cardPicked = currentPlayer.play(currentCard);

                if(cardPicked){
                    System.out.println(currentPlayer.getPlayerID() +
                            " picked the card.");
                    playerCards.get(player).addCard(currentCard);
                    ((PlayerChild)currentPlayer).setTokens(
                            ((PlayerChild)currentPlayer).getTokens()
                                    + tokenCounter);
                    System.out.println();
                    System.out.println("------------------------------------------"
                            + "---------------------");
                    break;
                }
                else{
                    System.out.println(currentPlayer.getPlayerID() +
                            " skipped the turn at the cost of 1 token.");
                    tokenCounter++;
                    player++;
                    if(player == getPlayers().size()){
                        player = 0;
                    }
                }
                System.out.println();
                System.out.println("------------------------------------------"
                        + "---------------------");
                System.out.println();
            }
            System.out.println();
        }
    }


    public void declareWinner(){

        for(int i = 0; i < getPlayers().size(); i++){
            Player currentPlayer = getPlayers().get(i);
            System.out.println("Cards of " + currentPlayer.getPlayerID() + 
                    ": " + Arrays.toString(((PlayerChild)currentPlayer).
                    getGroupOfCards().showCards().toArray()));
        }   
        
        System.out.println();
        System.out.println("**********************************************"
                + "************************************");
        System.out.println();
        
        System.out.print("Calculating Results ");
        try{
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.print(".");
            System.out.println();
        }catch(Exception ex){};

        for(int i = 0; i < getPlayers().size(); i++){
            Collections.sort(((PlayerChild)getPlayers().get(i))
                    .getGroupOfCards().showCards(), new CardComparator());
        }

        for(int i = 0; i < getPlayers().size(); i++){
            int insert = calculateTotal(
                    ((PlayerChild)getPlayers().get(i)).getGroupOfCards()
                            .showCards()) - ((PlayerChild)getPlayers().get(i))
                    .getTokens();
            totalScores.add(insert);
            finalScores.add(insert);
        }

        int firstIndex = decideWinners();
        int topScorer = finalScores.get(firstIndex);
        String firstName = getPlayers().get(firstIndex).getPlayerID();
        int firstToken = ((PlayerChild)(getPlayers().get(firstIndex))).
                getTokens();
        finalScores.remove(firstIndex);
        totalScores.remove(firstIndex);
        getPlayers().remove(firstIndex);
        int secondIndex = decideWinners();
        int secondScorer = finalScores.get(secondIndex);
        String secondName = getPlayers().get(secondIndex).getPlayerID();
        int secondToken = ((PlayerChild)(getPlayers().get(secondIndex))).
                getTokens();
        finalScores.remove(secondIndex);
        totalScores.remove(secondIndex);
        getPlayers().remove(secondIndex);
        int thirdIndex = decideWinners();
        int thirdScorer = finalScores.get(thirdIndex);
        String thirdName = getPlayers().get(thirdIndex).getPlayerID();
        int thirdToken = ((PlayerChild)(getPlayers().get(thirdIndex))).
                getTokens();
        finalScores.remove(thirdIndex);
        totalScores.remove(thirdIndex);
        getPlayers().remove(thirdIndex);

        System.out.println();
        System.out.println("Winner:            " + firstName
                + " (" + topScorer + " points, " + firstToken + " tokens)");
        System.out.println("First Runner-Up:   " + secondName
                + " (" + secondScorer + " points, " + secondToken + " tokens)");
        System.out.println("Second Runner-Up:  " + thirdName
                + " (" + thirdScorer + " points, " + thirdToken + " tokens)");
        System.out.println();

    }

    public int decideWinners(){
        int index = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < totalScores.size(); i++){
            if(totalScores.get(i) < min){
                index = i;
                min = totalScores.get(i);
            }
        }
        return index;
    }

    public int calculateTotal(ArrayList<Card> array){
        if(array.size() == 0){
            return 0;
        }
        int smallest = array.get(0).getCardValue();
        int checker = smallest + 1;
        int output = 0;

        for(int i = 1; i < array.size(); i++){
            if(array.get(i).getCardValue() != checker){
                output += smallest;
                smallest = array.get(i).getCardValue();
                checker = smallest + 1;
            }
            else{
                checker++;
            }
        }
        output += smallest;
        return output;
    }

    public void generateCards() throws InterruptedException {
        System.out.println();
        System.out.print("Generating Cards ");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".");
        System.out.println();

        for(int i = 3; i < 36; i++){
            Card temp = new CardChild(i);
            deck.addCard(temp);
        }


        System.out.print("Shuffling ");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.println();

        deck.shuffle();

        System.out.print("Removing 9 random Cards ");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.println();

        for(int i = 0; i < 9; i++){
            deck.removeCard(new CardChild((int)(Math.random() * 
                    deck.getSize())));
        }

        System.out.println();
    }

    public void createPlayers(){
        int userInput;

        while(true){
            System.out.print("Enter the number of Players (3 - 5): ");
            while(true){
                try{
                    userInput = input.nextInt();
                    break;
                }
                catch(Exception ex){
                    System.out.println("Invalid number added.");
                    System.out.print("Try Again: ");
                    input.nextLine();
                }
            }

            if(userInput < 3){
                System.out.println("Atleast 3 players should be playing.");
            }
            else if(userInput > 5){
                System.out.println("Maximum number of players allowed is 5.");
            }
            else{
                break;
            }

        }

        input.nextLine();

        ArrayList<Player> players = new ArrayList<>();
        for(int i = 0; i < userInput; i++){
            System.out.print("Enter the name of player " + (i + 1) + ": ");
            String name = input.nextLine();
            players.add(new PlayerChild(name));
            playerCards.add(new GroupOfCards(0));
        }

        setPlayers(players);

    }


    public int startUp(){
        System.out.println();
        System.out.print("Press 1 to play or 2 to see \"Game Rules\" page: ");
        int userInput;
        while(true){
            try{
                userInput = input.nextInt();
                System.out.println();
                if(userInput != 1 && userInput != 2){
                    throw new InputMismatchException();
                }
                break;
            }
            catch(InputMismatchException ex){
                System.out.println("Wrong number entered.");
                System.out.print("Try again: ");
                input.nextLine();
            }
        }
        return userInput;
    }

    public boolean playAgain(){
        System.out.println();
        System.out.println("Do you want to play again? (Y / N) ");
        String userInput = input.nextLine();
        if(userInput.toLowerCase().charAt(0) == 'y'){
            return true;
        }
        return false;
    }
    
    public String getDescription(){
        return "\nThe rules are simple. Each turn, players have two options:\n\n"
                + "1. Play one of their chips to avoid picking up the current "
                + "face-up card\n" + "2. Pick up the face-up card (along with "
                + "any chips that have already been played on that card) and "
                + "turn over the next card\n\n" + "Players compete to have the "
                + "lowest score at the end of the game. The deck of cards is "
                + "numbered from 3 to 35, with each card counting for a number "
                + "of points equal to its face value. Runs of two or more cards "
                + "only count as the lowest value in the run (eg. if you have "
                + "4, 5 and 6 cards then the score to be added to the final "
                + "will be 4). But nine cards are removed from the deck before "
                + "starting, so be careful looking for connectors. Each chip "
                + "is worth -1 point, but they can be even more valuable by "
                + "allowing you to avoid drawing that unwanted card.\n\n";
    }

}

