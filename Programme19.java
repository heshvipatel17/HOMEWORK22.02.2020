package homework22_02_20;
/*Write a Java program to calculate the average value
of array elements.*/

public class Programme19 {
    public static void main(String[] args) {

        double[] numbers = {10.1, 20.2, 30.3, 40.4, 50.5, 60.6, 70, 80, 90, 100};
        //calculate sum of all array elements
        double sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum = sum + numbers[i];
        //calculate average value
        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average);
    }
}
