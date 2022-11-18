import java.util.Scanner;

public class Problem1057 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P1057_1 = sc.nextInt();
		int P1057_2 = sc.nextInt();
		
		int notExclusive = !((P1057_1 == 0 && P1057_2 == 1) || (P1057_1 == 1 && P1057_2 == 0)) ? 1 : 0;
		
		System.out.println(notExclusive);
	}
}