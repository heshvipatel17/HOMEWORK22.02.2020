package homework22_02_20;
/*4.	Number of Days InMonth
Write a method isLeapYearwith a parameter of type int named year.
The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
If the parameter is not in that range return false.
Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false.
A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
Example of input/Output:

Write another method getDaysInMonth with two parameter month and year. Both of type
int.
If parameter month is <1 or >12 return -1.
If parameter year is <1 or >9999 than return -1.
This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2 (February).
You should check if the year is a leap year using the method isLeapYear describe above.*/

import java.util.Scanner;

public class Programme4Trial {
    public static void main(String[] args) {
        System.out.print("Enter a year: ");
        Scanner input = new Scanner(System.in);
        int Scanner = 0;
        isLeapYear(Scanner);
        input.close();
            }


    public static boolean isLeapYear(int year){

            //Parameter year >= 1 or year <= 9999
            //If not in our range
            if (year < 1 || year > 9999){
                return false;
            }

            //Calculate leap year ~
            if ( (year % 4==0 && year%100!=0) || year % 400==0){
                return true;
            }

            //In all other clases, return false
            else{
                return false;
            }

        }
        public static int getDaysInMonth(int month, int year){

            //Parameter month >=1 or month <= 9999
            if ( month < 1 || month > 9999){
                return -1;
            }
            //Parameter year >= 1 or year <= 9999
            if (year < 1 || year > 9999){
                return -1;
            }
            else{
                switch(month){
                case 1:
                    return 31;
                case 2:
                    if (isLeapYear(year) == true){
                        return 29;
                    }
                    if (isLeapYear(year) == false){
                        return 28;
                    }
                    else{
                        break;
                    }
                case 3:
                    return 31;
                case 4:
                    return 30;
                case 5:
                    return 31;
                case 6:
                    return 30;
                case 7:
                    return 31;
                case 8:
                    return 31;
                case 9:
                    return 30;
                case 10:
                    return 31;
                case 11:
                    return 30;
                case 12:
                    return 31;
                default:
                    return -1;
                }
            }

            return 0;

        }

    }