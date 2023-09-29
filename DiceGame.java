import java.util.Scanner;

public class DiceGame {
    private static Scanner scanner = new java.util.Scanner(System.in);
    private static String input;
    private static double dice1;
    private static double dice2;

    static void endGame() {
        System.exit(0);
        scanner.close();
    }

    static void userResponse() {
        input = scanner.nextLine().toLowerCase();
        if (input.equals("no")) {
            System.out.println("Are you sure? If you are, then the game will end. (yes/no)");
            input = scanner.nextLine().toLowerCase();
            if (input.equals("yes")) {
                System.out.println("Game ended.");
                endGame();
            }else if (input.equals("no")) {
                System.out.println("Okay, the game will continue! Here's the throw:");
            }
        } else if (!input.equals("yes")) {
            do {
                System.out.println("This input is not valid. Please type yes or no");
                input = scanner.nextLine().toLowerCase();
                if (input.equals("yes") || input.equals("no")) {
                    break;
                }
            }
            while(!input.equals("yes") || !input.equals("no"));
        }
    }

    static void rollDice() {
        dice1 = Math.floor(Math.random() *(6 - 1 + 1) + 1);
        dice2 = Math.floor(Math.random() *(6 - 1 + 1) + 1);
        System.out.println("Dice 1:   " + (int) dice1 + "\nDice 2:   " + (int) dice2);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the dice game! Would you like to play? (yes/no)");
        userResponse();
        System.out.println("The game is played with 2 dice.");
        System.out.println("First to 40 points, wins the game!");
        System.out.println("You can also win by getting 6 on both dice twice in a row.");
        System.out.println("Getting 1 on both dice, will reset your score.");
        System.out.println("Player 1's turn! Throw the dice?:");

        double player1Count = 0;
        double player2Count = 0;
        int p1SixWin = 0;
        int p2SixWin = 0;

        while (true) {
            userResponse();
            rollDice();
            player1Count += dice1 + dice2;

            if (dice1 == 6 && dice2 == 6){
                p1SixWin++;
            }else{
                p1SixWin = 0;
            }

            if (p1SixWin == 2) {
                System.out.println("Player 1 has hit 6 on both dice, TWICE in a row!");
                System.out.println("Player 1 has won this game! \nCongrats player 1! -and better luck next time player 2 :)");
                endGame();
            }

            if (dice1 == 1 && dice2 == 1) {
                player1Count = 0;
                System.out.println("Player 1 has hit 1 on both dice! This means they lose all of their points!");
            }

            System.out.println("Player 1 is now at " + (int) player1Count + " points!");

            if (player1Count >= 40 && dice1 == dice2) {
                System.out.println("Player 1 has won this game! \nCongrats player 1! -and better luck next time player 2 :)");
                endGame();
            }

            System.out.println("Player 2's turn! Would you like throw?");
            userResponse();
            rollDice();
            player2Count += dice1 + dice2;

            if (dice1 == 6 && dice2 == 6){
                p2SixWin++;
            }else{
                p2SixWin = 0;
            }

            if (p2SixWin == 2) {
                System.out.println("Player 2 has hit 6 on both dice, TWICE in a row!");
                System.out.println("Player 2 has won this game! \nCongrats player 2! -and better luck next time player 1 :)");
                endGame();
            }

            if (dice1 == 1 && dice2 == 1) {
                player2Count = 0;
                System.out.println("Player 2 has hit 1 on both dice! This means they lose all of their points!");
            }

            System.out.println("Player 2 is now at " + (int) player1Count + " points!");

            if (player2Count >= 40 && dice1 == dice2) {
                System.out.println("Player 2 has won this game! \nCongrats player 2! -and better luck next time player 1 :)");
                endGame();
            }
        }
    }
}
