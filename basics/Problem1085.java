import java.util.Scanner;

public class Problem1085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P1085_hz = sc.nextInt();
		int P1085_bit = sc.nextInt();
		int P1085_c = sc.nextInt();
		int P1085_s = sc.nextInt();

		double storage = ((double)P1085_hz * P1085_bit * P1085_c * P1085_s);
		double changeByte = storage / 8 / 1024 / 1024;
		
		System.out.printf("%.1f MB", changeByte);
	}
}