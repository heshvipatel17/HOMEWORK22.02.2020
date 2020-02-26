package homework22_02_20;
/* WAP to input employee id, name, basic salary
   then find HRA, TA, DA, PF and Gross salary
   HRA = basic salary10%
   DA = Basic salary 8%
   TA = Basic salary 9%
   PF= Basic salary 20%
   Gross salary = basic salary + HRA + TA + DA –PF */

    import java.util.Scanner;

    public class Programme5 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int id;
            double salary, hra, ta, da, pf;
            String name;

            System.out.print("Enter Employee Id: ");
            id = sc.nextInt();
            System.out.print("Employee Name: ");
            name = sc.next();
            System.out.print("Basic Salary: ");
            salary = sc.nextInt();
            hra = salary * 10 / 100;
            ta = salary * 8 / 100;
            da = salary * 9 / 100;
            pf = salary * 20 / 100;
            double gross = salary + hra + ta + da - pf;

            System.out.println(" _______________________________ ");
            System.out.println("|          Salary Slip          |");
            System.out.println("|_______________________________|");
            System.out.println("| Employee Id     : " + id + "        |");
            System.out.println("| Employee Name   : " + name + "        |");
            System.out.println("|_______________________________|");
            System.out.println("| Basic Salary    : " + salary + "     |");
            System.out.println("| HRA 10%         : " + hra + "      |");
            System.out.println("| TA 8%           : " + ta + "      |");
            System.out.println("| DA 9%           : " + da + "      |");
            System.out.println("| PF - 20&        : " + pf + "      |");
            System.out.println("|_______________________________|");
            System.out.println("| Gross Salary    : " + gross + "     |");
            System.out.println("|===============================|");

        }
    }



