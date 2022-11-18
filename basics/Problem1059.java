import java.util.Scanner;

public class Problem1059 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P1059 = sc.nextInt();
		
		int bitWiseNot = ~P1059;
		
		System.out.println(bitWiseNot);
	}
}