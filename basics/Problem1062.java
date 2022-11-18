import java.util.Scanner;

public class Problem1062 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P1062_1 = sc.nextInt();
		int P1062_2 = sc.nextInt();
		
		int bitWiseXor = P1062_1 ^ P1062_2;
		
		System.out.println(bitWiseXor);
	}
}