import java.util.Scanner;

public class Problem1055 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P1055_1 = sc.nextInt();
		int P1055_2 = sc.nextInt();
		
		int union = (P1055_1 == 1) || (P1055_2 == 1) ? 1 : 0;
		
		System.out.println(union);
	}
}