package homework22_02_20;
/* Input any alphabet from a to f and print their city name
accordingly (use if else) any other Alphabet should be invalid entry*/

import java.util.Scanner;

public class Programme8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter City Alphabet : ");
        char city = sc.next().charAt(0);

        if (city == 'a' || city == 'A') {
            System.out.println("Ahmedabad");
        } else if (city == 'b' || city == 'B') {
            System.out.println("Baroda");
        } else if (city == 'c' || city == 'C') {
            System.out.println("Chennai");
        } else if (city == 'd' || city == 'D') {
            System.out.println("Delhi");
        } else if (city == 'e' || city == 'E') {
            System.out.println("Edinburg");
        } else if (city == 'f' || city == 'F') {
            System.out.println("Faridabad");
        } else if (city >= 'g' || city <= 'z' && city >= 'G' || city <= 'Z') {
            System.out.println("invalid entry");
        }
    }
}

