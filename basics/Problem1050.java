import java.util.Scanner;

public class Problem1050 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P1050_1 = sc.nextInt();
		int P1050_2 = sc.nextInt();
		
		int compare = P1050_1 == P1050_2 ? 1 : 0;
		
		System.out.println(compare);
	}
}