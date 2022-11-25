import java.util.Scanner;

public class Problem1083 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P1083 = sc.nextInt();
		
		for(int i = 1; i <= P1083; i++) {
			int threeSixNine = i;
					
			if(threeSixNine % 3 == 0) {
				System.out.print("X" + " ");
			} else {
				System.out.print(threeSixNine + " ");
			}
		}
	}
}