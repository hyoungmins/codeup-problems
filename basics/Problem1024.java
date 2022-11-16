import java.util.Scanner;

public class Problem1024 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] P1024 = sc.next().toCharArray();
		
		for(int i=0; i<P1024.length; i++) {
			System.out.println("'" + P1024[i] + "'");
		}
	}
}