package homework22_02_20;
// Write a program that tells us input value is
// number or an alphabet or symbol.

import java.util.Scanner;

public class Programme12 {
    public static void main(String[] args) {
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Input : ");
        c = sc.next().charAt(0);

        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            System.out.println("Input : " + c + " is an Alphabet.");
        } else if (c >= '0' && c <= '9') {
            System.out.println("Input : " + c + " is Number.");
        } else {
            System.out.println("Input : " + c + " is Symbol");
        }

    }
}


