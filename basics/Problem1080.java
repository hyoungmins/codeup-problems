import java.util.Scanner;

public class Problem1080 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P1080 = sc.nextInt();
		int sum = 0;
		int i = 1;
		
		while(true) {
			sum += i;
			if(sum >= P1080) {
				System.out.println(i);
				break;
			}
			i++;
		}
	}
}