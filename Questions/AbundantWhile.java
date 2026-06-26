// Solution.java
package Problems;

public class AbundantWhile  {

public String checkAbundant(int n) {

    // write your code here
    int i = 1;
    int sum = 0;
    while (i < n) {
        if (n % i == 0) {
            sum += i;
        } i++;
    } if (sum > n) {
        return "Yes";
    }  else if (sum < n) {
        return "No";
    } else if (sum == n) {
        return "No";
    }
    return "";
}
}