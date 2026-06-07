package Mine;
import java.util.Scanner;
public class Waguri_STILL_HAS_SUPERMACY {
    /*static void main(String[] args) {
        System.out.println("Ah! We meet again!");
        System.out.println("I will be a little soft on you today, What's the greatest romance anime?");
    Scanner a  = new Scanner(System.in);
    String Input = a.nextLine();
    if (Input.equals("Kaoru no hana wa rin to saku")) {
        System.out.println("Oi!! You are.....You're the best!!");
    } else if (Input.equals("Kaguya sama love is war")) {
        System.out.println("O Kawaii Koto");
    } else if (Input.equals("Redo of healer")) {
        System.out.println("Man of culture I see");
    } else if (Input.equals("Rent a Girlfriend")) {
        System.out.println("Hm~ ic");
        System.out.println("Oi, what's wrong with liking Rent a GF");
        System.out.println("Nahh, nth just thinking of how should I exterminate this pest");
    } else if (Input.equals("Dress up darling")) {
        System.out.println("Zero Social Filter");
    } else if (Input.equals("I dont watch romance")) {
        System.out.println("KYS");
    }
    }*/
    static void main(String[] args) {
        System.out.println("Ah! We meet again!");
        System.out.println("I will be a little soft on you today, What's the greatest romance anime?");
        Scanner a  = new Scanner(System.in);
        String Input = a.nextLine();
        switch (Input) {
            case "Kaoru no hana wa rin to saku" -> System.out.println("Oi!! You are.....You're the best!!");
            case "Kaguya sama love is war" -> System.out.println("O Kawaii Koto");
            case "Redo of healer" -> System.out.println("Man of culture I see");
            case "Rent a Girlfriend" -> {
                System.out.println("Hm~ ic");
                System.out.println("Oi, what's wrong with liking Rent a GF");
                System.out.println("Nahh, nth just thinking of how should I exterminate this pest");
            }
            case "Dress up darling" -> System.out.println("Zero Social Filter");
            case "I dont watch romance" -> System.out.println("KYS");
        }
    }
}
