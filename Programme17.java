package homework22_02_20;
//Write a Java program to sum values of an array
public class Programme17 {
    public static void main(String[] args) {

        int[] num = {10,20, 30, 40, 50, 60};
        //calculate sum of all array elements
        int sum = 0;
        for (int i = 0; i < num.length; i++)
            sum = sum + num[i];
        System.out.println("Sum value of an array is : " + sum);
    }
}