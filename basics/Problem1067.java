import java.util.Scanner;

public class Problem1067 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P1067 = sc.nextInt();
				
		if(P1067 > 0) {
			System.out.println("plus");
			if(P1067 % 2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		} else {
			System.out.println("minus");
			if(P1067 % 2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		}
	}
}