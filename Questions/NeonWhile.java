package Problems;

// Solution.java

public class NeonWhile {

    public String checkNeon(int n) {

        // write your code here
        int sqr = (int) Math.pow(n, 2);
        int sum = 0;
        while (sqr > 0) {
            int a = sqr % 10;
            sum += a;
            sqr /= 10;
        } if (sum == n) {
            return "Yes";
        } else {
            return "No";
        }
        //return "";
    }
}
