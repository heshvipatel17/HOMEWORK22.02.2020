package homework22_02_20;

//Write a java program that tell us that Input number is odd or even?
//HINT: use ternery operator (?:)

import java.util.Scanner;

//Class syntax
public class Programme1 {

    //Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        int a = sc.nextInt();

        String jitu = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println(a + " Number is : " + jitu);


        //Other way to call
        jitu = (a % 2 == 1) ? "Odd": "Even" ;
        System.out.println(a + " Number is : " + jitu);

    }
}
