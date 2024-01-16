import java.util.Scanner;

public class Sample 
{
	public static void main(String[] args) 
	{
		Scanner inp = new Scanner(System.in);
		int n1, n2, n3, sum, prod;

		System.out.print("1st num: ");
		n1 = inp.nextInt();
		System.out.print("2nd num: ");
		n2 = inp.nextInt();
		System.out.print("3rd num: ");
		n3 = inp.nextInt();

		sum = n1 + n2 + n3;
		prod = n1 * n2 * n3;

		System.out.println(sum);
		System.out.println(prod);
	}
}