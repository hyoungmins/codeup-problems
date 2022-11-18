import java.util.Scanner;

public class Problem1048 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P1048_1 = sc.nextInt();
		int P1048_2 = sc.nextInt();
		
		int shift = P1048_1 << P1048_2;
		
		System.out.println(shift);
	}
}