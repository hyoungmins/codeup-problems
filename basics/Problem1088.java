import java.util.Scanner;

public class Problem1088 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P1088 = sc.nextInt();
		int i = 0;
		
		while(P1088 > i) {
			i++;
			if(i % 3 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
	}
}