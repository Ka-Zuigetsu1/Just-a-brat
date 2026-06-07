package Mine;

import java.util.Scanner;

public class Greatest_2_numbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number:");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number:");
        int b = sc.nextInt();
        if (a>b) {
            System.out.println(a + " is larger");
        } else {
            System.out.println(b + " is larger");
        }
    }
}
