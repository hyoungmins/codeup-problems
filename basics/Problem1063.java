import java.util.Scanner;

public class Problem1063 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P1063_1 = sc.nextInt();
		int P1063_2 = sc.nextInt();
		
		int ternary = P1063_1 > P1063_2 ? P1063_1 : P1063_2;
		
		System.out.println(ternary);
	}
}