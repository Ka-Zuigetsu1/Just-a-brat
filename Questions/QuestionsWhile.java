package Problems;


import java.util.Scanner;

public class QuestionsWhile {
    // Question 1 - Strong number
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            /* write your code here */
            int a = sc.nextInt();
            int b = a;
            int sum = 0;
            while (a > 0) {
                int g = a%10;
                int factorial = 1;
                for (int i = 1; i<=g; i++) {
                    factorial = factorial*i;
                }
                sum += factorial;
                a /= 10;
            }
            if (sum == b) {
                System.out.print("Yes");
            } else {
                System.out.print("No");
            }
        }

    // QUESTION 2 Automorphic
//public static void main (String[] args) {
//    Scanner sc = new Scanner(System.in);
//    /* write your code here */
//    int a = sc.nextInt();
//    int c = a*a;
//    while (a > 0) {
//        int b = c%10;
//        if (a == b) {
//            System.out.print("Yes");
//            break;
//        } else {
//            System.out.print("No");
//            break;
//        }
//    }
//
//}


    // Question 3 HCF
//   static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        while (b != 0) {
//            int temp = b;
//            b = a % b;
//            a = temp;
//        }
//        System.out.println(a);
//    }
}



