import java.util.Scanner;

public class Problem1052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P1052_1 = sc.nextInt();
		int P1052_2 = sc.nextInt();
		
		int compare = P1052_1 != P1052_2 ? 1 : 0;
		
		System.out.println(compare);
	}
}