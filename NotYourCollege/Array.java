package NotYourCollege;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main (String[] args) {
        // syntax
        // age
        ////////int ages[] = new int[5];
        ////////datatype variablename[] = new datatype [size];
        int[] array = new int [10];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        int [] array1 = new int [5];
        int []array2 = new int [5];
        int []array99 = new int[]{1,2,3,4,5,6,67};
        int []array69= {1,2,3,4,69,67,109090};



        array69[0] = 900;
        System.out.println(Arrays.toString(array69));
        System.out.println(array69[5]);


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (int i = 0; i < array69.length; i++) {
            System.out.println(array69[i]);
        }


        String arrstr[] = new String[2];
        System.out.println(Arrays.toString(arrstr));
        // You can use loops for string arrays too in similar way

        // Taking input for Array values! and also length!
        Scanner sc = new Scanner(System.in);
        int size = 5;
        System.out.print("Enter " + size + " array elements: ");
        int arr12[] =  new int[size];
        arr12[0] = sc.nextInt();
        arr12[1] = sc.nextInt();
        arr12[2] = sc.nextInt();
        arr12[3] = sc.nextInt();
        arr12[4] = sc.nextInt();
        System.out.println(Arrays.toString(arr12));
        // using loop for input can be done too


        // TRYING TO ACCESS AN INDEX OUT OF BOUNDS(EXCEPTION - ArrayIndexOutOfBounds)
        System.out.print("Enter the size of array: ");
        int a = sc.nextInt();
        int[] array1209 = new int[a];//use a = 5 or lower for this experiment!
        System.out.println(array1209[5]);
    }
}