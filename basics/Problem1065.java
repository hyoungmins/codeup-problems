import java.util.Scanner;

public class Problem1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P1065_a = sc.nextInt();
		int P1065_b = sc.nextInt();
		int P1065_c = sc.nextInt();
				
		if(P1065_a % 2 == 0) {
			System.out.println(P1065_a);
		}
		
		if(P1065_b % 2 == 0) {
			System.out.println(P1065_b);
		}
		
		if(P1065_c % 2 == 0) {
			System.out.println(P1065_c);
		}
	}
}