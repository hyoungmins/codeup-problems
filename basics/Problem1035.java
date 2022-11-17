import java.util.Scanner;

public class Problem1035 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String P1035 = sc.next();
		int hex = Integer.parseInt(P1035, 16);
		String hexToOctal = Integer.toOctalString(hex);
		
		System.out.println(hexToOctal);
	}
}