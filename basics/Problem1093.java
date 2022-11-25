import java.util.Scanner;

public class Problem1093 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int attendance = sc.nextInt();
		int[] P1093 = new int[23];
		
		for(int i = 0; i < attendance; i++) {
			P1093[sc.nextInt() - 1]++;
		}
		
		for(int i = 0; i < P1093.length; i++) {
			System.out.print(P1093[i] + " ");
		}
		
	}
}