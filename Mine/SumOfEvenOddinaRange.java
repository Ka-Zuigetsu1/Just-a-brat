package Mine;
import java.util.Scanner;
public class SumOfEvenOddinaRange {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        /* write your code here */
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        int suuu = 0;
        int sumo = 0;
        int suuuiii = 0;
        if (a>b) {
            for (int i = b;i <= a; i++) {
                if (i % 2 == 0) {
                    sum += i;

                } else {
                    suuu += i;

                }
            } System.out.println(sum);
            System.out.println(suuu);
        } else if (a<b) {
            for (int i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    sumo += i;

                } else {
                    suuuiii += i;
                }
            }System.out.println(sumo);
            System.out.println(suuuiii);
        } else if (a == b && b == 0) {
            System.out.println("0");
            System.out.println("0");
        } else if (a == b && a % 2 != 0) {
            System.out.println("0");
            System.out.println(a);
        } else if (a == b && b % 2 == 0) {
            System.out.println(b);
            System.out.println("0");
        }
    }
}
