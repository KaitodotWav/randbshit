import java.util.Scanner;

public class LowFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2, num3, num4, num5;
        System.out.print("Enter 1st number: ");
        num1 = in.nextInt();
        System.out.print("Enter 2nd number: ");
        num2 = in.nextInt();
        System.out.print("Enter 3rd number: ");
        num3 = in.nextInt();
        System.out.print("Enter 4th number: ");
        num4 = in.nextInt();
        System.out.print("Enter 5th number: ");
        num5 = in.nextInt();
        
        if (num1<=num2 & num1<=num3 & num1<=num4 & num1<=num5){
            System.out.println(num1 + " is the lowest number!");
        } else if (num2<=num1 & num2<=num3 & num2<=num4 & num2<=num5){
            System.out.println(num2 + " is the lowest number!");
        } else if (num3<=num2 & num3<=num1 & num3<=num4 & num3<=num5){
            System.out.println(num3 + " is the lowest number!");
        } else if (num4<=num2 & num4<=num3 & num4<=num1 & num4<=num5){
            System.out.println(num4 + " is the lowest number!");
        } else {
            System.out.println(num5 + " is the lowest number!");
        }
    }
    
}