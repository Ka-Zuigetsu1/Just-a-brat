package Problems;

import java.util.Scanner;

public class ISBN_NUMBER {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNext()) {
            String isbn = scanner.next();
            System.out.println(isValidISBN10(isbn));
        }

        scanner.close();
    }

    public static boolean isValidISBN10(String isbn) {
        // Must be exactly 10 characters long
        if (isbn.length() != 10) {
            return false;
        }

        int sum = 0;

        // Loop through all 10 characters
        for (int i = 0; i < 10; i++) {
            char ch = isbn.charAt(i);

            // Validate that the character is a digit
            if (!Character.isDigit(ch)) {
                return false;
            }

            int digit = ch - '0';
            sum += digit * (i + 1);
        }

        // 0 % 11 is 0, which correctly returns true for "0000000000"
        return (sum % 11 == 0);
    }
}
