import java.util.Random;
import java.util.Scanner;

/*
 * Saiket Systems Internship
 * Task 4 - Number Guessing Game
 *
 * The computer generates a random number between 1 and 100.
 * The user keeps guessing until the correct number is guessed.
 * Hints are provided and total guesses are counted.
 */

public class NumberGuessingGame {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = random.nextInt(100) + 1; // 1 to 100
        int guess;
        int attempts = 0;

        System.out.println("🎯 Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100");

        while (true) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("\n🎉 Congratulations!");
                System.out.println("You guessed the correct number: " + randomNumber);
                System.out.println("Total guesses made: " + attempts);
                break;
            }
        }

        scanner.close();
    }
}
