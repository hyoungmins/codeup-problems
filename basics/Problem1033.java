import java.util.Scanner;

public class Problem1033 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P1033 = sc.nextInt();
		String hex = Integer.toHexString(P1033).toUpperCase();
		
		System.out.println(hex);
	}
}