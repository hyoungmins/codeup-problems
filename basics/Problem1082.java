import java.util.Scanner;

public class Problem1082 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P1082 = sc.nextInt(16);
		String hex_a = Integer.toHexString(P1082).toUpperCase();
		
		for(int i = 0x1; i <= 0xF; i++) {
			int multi = P1082 * i;
			
			String hex_b = Integer.toHexString(i).toUpperCase();
			String hex_c = Integer.toHexString(multi).toUpperCase();
			
			System.out.println(hex_a + "*" + hex_b + "="+ hex_c);
		}
	}
}