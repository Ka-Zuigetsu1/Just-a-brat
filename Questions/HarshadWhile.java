package Problems;
import java.util.Scanner;
public class HarshadWhile {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            /* write your code here */
            int input = sc.nextInt();
            int jaduu = input;
            int sum = 0;
            while (input > 0) {
                int a = input % 10;
                sum += a;
                input /= 10;
            } if (jaduu % sum == 0) {
                System.out.print("Yes");
            } else {
                System.out.print("No");
            }

        }
    }
