package homework22_02_20;
/*WAP to input any two number and ask user to enter their
  symbol (+, -, /, *) find addition, Subtraction,
  multiplication and division according to their symbol
  (using if else)*/

import java.util.Scanner;

public class Programme10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter any of specific operation +, -, *, / : ");
        char c = sc.next().charAt(0);
        if (c == '+') {
            System.out.println("Addition = " + (num1 + num2));
        } else if (c == '-') {
            System.out.println("Subtraction = " + (num1 - num2));
        } else if (c == '*') {
            System.out.println("Multiplication = " + (num1 * num2));
        } else if (c == '/') {
            System.out.println("Division = " + (float) (num1 / (float) num2));
        }
    }
}


