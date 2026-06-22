package Problems;
import java.util.Scanner;
public class Power {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        /* write your code here */
        double a = sc.nextInt();
        double b = sc.nextInt();
        int c = (int) Math.pow(a , b);
        if (a == b && b == 0) {
            System.out.println("Undefined");
        } else {
            System.out.println(c);
        }
    }
}
