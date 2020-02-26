package homework22_02_20;

import java.util.Arrays;
// Write a Java program to sort a numeric array and a string array.

public class Programme16 {

    public static void main(String[] args) {
       // Array contains 14 elements
        int[] num = {1, 25, 505, 5, 17, -25, 13, 7, 6, 45, 21, 9, 101, 102};

        Arrays.sort(num);

        System.out.println("Sort Numeric Arrey : " + Arrays.toString(num));

       // Array contains 6 elements
        String[] name = {"Surat", "Ahmedabad", "Baroda", "Surendranagar", "Bhavnagar", "Amreli"};

        Arrays.sort(name);

        System.out.println("Sort String Array : " + Arrays.toString(name));
    }
}



