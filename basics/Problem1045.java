import java.util.Scanner;

public class Problem1045 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P1045_1 = sc.nextInt();
		int P1045_2 = sc.nextInt();
		
		int plus = P1045_1 + P1045_2;
		int minus = P1045_1 - P1045_2;
		int multi = P1045_1 * P1045_2;
		int quotient = P1045_1 / P1045_2;
		int remainder = P1045_1 % P1045_2;
		double value = (double) P1045_1 / P1045_2;
		
		System.out.println(plus);
		System.out.println(minus);
		System.out.println(multi);
		System.out.println(quotient);
		System.out.println(remainder);
		System.out.printf("%.2f", value);
	}
}