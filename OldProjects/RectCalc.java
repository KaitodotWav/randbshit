import java.util.Scanner;

public class RectCalc  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length, width, area;

        System.out.print("enter length: ");
        length = input.nextInt();
        System.out.print("enter width: ");
        width = input.nextInt();

        area = length * width;

        System.out.println("\nThe area of the rectangle is: " + area);
    }
}