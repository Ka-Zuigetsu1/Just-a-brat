package Mine;

import java.util.Scanner;

public class Assignment_3 {
    // QUESTION 1
//    static void main(String[] args) {
//        int a = 10;
//        if (a==11) {
//            System.out.println("I am 11");
//        } else {
//            System.out.println("I am not 11");
//        }
//    }
    // QUESTION 2
//    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("THIS IS FKIN JEE ADVANCED");
//        System.out.println("Please enter your Marks in Physics");
//        int p = sc.nextInt();
//        System.out.println("Please enter your Marks in Chemistry");
//        int c = sc.nextInt();
//        System.out.println("Please enter your Marks in Maths");
//        int m = sc.nextInt();
//        int t = ((p + c + m)/3);
//        int [] a = {p, c, m};
//        if (t >= 40 && p >= 33 && c >= 33 && m >= 33)  {
//            System.out.println("You Passed");
//        } else {
//            System.out.println("You Failed Darling");
//
//        }
//
//    }
    // QUESTION 3
    // Another File
    // Question 4
//    static void main(String[] args) {
//        System.out.println("Enter a number assigned for a day: ");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        if (a == 1) {
//            System.out.println("It's Monday");
//        } else if (a == 2) {
//            System.out.println("It's Tuesday");
//        }else if (a == 3) {
//            System.out.println("It's Wednesday");
//        }else if (a == 4) {
//            System.out.println("It's Thursday");
//        }else if (a == 5) {
//            System.out.println("It's Friday");
//        }else if (a == 6) {
//            System.out.println("It's Saturday");
//        }else if (a == 7) {
//            System.out.println("It's Sunday");
//        }
//    }
    // Question 5
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an year: ");
        int year = sc.nextInt();
    if (year % 400 == 0) {
        System.out.println("Leap Year");
    } else if (year % 100 == 0) {
        System.out.println("Not Leap Year");
    } else if (year % 4 == 0) {
        System.out.println("Leap Year");
    } else {
        System.out.println("Not Leap Year");
    }
   }
}