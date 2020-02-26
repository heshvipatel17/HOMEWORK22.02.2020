package homework22_02_20;
/* WAP input sales id, seller's name, sales amount, and salary basic and then fined this sales Commission
        Sales amount >= 50,00035%
        Sales amount >= 30,00020%
        >= 20,000 10%
        >= 10,000 5%
        < 10,000 2% */

import java.util.Scanner;

public class Programme7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input Sales ID: ");
        sc.nextInt();
        System.out.print("Input Sellers Name: ");
        sc.next();
        System.out.print("Sales Amount : ");
        double amt = sc.nextDouble();

        int a = 50000, b = 30000, c = 20000, d = 10000;
        double com1 = (amt - a) * 35 / 100d;
        double com2 = (a - b) * 20 / 100d;
        double com3 = (b - c) * 10 / 100d;
        double com4 = (c - d) * 5 / 100d;
        double com5 = d * 2 / 100d;
        double com6 = amt * 2 / 100d;

        if (amt >= a) {
            System.out.println(com1 + com2 + com3 + com4 + com5);
        } else if (amt >= b && amt < a) {
            System.out.println((amt - b) * 20 / 100 + com3 + com4 + com5);
        } else if (amt >= c && amt < b) {
            System.out.println((amt - c) * 10 / 100 + com4 + com5);
        } else if (amt >= d && amt <= c) {
            System.out.println((amt - d) * 5 / 100 + com5);
        } else if (amt < d) {
            System.out.println(com6);
        }
    }
}
