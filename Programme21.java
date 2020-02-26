package homework22_02_20;

import java.util.Scanner;

//User enters month's number, then program tells month's name
public class Programme21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month's number : ");
        int mth = sc.nextInt();
        if (mth == 1) {
            System.out.println("January");
        } else if (mth == 2) {
            System.out.println("February");
        } else if (mth == 3) {
            System.out.println("March");
        } else if (mth == 4) {
            System.out.println("April");
        } else if (mth == 5) {
            System.out.println("May");
        } else if (mth == 6) {
            System.out.println("June");
        } else if (mth == 7) {
            System.out.println("July");
        } else if (mth == 8) {
            System.out.println("August");
        } else if (mth == 9) {
            System.out.println("September");
        } else if (mth == 10) {
            System.out.println("October");
        } else if (mth == 11) {
            System.out.println("November");
        } else if (mth == 12) {
            System.out.println("December");
        }

    }
}
