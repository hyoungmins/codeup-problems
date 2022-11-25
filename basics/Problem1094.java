import java.util.Scanner;

public class Problem1094 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int attendance = sc.nextInt();
		int[] P1094 = new int[attendance];
		
		for(int i = 0; i < P1094.length; i++) {
			P1094[i] = sc.nextInt();
		}
		
		for(int i = P1094.length - 1; i >= 0; i--) {
			System.out.print(P1094[i] + " ");
		}
	}
}