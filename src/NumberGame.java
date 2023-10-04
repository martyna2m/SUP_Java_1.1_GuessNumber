import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    Scanner scan = new Scanner(System.in);

    public void guessTheNumberGame() throws InputMismatchException {
        int numberOfAttempts = 5;
        int numberToGuess = new Random().nextInt(100);
        System.out.println("Hello! Guess the number between 0 and 99. You have 5 attempts. Good luck!" + numberToGuess);

        for (int i = 0; i < numberOfAttempts; i++) {

            int playersGuess = scan.nextInt();

            if (numberToGuess == playersGuess) {
                System.out.println("You guessed it!");
                break;

            } else if (i == 4) {
                System.out.println("Sorry you didn't guess the number, the answer was: " + numberToGuess);

            } else if (playersGuess < numberToGuess) {
                System.out.println("Your number is LOWER than the one you are trying to guess. Please try again, you have " + (4 - i) + " attempts left");

            } else {
                System.out.println("Your number is HIGHER than the one you are trying to guess. Please try again, you have " + (4 - i) + " attempts left");

            }


        }
    }
}



