import java.util.Scanner;

public class Problem1092 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P1092_a = sc.nextInt();
		int P1092_b = sc.nextInt();
		int P1092_c = sc.nextInt();
		int day = 1;
		
		while(true) {
			if(day % P1092_a == 0 && day % P1092_b == 0 && day % P1092_c == 0) {
				break;
			}
			day++;
		}
		System.out.println(day);
	}
}