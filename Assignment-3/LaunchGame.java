import java.util.Scanner;

class Guesser {
    int guessNum;

    int guessNum() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guesser kindly guess the number");
        guessNum = scan.nextInt();
        return guessNum;
    }

    // Feature 1: Hint System
    void giveHint(int playerGuess) {
        if (playerGuess > guessNum) {
            System.out.println("Your guess is too high!");
        } else if (playerGuess < guessNum) {
            System.out.println("Your guess is too low!");
        } else {
            System.out.println("Correct guess!");
        }
    }
}

class Player {
    int guessNum;

    int guessNum() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player kindly guess the number");
        guessNum = scan.nextInt();
        return guessNum;
    }
}

class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser() {
        Guesser g = new Guesser();
        numFromGuesser = g.guessNum();
    }

    void collectNumFromPlayers() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numFromPlayer1 = p1.guessNum();
        numFromPlayer2 = p2.guessNum();
        numFromPlayer3 = p3.guessNum();
    }

    // Feature 2: Retry Mechanism
    boolean retryPlayers(Guesser guesser) {
        Scanner scan = new Scanner(System.in);
        System.out.println("All players failed! Do you want to retry? (yes/no)");
        String choice = scan.next().toLowerCase();

        if (choice.equals("yes")) {
            System.out.println("Retrying...");
            collectNumFromPlayers(); // Collect new guesses from players
            compare(); // Compare again
            return true;
        } else {
            System.out.println("Game Over!");
            return false;
        }
    }

    void compare() {
        Guesser guesser = new Guesser();

        // Provide hints to players
        guesser.giveHint(numFromPlayer1);
        guesser.giveHint(numFromPlayer2);
        guesser.giveHint(numFromPlayer3);

        if (numFromGuesser == numFromPlayer1) {
            if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
                System.out.println("All players won the game");
            } else if (numFromGuesser == numFromPlayer2) {
                System.out.println("Player 1 & Player2 won");
            } else if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player 1 & Player3 won");
            } else {
                System.out.println("Player 1 won the game");
            }
        } else if (numFromGuesser == numFromPlayer2) {
            if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player 2 & Player3 won");
            } else {
                System.out.println("Player 2 won the game");
            }
        } else if (numFromGuesser == numFromPlayer3) {
            System.out.println("Player 3 won the game");
        } else {
            System.out.println("Game lost! Try Again!");

            // Feature 2: Retry Mechanism
            retryPlayers(guesser);
        }
    }
}

public class LaunchGame {
    public static void main(String[] args) {
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare();
    }
}