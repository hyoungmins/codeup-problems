import java.util.Scanner;

public class Problem1090 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long P1090_a = sc.nextLong();
		long P1090_r = sc.nextLong();
		long P1090_n = sc.nextLong();
		
		for(int i = 1; i < P1090_n; i++) {
			P1090_a *= P1090_r;
		}
		System.out.println(P1090_a);
	}
}