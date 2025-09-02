//44. Create a program using do-while to implement a number guessing game.
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberToGuess = 7;
        int guess;

        do {
            System.out.print("Guess a number between 1 and 10: ");
            guess = sc.nextInt();
        } while (guess != numberToGuess);

        System.out.println("Correct! You guessed it.");
    }
}
