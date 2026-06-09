package Mine;

public class SumOfFirst5evennumbers {
    public static void main(String[] args) {
    int a = 0;
    int sum = 0;
    do {
        a += 2;
        sum += a;
    } while (a < 10);
        System.out.print("Sum of Fist 5 Even numbers is: " + sum);
    }
}
