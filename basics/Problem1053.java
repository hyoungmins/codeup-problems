import java.util.Scanner;

public class Problem1053 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P1053 = sc.nextInt();
		
		int not = !(P1053 == 1) ? 1 : 0;
		
		System.out.println(not);
	}
}