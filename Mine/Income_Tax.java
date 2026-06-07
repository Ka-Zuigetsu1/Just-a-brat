package Mine;

import java.util.Scanner;

public class Income_Tax {
    static void main(String[] args) {
        float tax = 0f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in LPA");
        float income = sc.nextFloat();
        if (income< 2.5f) {
            tax = tax + 0;
        } else if (income > 2.5f && income < 5.00f) {
            tax = tax + 0.05f*(income - 2.5f);
        } else if (income > 5.00f && income < 10.00f) {
            tax = tax + 0.05f*(5.00f-2.5f) +0.2f*(income-5.00f);
        } else if (income > 10.00f) {
            tax = tax + 0.05f*(5.00f-2.50f) + 0.2f*(10.00f-5.00f) + 0.3f*(income - 10.00f);
        }
        System.out.println("Your Income tax is: " + tax);
    }
}
