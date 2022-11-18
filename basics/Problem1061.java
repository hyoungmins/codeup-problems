import java.util.Scanner;

public class Problem1061 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P1061_1 = sc.nextInt();
		int P1061_2 = sc.nextInt();
		
		int bitWiseOr = P1061_1 | P1061_2;
		
		System.out.println(bitWiseOr);
	}
}