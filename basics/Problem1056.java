import java.util.Scanner;

public class Problem1056 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P1056_1 = sc.nextInt();
		int P1056_2 = sc.nextInt();
		
		int exclusive = (P1056_1 == 0 && P1056_2 == 1) || (P1056_1 == 1 && P1056_2 == 0) ? 1 : 0;
		
		System.out.println(exclusive);
	}
}