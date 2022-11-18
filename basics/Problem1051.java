import java.util.Scanner;

public class Problem1051 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P1051_1 = sc.nextInt();
		int P1051_2 = sc.nextInt();
		
		int compare = P1051_1 <= P1051_2 ? 1 : 0;
		
		System.out.println(compare);
	}
}