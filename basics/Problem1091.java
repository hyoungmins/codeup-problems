import java.util.Scanner;

public class Problem1091 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long P1091_a = sc.nextLong();
		long P1091_m = sc.nextLong();
		long P1091_d = sc.nextLong();
		long P1091_n = sc.nextLong();
		
		for(int i = 1; i < P1091_n; i++) {
			P1091_a *= P1091_m;
			P1091_a += P1091_d;
		}
		System.out.println(P1091_a);
	}
}