package Mine;

public class Assignment_2 {
   /* public static void main(String[] args) {
        String a = new String("Cuttlefish That Loves Diving");
        System.out.println(a.toUpperCase());
    }*/
    // Question 2;
   /* public static void main(String[] args) {
        String main = new String("Cuttlefish That Loves Diving");
        String a = main.replaceAll(" ","_");
        System.out.println(a);
    }*/

    // Question 3
   /* public static void main(String[] args) {
        String Letter = new String("\"Thanks a lot Cuttlefish That Loves Diving\"");
        String a = Letter.replaceAll("Cuttlefish That Loves Diving","Gehrman Sparrow");
        System.out.println(a);
    }*/

    // QUESTION 4
   /* public static void main(String[] args) {
        String a = "Car is a vehicle";
        int b = a.indexOf(' ', 4);
        System.out.println(b);
    }*/
    // QUESTION 5
   /* static void main(String[] args) {
        String a = new String("\"Lord of The Mysteries is The Best Piece of Fiction Ever Made!!\"");
        System.out.println(a);
    }*/

// These are the questions based upon different string commands, please revise then twice or thrice from notes you might forget them, they appear truly important!

    // Experiment
    public static void main(String[] args) {
        String b = new String("Kimi no iru machi");
        StringBuilder c = new StringBuilder(b);
        int index = 7;
        c.setCharAt(index,'_');
//        String a = b.replace(" ","_");
        System.out.println(c);

    }
}