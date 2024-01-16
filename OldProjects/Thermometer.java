import java.util.Scanner;

public class Thermometer {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int temp;
        
        System.out.print("Enter temperature: ");
        temp = in.nextInt();
        if (temp<20){
            System.out.println("IT'S COLD!");
        } else if (temp>30){
            System.out.println("IT'S HOT!");
        } else {
            System.out.println("COOL CLIMATE!");
        }
    }
}