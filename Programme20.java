package homework22_02_20;
//Write a Java program to test if an array contains a specificvalue.
import java.util.Scanner;

public class Programme20 {
    public static void main(String[] args) {
        int find;
        Scanner sc = new Scanner(System.in);
        System.out.print("Write any number to find out an array contains a specific value : ");
        find = sc.nextInt();

        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                100, 200, 250, 500, 1000, -10, -100};

        boolean found = false;

        for (int n : num) {
            if (n == find) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Input Number : " + find + " is found.");
        else
            System.out.println("Input Number : " + find + " is not found.");
    }
}
