package Mine;

import java.util.Scanner;
import java.util.Random;

public class Guessing_Game {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random ra = new Random();
    int Computer = ra.nextInt(100) + 1;
    int Guess;
    do {
        System.out.println("Enter a number between 1-100");
        Guess = sc.nextInt();
        if (Guess > Computer) {
            System.out.println("Go Lower");
        } else if (Guess < Computer) {
            System.out.println("Go Higher");
        }else {
            System.out.println("You win, the correct number was: " + Computer);
        }
    } while (Computer != Guess);
    }
}
