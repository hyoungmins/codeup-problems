import java.util.Scanner;

public class Problem1068 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P1068 = sc.nextInt();
				
		if(P1068 >= 90) {
			System.out.println("A");
		} else if(P1068 >= 70) {
			System.out.println("B");
		} else if(P1068 >= 40) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
	}
}