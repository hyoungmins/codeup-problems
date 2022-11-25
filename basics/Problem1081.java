import java.util.Scanner;

public class Problem1081 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P1081_a = sc.nextInt();
		int P1081_b = sc.nextInt();
		
		for(int i = 1; i <= P1081_a; i++) {
			for(int j = 1; j <=P1081_b; j++) {
				if(P1081_a >= i) {
					System.out.println(i + " " + j);
				}
			}
		}
	}
}