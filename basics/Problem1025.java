import java.util.Scanner;

public class Problem1025 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] P1025 = sc.next().toCharArray();
		System.out.println("[" + P1025[0] + "0000]");
		System.out.println("[" + P1025[1] + "000]");
		System.out.println("[" + P1025[2] + "00]");
		System.out.println("[" + P1025[3] + "0]");
		System.out.println("[" + P1025[4] + "]");
	}
}