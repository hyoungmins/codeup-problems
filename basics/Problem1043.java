import java.util.Scanner;

public class Problem1043 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P1043_1 = sc.nextInt();
		int P1043_2 = sc.nextInt();
		
		int remainder = P1043_1 % P1043_2;
		
		System.out.println(remainder);
	}
}