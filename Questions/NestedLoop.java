package Problems;
import java.util.Scanner;
public class NestedLoop {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Jitne alphabet tak jana h (input)
        int n = sc.nextInt();

      //  double looping(Fking important in future (triple bhi aayegi))
        for (int i = 1; i <= n; i++) {
            //inner loop to print characters in each row
            for (int j = 0; j < i; j++) {
                //printin the characters
                char ch = (char) ('A' + j);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
