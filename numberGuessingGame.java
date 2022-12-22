import java.util.Random;
import java.util.Scanner;

class numberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int attempt = 10;
        int highscore = 0;
        int num = r.nextInt(1, 20);

        while (true) {

            System.out.println("--------------------------------------------------------------");
            System.out.println("Welcome to Guess The Number");
            System.out.println("Press 1 - Play the Game");
            System.out.println("Press 2 - Quit");
            System.out.println("Current Highscore : " + highscore);
            int input = sc.nextInt();
            if (input == 1) {
                while (attempt >= 0) {
                    System.out.println("=====================");
                    if (attempt == 0) {
                        System.out.println("Sorry, no attempt left.");
                        break;
                    }
                    System.out.print("Guess the Number : ");
                    int guess = sc.nextInt();
                    System.out.println("Attemps left : " + attempt);
                    if (guess > num) {
                        System.out.println("Your guess is too high");
                    } else if (guess < num) {
                        System.out.println("Your guess is too low");
                    } else {
                        System.out.println("Congrats !! you guessed it right");
                        System.out.println("Your score is " + attempt * 10);
                        highscore = Math.max((attempt * 10), highscore);
                        System.out.println("Highscore : " + highscore);
                        break;
                    }
                    System.out.println("=====================");
                    attempt--;

                }
            } else {
                System.out.println("Thanks for Playing");
            }
        }
    }
}
