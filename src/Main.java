public class Main {
    public static void main(String[] args) {


        NumberGame gameRound = new NumberGame();

        try {
            gameRound.guessTheNumberGame();
        } catch (Exception e) {
            System.out.println("Your guess must be an integer from 0 to 99! Game over, start again.");
        }
    }


}






