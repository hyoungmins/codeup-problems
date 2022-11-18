import java.util.Scanner;

public class Problem1060 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P1060_1 = sc.nextInt();
		int P1060_2 = sc.nextInt();
		
		int bitWiseAnd = P1060_1 & P1060_2;
		
		System.out.println(bitWiseAnd);
	}
}