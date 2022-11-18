import java.util.Scanner;

public class Problem1064 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P1064_1 = sc.nextInt();
		int P1064_2 = sc.nextInt();
		int P1064_3 = sc.nextInt();
		
		int ternary = (P1064_1 > P1064_2 ? P1064_2 : P1064_1) > P1064_3 ? P1064_3 : (P1064_1 > P1064_2 ? P1064_2 : P1064_1);
		
		System.out.println(ternary);
	}
}