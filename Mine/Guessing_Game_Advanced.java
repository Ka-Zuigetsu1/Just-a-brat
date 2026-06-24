package Mine;
import java.util.Scanner;
import java.util.Random;
public class Guessing_Game_Advanced {
    static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random ra = new Random();
    int count = 5;
        System.out.print("Please deposit 100$ you might be able to win Waguri 1 in a million chance! \uD83E\uDD2D: ");
    int money = sc.nextInt();
    if (money == 100) {
        System.out.println("Thank You for your patronage. You will get 5 tries per turn.");
    } else {
        System.out.println("Alas! you couldn't fathom how valuable Waguri is!!!!");
        return;
    }
        System.out.print("Guess a number between 0 to 100: ");
        int c = ra.nextInt(1, 100);
    do {
        int a = sc.nextInt();
        if (c-a > 30) {
            System.out.println("Cold");
        }
        else if (c-a >15) {
            System.out.println("Hot");
        } else if (c-a < -30) {
            System.out.println("Cold");
        } else if (c-a < -15) {
            System.out.println("Hot");
        }  else if (c == a) {
            System.out.println("Congratulations you win Waguri!! but sadly she is already mine so bye bye \uD83E\uDD2D");
            break;
        }
        else if (c-a < 10) {
            System.out.println("Very Near!");
        }
        count--;
        System.out.println(count + " tries remaining");
    } while (count > 0);
        System.out.println("Feel like a million bucks!");

    }
}
