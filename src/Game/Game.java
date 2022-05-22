package Game;

import java.util.Scanner;
import java.util.Random;
class Game {
    public static void main(String[] args) {
        Game game = new Game();
        // Print menu
        game.printMenu();
        //Check human choice
        int humanChoice = game.reciveHumanChoice();
        //Check if human wants to play
        while (game.humansWantsToPlay(humanChoice)) {
            //Wake my choice
            int myChoice = game.makeMyChoice();
            //Resolve winner
            game.resolveWinner(humanChoice, myChoice);
            game.printMenu();
            humanChoice = game.reciveHumanChoice();
        }
        //Say goodbye
        game.sayGoodBye();
    }

    private void printMenu(){
        System.out.println("If you want to play with me, than choose ypur option:");
        System.out.println("1. Rock");
        System.out.println("2. Scissors");
        System.out.println("3. Paprer");
        System.out.println("0. Quit the game");
    }

    private int reciveHumanChoice(){
        Scanner consoleScanner = new Scanner (System.in);
        int choice = consoleScanner.nextInt();
        //Check if it correct
        while (choice<0 || choice >3) {
            System.out.println ("Sorry, I dont understand you");
            choice = consoleScanner.nextInt();
        }
        return choice;
    }

    private boolean humansWantsToPlay(int humanChoice){
        return humanChoice !=0;
    }

    private int makeMyChoice(){
        Random randomizer = new Random();

        int myChoice = 1 + randomizer.nextInt(3);
        System.out.println("I choose "+ myChoice);
        return myChoice;
    }

    private void resolveWinner (int humanChoice, int myChoice){
        //check if nobody wins
        if (humanChoice == myChoice){
            System.out.println("Nobody wins!");
        }
        //check if human wins
        else if (isHumanWins(humanChoice, myChoice)){
            System.out.println("OK, you win!");
        }
        //else we are winner
        else {
            System.out.println("Sorry, but you loose...");
        }
    }

    private boolean isHumanWins (int humanChoice, int myChoice){
        return (humanChoice == 3 && myChoice ==1)||
                (humanChoice == 2 && myChoice ==3)||
                (humanChoice == 1 && myChoice ==2);
    }

    private void sayGoodBye(){
        System.out.println("Bye!");

    }

}