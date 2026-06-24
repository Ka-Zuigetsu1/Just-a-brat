package NotYourCollege;

public class Methode__Yes_Frieren__ {
    static void Swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a +  " b = " + b );
    }
    static void main(String[] args) {
        int a = 10;
        int b = 20;
        Swap(a , b);
        System.out.println("a is " + a + ", " + b + " is b");
    }
}
