import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        int num1, num2, num3, sum, ave;
        Scanner input = new Scanner(System.in);

        System.out.print("Put the 1st number: ");
        num1 = input.nextInt();
        System.out.print("Put the 2nd number: ");
        num2 = input.nextInt();
        System.out.print("Put the 3rd number: ");
        num3 = input.nextInt();

        sum = num1 + num2 + num3;
        ave = sum / 3;
        System.out.println("\nthe sum of those numbers is: " + sum
                            +"\nand the average is: " + ave);
    }
}