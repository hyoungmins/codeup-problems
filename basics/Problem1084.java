import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Problem1084 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P1084_r = sc.nextInt();
		int P1084_g = sc.nextInt();
		int P1084_b = sc.nextInt();
		
		//(BufferedWriter를 이용하면 더 효율적인 코드를 만들 수 있다.
		
		for(int i = 0; i < P1084_r; i++) {
			for(int j = 0; j < P1084_g; j++) {
				for(int k = 0; k < P1084_b; k++) {
					System.out.println(i + " " + j + " " + k);
				}
			}
		}
		System.out.println(P1084_r * P1084_g * P1084_b);
	}
}