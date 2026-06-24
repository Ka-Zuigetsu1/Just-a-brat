package Problems;
import java.util.Scanner;
public class TasksMethode {
    //1. PrimeNumber
    //2. Factors
    // Prime Number
    /* static int prime(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                System.out.println("Not a Prime Number");
                break;
            } else {
                System.out.println("Prime Number");
                break;
            }
        }
        return a;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = prime(sc.nextInt());
    } */

    // 2. Factors
    static int factor(int a) {
        for (int i = 1; i <=a; i++) {
            if (a%i == 0) {
                System.out.print(i + " ");
            }
        }
        return a;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = factor(sc.nextInt());
//        System.out.println(factor(n));
    }
}
