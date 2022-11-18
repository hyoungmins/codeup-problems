import java.util.Scanner;

public class Problem1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P1046_1 = sc.nextInt();
		int P1046_2 = sc.nextInt();
		int P1046_3 = sc.nextInt();
		
		int sum = P1046_1 + P1046_2 + P1046_3;
		double avg = (double) sum / 3;
		
		System.out.println(sum);
		System.out.printf("%.1f", avg);
	}
}