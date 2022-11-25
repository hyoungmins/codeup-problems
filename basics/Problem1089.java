import java.util.Scanner;

public class Problem1089 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P1089_a = sc.nextInt();
		int P1089_d = sc.nextInt();
		int P1089_n = sc.nextInt();
		
		for(int i = 1; i < P1089_n; i++) {
			P1089_a += P1089_d;
		}
		System.out.println(P1089_a);
	}
}