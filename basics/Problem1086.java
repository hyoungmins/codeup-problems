import java.util.Scanner;

public class Problem1086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P1086_width = sc.nextInt();
		int P1086_height = sc.nextInt();
		int P1086_bit = sc.nextInt();

		double storage = ((double)P1086_width * P1086_height * P1086_bit);
		double changeByte = storage / 8 / 1024 / 1024;
		
		System.out.printf("%.2f MB", changeByte);
	}
}