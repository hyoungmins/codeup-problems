import java.util.Scanner;

public class Problem1031 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P1031 = sc.nextInt();
		String octal = Integer.toOctalString(P1031);
		
		System.out.println(octal);
	}
}