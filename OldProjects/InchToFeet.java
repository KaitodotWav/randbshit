import java.util.Scanner;

public class InchToFeet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inch;
        float foot;

        System.out.print("inches: ");
        inch = input.nextInt();

        foot = inch / 12;

        System.out.println("\n" + inch + " inches is\n" + foot + " in feet.");
    }
}