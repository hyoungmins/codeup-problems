import java.util.Scanner;

public class Problem1054 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P1054_1 = sc.nextInt();
		int P1054_2 = sc.nextInt();
		
		int intersection = (P1054_1 == 1) && (P1054_2 == 1) ? 1 : 0;
		
		System.out.println(intersection);
	}
}