package homework22_02_20;
//WAP to input any year like (ex.2007) and find out if it is leap year or not?

import java.util.Scanner;

public class Programme2 {

    //Main Method
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any year to find out Leap Year :");
        int year = s.nextInt();
        String leapYear = (year % 4 == 0) ? " Leap Year " : " No Leap Year ";
        System.out.println(year + " is " + leapYear);
    }
}



