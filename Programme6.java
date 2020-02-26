package homework22_02_20;
//WAP to input any number and find out if it’s odd or even
import java.util.Scanner;

public class Programme6 {
    //Main Method
    public static void main(String[] args) {

        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to check : ");
        number = sc.nextInt();
        /*If number is divisable by 2 than number
        is EVEN otherwise number is ODD*/
        if (number % 2 == 0) {
            System.out.print("number " + number + " is an EVEN number");
        } else {
            System.out.print("number " + number + " is an ODD number");
        }
    }
}