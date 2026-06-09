package Mine;
import java.util.Random;
import java.util.Scanner;
public class Gacha_Prototype {
    public static void main(String[] args) {
        Random ra = new Random();
        Scanner sc = new Scanner(System.in);
//      System.out.println(chance);
        int Star_rail_passes;
        do {
            System.out.println("1 Pull or 10 Pull");
            float chance = (float)  Math.random();
//            System.out.println(chance);
            Star_rail_passes = sc.nextInt();
            if (Star_rail_passes > 80) {
                System.out.println("Pity reset after 80");
                break;
            }
            if (Star_rail_passes == 80) {
                System.out.println("Guaranteed Waguri!");
            }
            else if (Star_rail_passes >= 50) {
                if (chance < 0.50f) {
                    System.out.println("You win Waguri!");
                    break;
                } else {
                    System.out.println("No Waguri For You");
                }
            }
            else if (Star_rail_passes >= 30) {
                if (chance < 0.20f) {
                    System.out.println("You win Waguri!");
                    break;
                } else {
                    System.out.println("No Waguri For You");
                }
            }
            else {
                if (chance < 0.10f) {
                    System.out.println("You win Waguri!");
                    break;
                } else {
                    System.out.println("No Waguri For You");
                }
            }
        }while (Star_rail_passes <= 80);
    }
}

// 777 Gacha
          //int a = ra.nextInt(7)+  1;
          //int b = ra.nextInt(7)+  1;
          //int c = ra.nextInt(7)+  1;
//        System.out.print(a);
//        System.out.print(" " + b);
//        System.out.print(" " + c);
//        if (a==b && b==c) {
//            System.out.println("You win the Jackpot");
//        } else if ( a ==b || b==c || a==c) {
//            System.out.println("Small reward");
//        } else {
//            System.out.println("Try again (Give me more money)");
//        }
