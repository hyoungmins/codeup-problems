import java.util.Scanner;

public class Problem1058 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P1058_1 = sc.nextInt();
		int P1058_2 = sc.nextInt();
		
		int reverseIntersection = (P1058_1 == 0) && (P1058_2 == 0) ? 1 : 0;
		
		System.out.println(reverseIntersection);
	}
}