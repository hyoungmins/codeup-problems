import java.util.Scanner;

public class Problem1095 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int attendance = sc.nextInt();
		int[] P1095 = new int[attendance];
		int maxNumber = 23;
		
		for(int i = 0; i < P1095.length; i++) {
			P1095[i] = sc.nextInt();
			
			if(P1095[i] < maxNumber) {
				maxNumber = P1095[i];
			}
		}
		System.out.println(maxNumber);
	}
}