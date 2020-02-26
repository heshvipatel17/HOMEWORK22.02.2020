package homework22_02_20;
/*4.	Number of Days InMonth
Write a method isLeapYearwith a parameter of type int named year.
The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
If the parameter is not in that range return false.
Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false.
A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.

Write another method getDaysInMonth with two parameter month and year. Both of type
int.
If parameter month is <1 or >12 return -1.
If parameter year is <1 or >9999 than return -1.
This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2 (February).
You should check if the year is a leap year using the method isLeapYear describe above.*/


import java.util.Scanner;

public class Programme4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();


        if (year < 1 || year > 9999) {
            System.out.println("false");
        } else if ((year >= 1 && year <= 9999) && (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is a not leap year");

        }
    }



    public static void isLeapYear() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter a month: ");
        int month = input.nextInt();
        if ((month < 1 || month > 12) && (year < 1 || year > 9999)) {
            System.out.println("false");
        } else if ((month >= 1 && month <= 12) && (year >= 1 && year <= 9999) && (year % 4 == 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is a not leap year");

        }
    }
}


