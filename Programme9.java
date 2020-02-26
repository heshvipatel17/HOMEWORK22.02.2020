package homework22_02_20;
/* Input any alphabet from a to f and print their city name accordingly
   (using switchstatement) anyother Alphabet should be invalidentry*/

import java.util.Scanner;

public class Programme9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter City Alphabet : ");
        char city = sc.next().charAt(0);
        switch (city) {

            case ('a'):
            case ('A'):
                System.out.println("Ahmedabad");
                break;
            case ('b'):
            case ('B'):
                System.out.println("Baroda");
                break;
            case ('c'):
            case ('C'):
                System.out.println("Chennai");
                break;
            case ('d'):
            case ('D'):
                System.out.println("Delhi");
                break;
            case ('e'):
            case ('E'):
                System.out.println("Edinburg");
                break;
            case ('f'):
            case ('F'):
                System.out.println("Faridabad");
                break;
            default:
                System.out.println("invalid entry");
                break;
        }
    }
}


