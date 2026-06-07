package Mine;
import java.util.Scanner;
import java.util.Random;
public class Rock_Paper_Scissors {
    static void main(String[] args) {
    String a = "Rock";
    String b = "Paper";
    String c = "Scissors";
    String[] e = {a , b, c};
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        String d = sc.next();
        String f = e[random.nextInt(3)];
        System.out.println("Beta ab tu dekh \n" +
                "      _.-'__\"-_\n" +
                "     /  _    _  \\\n" +
                "    |  (_)  (_)  |\n" +
                "    |     __     |\n" +
                "    |    /  \\    |\n" +
                "     \\  |    |  /\n" +
                "      '-|____|-': " +          f);

    }
}


